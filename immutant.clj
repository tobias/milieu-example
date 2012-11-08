(ns someapp.init
  (:require [someapp.core :as core]
            [milieu.config :as cfg]
            [immutant.registry :as registry]))

(let [env (-> :project registry/fetch :env)]
  (println "Setting env to" env)
  (binding [cfg/*env* env]
    (println "FROM INIT :ham" (cfg/value :ham))
    (core/start)))
