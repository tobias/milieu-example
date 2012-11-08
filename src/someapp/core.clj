(ns someapp.core
  (:require [milieu.config :as cfg]))

(defn start []
  (println "FROM START :eggs" (cfg/value :eggs)))
