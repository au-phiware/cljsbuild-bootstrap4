CLJS=cljs.jar
out/main.js: src/cljsbuild_bootstrap4/core.cljs
	java -cp $(CLJS):src clojure.main build.clj
