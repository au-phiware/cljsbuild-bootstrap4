(ns cljsbuild-bootstrap4.core
  (:require [bootstrap.alert :as alert]))

(enable-console-print!)

(println "Hello world!")

(-> ".alert" js/jQuery (.alert "close"))
