# lein-simple-layout

A Leiningen template for creating projects with a simple layout.

This template creates a simple project with 3 files: `.gitignore`, 
`project.clj` and `<project-name>.clj`. It's perfect for when you want to hack
on some Clojure code while still retaining the power of Leiningen.

## Usage

By default, the template will create a project with Clojure 1.10.0 as the sole
dependency.

```sh
lein new simple-layout <project-name>
```

You can create a project that uses a different version of Clojure by passing
the optional version argument.

```sh
lein new simple-layout -- 1.9.0
```

## License

The simple-layout template is released into the public domain. See 
[LICENSE.md][lc] for more details.

[lc]: https://github.com/pyrmont/lein-simple-layout/blob/master/LICENSE.md
