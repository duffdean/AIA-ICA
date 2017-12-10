(ns planner.ops
  (:require [cgsx.tools.matcher :refer :all])
  )

(def primary-ops
  '{
    :move-horiz
    {
     :name move-horiz
     :achieves (at ?x ?y ?v)
     :when (
            (at ?x ?y none)
            (at ?nx1 ?y ?_)
            (at ?nx2 ?y ?_)
            (at ?vx1 ?y ?v)
            (isa ?v vehicle)
            (:guard (and
                      (not= (? x) (? nx1) (? nx2))
                      (= 1 (abs (- (? nx1) (? nx2))))
                      (> (abs (- (? x) (? nx2)))
                         (abs (- (? x) (? nx1))))
                      (> (abs (- (? x) (? vx1)))
                         (abs (- (? nx1) (? vx1))))
                      (= 1 (abs (- (? x) (? nx1)))))))
     :post ((at ?nx1 ?y ?v))
     :pre ()
     :del (
           (at ?nx2 ?y ?v)
           )
     :add (
           (at ?x ?y ?v)
           )
     :cmd ((move ?v ?x ?y))
     :txt ((?x ?y cleared for ?v))
     }


    :move-vert
    {
     :name move-vert
     :achieves (at ?x ?y ?v)
     :when (
            (at ?x ?y none)
            (at ?x ?ny1 ?_)
            (at ?x ?ny2 ?_)
            (at ?x ?vy1 ?v)
            (isa ?v vehicle)
            (:guard (and
                      (not= (? y) (? ny1) (? ny2))
                      (= 1 (abs (- (? ny1) (? ny2))))
                      (> (abs (- (? y) (? ny2)))
                         (abs (- (? y) (? ny1))))
                      (> (abs (- (? y) (? vy1)))
                         (abs (- (? ny1) (? vy1))))
                      (= 1 (abs (- (? y) (? ny1)))))))
     :post ((at ?x ?ny1 ?v))
     :pre ()
     :del (
           (at ?x ?ny2 ?v)
           )
     :add (
           (at ?x ?y ?v)
           )
     :cmd ((move ?v ?x ?y))
     :txt ((?x ?y cleared for ?v))
     }

    :branch-horiz
    {
     :name branch-horiz
     :achieves (at ?x ?y ?tv)
     :when ((at ?x ?y ?av)
            (isa ?av vehicle)
            (orientation ?av horiz)
            (max-size ?sx ?sy))
     :post ((at ?sx ?y ?av)
            (at 0 ?y ?av)
            (at ?x ?y ?tv))
     :pre ()
     :del ()
     :add ()
     :cmd ()
     :txt ()
     }

    :branch-vert
    {
     :name branch-vert
     :achieves (at ?x ?y ?tv)
     :when ((at ?x ?y ?av)
            (isa ?av vehicle)
            (orientation ?av vert)
            (max-size ?sx ?sy))
     :post ((at ?x ?sy ?av)
            (at ?x 0 ?av)
            (at ?x ?y ?tv))
     :pre ()
     :del ()
     :add ()
     :cmd ()
     :txt ()
     }
    }
  )
