(ns cljsbuild-bootstrap4.core
  (:require [jquery] [bootstrap]))

(enable-console-print!)

(println "Hello world!")

(-> ".alert" jquery (.alert "close"))
