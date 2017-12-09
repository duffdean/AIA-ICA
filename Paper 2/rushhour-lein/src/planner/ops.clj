(ns planner.ops
  (:require [cgsx.tools.matcher :refer :all])
  )

(def primary-ops
  '{
    :mark-horiz
    {
     :name mark-horiz
     :achieves (at ?x ?y ?v)
     :when (
            (at ?x ?y none)
            (at ?nx ?y ?_)
            (at ?vx ?y ?v)
            (isa ?v vehicle)
            (:guard (and
                     (> (abs (- (? x) (? vx)))
                        (abs (- (? nx) (? vx))))
                     (= 1 (abs (- (? x) (? nx)))))))
     :post ((at ?nx ?y ?v))
     :pre ()
     :del ()
     :add (clear ?x ?y ?v)
     :cmd ()
     :txt ((?x ?y cleared for ?v))
     }


    :mark-vert
    {
     :name mark-vert
     :achieves (at ?x ?y ?v)
     :when (
            (at ?x ?y none)
            (at ?x ?ny ?_)
            (at ?x ?vy ?v)
            (isa ?v vehicle)
            (:guard (and
                     (> (abs (- (? y) (? vy)))
                        (abs (- (? ny) (? vy))))
                     (= 1 (abs (- (? y) (? ny)))))))
     :post ((at ?x ?ny ?v))
     :pre ()
     :del ()
     :add (clear ?x ?y ?v)
     :cmd ()
     :txt ((?x ?y cleared for ?v))
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
            (at ?x 0 ?av))
     :pre ()
     :del ()
     :add ()
     :cmd ()
     :txt ()
     }
    }
  )
