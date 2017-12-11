(ns rushhour-lein.core
  (:gen-class)
  (:require [math.math :refer :all]
            [rushhour-lein.socket :refer :all]
            [data.world :refer :all]
            [cgsx.tools.matcher :refer :all]
            [planner.planner :refer :all]
            [planner.ops :refer :all]
            [astar.astar-search :refer :all]
            [astar.astar :refer :all]
            [astar.ops :refer :all]
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
