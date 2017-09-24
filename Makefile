CLJS=cljs.jar

out/main.js: src/cljsbuild_bootstrap4/core.cljs node_modules/bootstrap/dist/js/bootstrap.js
	java -cp $(CLJS):src clojure.main build.clj

node_modules/bootstrap/dist/js/bootstrap.js:
	npm install bootstrap@4.0.0-beta
