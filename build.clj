(require 'cljs.build.api)

(cljs.build.api/build "src" {:output-to "out/main.js"
                             :install-deps true
                             :npm-deps {:bootstrap "4.0.0-beta"}})
