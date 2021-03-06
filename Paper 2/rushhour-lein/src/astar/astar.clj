(ns astar.astar
    (:require [cgsx.tools.matcher :refer :all]
              [clojure.set :refer :all]
              [astar.ops :refer :all]
              ))

(declare astar-apply-op get-locality astar-apply-all)

(def test-ops
  '{:move
    {:range ('((:eval (- (? x) 2)) ?y)
             '((:eval (- (? x) 1)) ?y)
             '((:eval (+ (? x) 1)) ?y)
             '((:eval (+ (? x) 2)) ?y)
             '(?x (:eval (- (? y) 2)))
             '(?x (:eval (- (? y) 1)))
             '(?x (:eval (+ (? y) 1)))
             '(?x (:eval (+ (? y) 2)))
             )
     }
    }
  )

(defn lmg [state]
  (let [s (:state state)
        c (:cost state)]
    (astar-apply-all astar-ops s c)
    )
  )

(defn astar-apply-op [op state cost]
  (mfor* [(:when op) (seq state)]
         (mlet ['?cost cost]
               {:state (union (set (mout (:state (:add op))))
                              (difference state (set (mout (:state (:del op))))))
                :cmd   (mout (:cmd op))
                :txt   (mout (:txt op))
                :cost  (mout (:cost op))
                }
               )
         )
  )

(defn get-locality [co-ordinates range world]
                    (mlet ['(?wx ?wy) co-ordinates]
	                    (intersection world
	                                  (set (mout range)))
                     )
                    )

(defn astar-apply-all [ops state cost]
  (reduce concat
    (map (fn [x] (astar-apply-op (x ops) state cost))
      (keys ops)
      )))
