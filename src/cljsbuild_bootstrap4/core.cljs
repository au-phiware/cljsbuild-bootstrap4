(ns cljsbuild-bootstrap4.core
  (:require [bootstrap]))

(enable-console-print!)

(println "Hello world!")

(-> ".alert" js/jQuery (.alert "close"))
