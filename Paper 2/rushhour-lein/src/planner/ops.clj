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
            (at ?vx2 ?y ?v)
            (clear-me ?vx ?y ?v)
            (isa ?v vehicle)
            (:guard (and
                      (not= (? x) (? nx1) (? nx2))
                      (= 1
                         (abs (- (? nx1) (? nx2)))
                         (abs (- (? x) (? nx1)))
                         (abs (- (? vx1) (? vx2))))
                      (or (= (? vx1) (? vx))
                          (= (? vx2) (? vx)))
                      (> (abs (- (? x) (? nx2)))
                         (abs (- (? x) (? nx1))))
                      (> (abs (- (? x) (? vx1)))
                         (abs (- (? nx1) (? vx1)))))))
     :post (
            (protected ?x ?y ?v)
            (at ?nx1 ?y ?v)
            )
     :pre (
           (at ?nx1 ?y ?v)
           (at ?x ?y none)
           (protected ?x ?y ?v)
           )
     :del (
           (at ?nx2 ?y ?v)
           (at ?x ?y none)
           )
     :add (
           (at ?x ?y ?v)
           (at ?nx2 ?y none)
           )
     :cmd ((move ?v ?x ?y))
     :txt ((?v moves to ?x ?y))
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
            (at ?x ?vy2 ?v)
            (clear-me ?x ?vy ?v)
            (isa ?v vehicle)
            (:guard (and
                      (not= (? y) (? ny1) (? ny2))
                      (= 1
                        (abs (- (? ny1) (? ny2)))
                        (abs (- (? y) (? ny1)))
                        (abs (- (? vy1) (? vy2))))
                      (or (= (? vy1) (? vy))
                          (= (? vy2) (? vy)))
                      (> (abs (- (? y) (? ny2)))
                         (abs (- (? y) (? ny1))))
                      (> (abs (- (? y) (? vy1)))
                         (abs (- (? ny1) (? vy1)))))))
     :post (
            (protected ?x ?y ?v)
            (at ?x ?ny1 ?v)
            )
     :pre (
           (at ?x ?ny1 ?v)
           (at ?x ?y none)
           (protected ?x ?y ?v)
           )
     :del (
           (at ?x ?ny2 ?v)
           (at ?x ?y none)
           )
     :add (
           (at ?x ?y ?v)
           (at ?x ?ny2 none)
           )
     :cmd ((move ?v ?x ?y))
     :txt ((?v moves to ?x ?y))
     }

    :branch-horiz
    {
     :name branch-horiz
     :achieves (at ?x ?y ?tv)
     :when ((at ?x ?y ?av)
            (isa ?av vehicle)
            (orientation ?av horiz)
            (max-size ?sx ?sy))
     :post ((clear-me ?x ?y ?av)
            (at ?sx ?y ?av)
            (cleared ?x ?y ?av)
            (at 0 ?y ?av)
            (cleared ?x ?y ?av)
            (at ?x ?y ?tv)
            )
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
     :post ((clear-me ?x ?y ?av)
            (at ?x ?sy ?av)
            (cleared ?x ?y ?av)
            (at ?x 0 ?av)
            (cleared ?x ?y ?av)
            (at ?x ?y ?tv)
            )
     :pre ()
     :del ()
     :add ()
     :cmd ()
     :txt ()
     }

    :protect
    {
     :name protect
     :achieves (protected ?x ?y ?v)
     :add ((protected ?x ?y ?v))
     }

    :clear-me
    {
     :name clear-me
     :achieves (clear-me ?x ?y ?v)
     :add ((clear-me ?x ?y ?v))
     }

    :cleared
    {
     :name cleared
     :achieves (cleared ?x ?y ?v)
     :when (
            (at ?x ?y none)
            )
     :del ((clear-me ?x ?y ?v))
     }
    }
  )
