(defproject someapp "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [milieu "0.7.0"]]
  :profiles {:dev {:env :dev}
             :prod {:env :prod}
             :test {:env :test}})



