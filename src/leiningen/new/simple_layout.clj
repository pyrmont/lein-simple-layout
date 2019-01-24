(ns leiningen.new.simple-layout
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "simple-layout"))

(defn simple-layout
  "FIXME: write documentation"
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' simple-layout project.")
    (->files data
             ["src/{{sanitized}}/foo.clj" (render "foo.clj" data)])))
