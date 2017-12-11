(ns astar.ops
  (:require [cgsx.tools.matcher :refer :all]
            [clojure.set :refer :all]))

(def astar-ops
  '{
    :move-horiz
    {:name move-horiz
     :when (
            (at ?vx1 ?y ?v)
            (at ?vx2 ?y ?v)
            (isa ?v vehicle)
            (at ?nx ?y none)
            (:guard (= 1
                       (abs (- (? vx1) (? vx2)))
                       (abs (- (? nx) (? vx1))))))
     :add {:state ((at ?nx ?y ?v)
                   (at ?vx2 ?y none))}
     :del {:state ((at ?nx ?y none)
                   (at ?vx2 ?y ?v))}
     :cmd ((move ?v to ?nx ?y))
     :txt ((?v moves to ?nx ?y))
     :cost 1
     }

    :move-vert
    {:name move-vert
     :when (
            (at ?x ?vy1 ?v)
            (at ?x ?vy2 ?v)
            (isa ?v vehicle)
            (at ?x ?ny none)
            (:guard (= 1
                       (abs (- (? vy1) (? vy2)))
                       (abs (- (? ny) (? vy1))))))
     :add {:state ((at ?x ?ny ?v)
                   (at ?x ?vy2 none))}
     :del {:state ((at ?x ?ny none)
                   (at ?x ?vy2 ?v))}
     :cmd ((move ?v to ?x ?ny))
     :txt ((?v moves to ?x ?ny))
     :cost 1
     }
    }
  )
