(ns leiningen.new.simple-layout
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "simple-layout"))

(defn simple-layout
  "Generates a simple-layout Leiningen project."
  ([name]
   (simple-layout name "1.10.0"))
  ([name ver]
   (let [data {:name name
               :sanitized (name-to-path name)
               :ver ver}]
     (main/info "Generating fresh 'lein new' simple-layout project.")
     (->files data
              ["{{sanitized}}.clj" (render "foo.clj" data)]
              ["project.clj" (render "project.clj" data)]
              [".gitignore" (render "gitignore" data)]))))
