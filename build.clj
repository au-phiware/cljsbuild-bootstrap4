(require 'cljs.build.api)

(cljs.build.api/build "src" {:output-to "out/main.js"
                             :main 'cljsbuild-bootstrap4.core
                             :foreign-libs [{:file "node_modules/bootstrap/js/src/util.js"
                                             :provides ["bootstrap.util"]
                                             :module-type :es6}
                                            {:file "node_modules/bootstrap/js/src/alert.js"
                                             :provides ["bootstrap.alert"]
                                             :requires ["bootstrap.util"]
                                             :module-type :es6}]})
