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
            (at ?nx ?y ?_)
            (at ?vx1 ?y ?v)
            (at ?vx2 ?y ?v)
            (isa ?v vehicle)
            (:guard (and
                      (= 1 (abs (- (? vx1) (? vx2))))
                      (> (abs (- (? x) (? vx2)))
                         (abs (- (? x) (? vx1))))
                      (> (abs (- (? x) (? vx1)))
                         (abs (- (? nx) (? vx1))))
                      (= 1 (abs (- (? x) (? nx)))))))
     :post ((at ?nx ?y ?v))
     :pre ()
     :del (
           (at ?vx2 ?y ?v)
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
            (at ?x ?ny ?_)
            (at ?x ?vy1 ?v)
            (at ?x ?vy2 ?v)
            (isa ?v vehicle)
            (:guard (and
                      (= 1 (abs (- (? vy1) (? vy2))))
                      (> (abs (- (? x) (? vy2)))
                         (abs (- (? x) (? vy1))))
                      (> (abs (- (? y) (? vy1)))
                         (abs (- (? ny) (? vy1))))
                      (= 1 (abs (- (? y) (? ny)))))))
     :post ((at ?x ?ny ?v))
     :pre ()
     :del (
           (at ?x ?vy2 ?v)
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
