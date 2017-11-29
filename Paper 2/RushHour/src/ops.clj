(ns ops)

(def states
  '{
    move-x {
            :pre (
                   (single-y (vehcile ?v))
                   (space-empty (origin-x ?a) (dest-x ?b))
                   (space-empty (dest-front ?a) (dest-rear ?b))
                   )
            :add (x ?v (dest-front-x ?a) (dest-rear-x ?b))
            :del (x ?v (origin-front-x ?a) (origin-rear-x ?b))
            :txt (x ?v  has moved to... Xcoord?)
            }

    move-y {
            :pre (
                   (single-x (vehcile ?v))
                   (space-empty (origin-y ?a) (dest-y ?b))
                   (space-empty (dest-front ?a) (dest-rear ?b))
                   )
            :add (y ?v (dest-front-x ?a) (dest-rear-x ?b))
            :del (y ?v (origin-front-x ?a) (origin-rear-x ?b))
            :txt (y ?v  has moved to... Ycoord?)
            }

    exit   {
            :pre (
                   (exit (x ?x) (y ?y))
                   (vehicle ?v (at-exit ?y) (at-exit ?b))
                   )
            :add ((solved (at-exit ?y) (at-exit ?b)))
            :del ()
            :txt ()
            }
    })