(ns rushhour-lein.socket
  (:require [sock2.socket :refer :all])
  )

(defn open-socket
  ([] open-socket 2222)
  ([port] (startup-server port))
  )

(defn receive-data
  [socket]
  (println (socket-read socket))
  )

(defn runAstar [worldMap]
  ;get world map number, and run the Astar infrance over that map
  (println ("Astar" + worldMap))
  ;return moves back to the netlogo
  )

(defn runPlanner [worldMap]
  ;get world map number, and run the Astar infrance over that map
  (println ("planner" + worldMap))
  ;return moves back to the netlogo
  )