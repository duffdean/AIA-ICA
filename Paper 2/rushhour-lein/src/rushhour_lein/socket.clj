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
