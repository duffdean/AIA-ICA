(ns rushhour-lein.core
  (:gen-class)
  (:require [rushhour-lein.socket :refer :all]
            [data.world :refer :all]
            )
  )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (println "Opening socket...")
  (def sock (open-socket 2222))
  (println "Done! Awaiting data...")
  (receive-data sock)
  )
