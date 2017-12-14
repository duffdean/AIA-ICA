(ns data.world)

(def test-world
  #{
    (list 'max-size 3 4)
    (list 'at 0 0 'none)
    (list 'at 1 0 'none)
    (list 'at 2 0 'none)
    (list 'at 3 0 'none)
    (list 'at 0 1 'none)
    (list 'at 1 1 'none)
    (list 'at 2 1 'none)
    (list 'at 3 1 'none)
    (list 'at 3 2 'none)
    (list 'at 4 2 'none)
    (list 'isa 4 2 'goal)
    (list 'at 0 3 'none)
    (list 'at 1 3 'none)
    (list 'at 3 3 'none)
    (list 'at 0 4 'none)
    (list 'at 1 4 'none)
    (list 'at 2 4 'none)
    (list 'at 3 4 'none)
    (list 'isa 'pv 'vehicle)
    (list 'colour 'pv 'red)
    (list 'orientation 'pv 'horiz)
    (list 'at 0 2 'pv)
    (list 'at 1 2 'pv)
    (list 'clear-me 0 2 'pv)
    (list 'isa 'npv1 'vehicle)
    (list 'colour 'npv1 'green)
    (list 'orientation 'npv1 'vert)
    (list 'at 2 2 'npv1)
    (list 'at 2 3 'npv1)
    }
 )

;;(pprint (:txt (planner test-world1 (list 'at 8 3 'pv) primary-ops)))
(def test-world1
    #{
      (list 'max-size 7 5)
      ;;y 0 wall
      ;(list 'at 0 0 'none)
      ;(list 'at 1 0 'none)
      ;(list 'at 2 0 'none)
      ;(list 'at 3 0 'none)
      ;(list 'at 4 0 'none)
      ;(list 'at 5 0 'none)
      ;(list 'at 6 0 'none)
      ;(list 'at 7 0 'none)
      ;(list 'at 8 0 'none)
      ;;y 1
      ;(list 'at 0 1 'none) wall
      (list 'at 1 1 'none)
      (list 'at 2 1 'none)
      (list 'at 3 1 'none)
      (list 'at 4 1 'none)
      (list 'at 5 1 'none)
      (list 'at 6 1 'none)
      (list 'at 7 1 'none)
      ;(list 'at 8 1 'none) wall
      ;;y 2
      ;(list 'at 0 2 'none) wall
      (list 'at 1 2 'none)
      (list 'at 2 2 'none)
      (list 'at 3 2 'none)
      (list 'at 4 2 'none)
      (list 'at 5 2 'none)
      (list 'at 6 2 'none)
      (list 'at 7 2 'none)
      ;(list 'at 8 2 'none) wall
      ;;y 3
      ;(list 'at 0 3 'none) wall
      ;(list 'at 1 3 'none)
      ;(list 'at 2 3 'none)
      ;(list 'at 3 3 'none)
      (list 'at 4 3 'none)
      (list 'at 5 3 'none)
      (list 'at 6 3 'none)
      (list 'at 7 3 'none)
      (list 'at 8 3 'none) ;goal
      ;;y 4
      ;(list 'at 0 4 'none) wall
      (list 'at 1 4 'none)
      (list 'at 2 4 'none)
      ;(list 'at 3 4 'none)
      (list 'at 4 4 'none)
      (list 'at 5 4 'none)
      (list 'at 6 4 'none)
      (list 'at 7 4 'none)
      ;(list 'at 8 4 'none) wall
      ;;y 5
      ;(list 'at 0 5 'none) wall
      (list 'at 1 5 'none)
      (list 'at 2 5 'none)
      (list 'at 3 5 'none)
      (list 'at 4 5 'none)
      (list 'at 5 5 'none)
      (list 'at 6 5 'none)
      (list 'at 7 5 'none)
      ;(list 'at 8 5 'none) wall
      ;;y 6 wall
      ;(list 'at 0 6 'none)
      ;(list 'at 1 6 'none)
      ;(list 'at 2 6 'none)
      ;(list 'at 3 6 'none)
      ;(list 'at 4 6 'none)
      ;(list 'at 5 6 'none)
      ;(list 'at 6 6 'none)
      ;(list 'at 7 6 'none)
      ;(list 'at 8 6 'none)

      ;;goal
      (list 'isa 8 3 'goal)

      ;;player vehicle
      (list 'isa 'pv 'vehicle)
      (list 'colour 'pv 'red)
      (list 'orientation 'pv 'horiz)
      (list 'at 1 3 'pv)
      (list 'at 2 3 'pv)
      (list 'clear-me 1 3 'pv)

      ;;other vehicles
      (list 'isa 'npv2 'vehicle)
      (list 'colour 'npv2 'green)
      (list 'orientation 'npv2 'vert)
      (list 'at 3 3 'npv2)
      (list 'at 3 4 'npv2)
      }
  )


;;(pprint (:txt (planner test-world2 (list 'at 8 3 'pv) primary-ops)))
(def test-world2
    #{
      (list 'max-size 7 5)
      ;;y 0 wall
      ;(list 'at 0 0 'none)
      ;(list 'at 1 0 'none)
      ;(list 'at 2 0 'none)
      ;(list 'at 3 0 'none)
      ;(list 'at 4 0 'none)
      ;(list 'at 5 0 'none)
      ;(list 'at 6 0 'none)
      ;(list 'at 7 0 'none)
      ;(list 'at 8 0 'none)
      ;;y 1
      ;(list 'at 0 1 'none) wall
      (list 'at 1 1 'none)
      (list 'at 2 1 'none)
      (list 'at 3 1 'none)
      ;(list 'at 4 1 'none)
      ;(list 'at 5 1 'none)
      (list 'at 6 1 'none)
      (list 'at 7 1 'none)
      ;(list 'at 8 1 'none) wall
      ;;y 2
      ;(list 'at 0 2 'none) wall
      (list 'at 1 2 'none)
      (list 'at 2 2 'none)
      (list 'at 3 2 'none)
      (list 'at 4 2 'none)
      ;(list 'at 5 2 'none)
      (list 'at 6 2 'none)
      (list 'at 7 2 'none)
      ;(list 'at 8 2 'none) wall
      ;;y 3
      ;(list 'at 0 3 'none) wall
      ;(list 'at 1 3 'none)
      ;(list 'at 2 3 'none)
      (list 'at 3 3 'none)
      ;(list 'at 4 3 'none)
      ;(list 'at 5 3 'none)
      (list 'at 6 3 'none)
      (list 'at 7 3 'none)
      (list 'at 8 3 'none) ;goal
      ;;y 4
      ;(list 'at 0 4 'none) wall
      (list 'at 1 4 'none)
      (list 'at 2 4 'none)
      (list 'at 3 4 'none)
      ;(list 'at 4 4 'none)
      (list 'at 5 4 'none)
      (list 'at 6 4 'none)
      (list 'at 7 4 'none)
      ;(list 'at 8 4 'none) wall
      ;;y 5
      ;(list 'at 0 5 'none) wall
      (list 'at 1 5 'none)
      (list 'at 2 5 'none)
      (list 'at 3 5 'none)
      ;(list 'at 4 5 'none)
      ;(list 'at 5 5 'none)
      (list 'at 6 5 'none)
      (list 'at 7 5 'none)
      ;(list 'at 8 5 'none) wall
      ;;y 6 wall
      ;(list 'at 0 6 'none)
      ;(list 'at 1 6 'none)
      ;(list 'at 2 6 'none)
      ;(list 'at 3 6 'none)
      ;(list 'at 4 6 'none)
      ;(list 'at 5 6 'none)
      ;(list 'at 6 6 'none)
      ;(list 'at 7 6 'none)
      ;(list 'at 8 6 'none)

      ;;goal
      (list 'isa 8 3 'goal)

      ;;player vehicle
      (list 'isa 'pv 'vehicle)
      (list 'colour 'pv 'red)
      (list 'orientation 'pv 'horiz)
      (list 'at 1 3 'pv)
      (list 'at 2 3 'pv)
      (list 'clear-me 1 3 'pv)

      ;;other vehicles
      (list 'isa 'npv2 'vehicle)
      (list 'colour 'npv2 'orange)
      (list 'orientation 'npv2 'vert)
      (list 'at 4 3 'npv2)
      (list 'at 4 4 'npv2)

      (list 'isa 'npv3 'vehicle)
      (list 'colour 'npv3 'green)
      (list 'orientation 'npv3 'vert)
      (list 'at 5 2 'npv3)
      (list 'at 5 3 'npv3)

      (list 'isa 'npv4 'vehicle)
      (list 'colour 'npv4 'crimson)
      (list 'orientation 'npv4 'horiz)
      (list 'at 4 1 'npv4)
      (list 'at 5 1 'npv4)

      (list 'isa 'npv5 'vehicle)
      (list 'colour 'npv5 'yellow)
      (list 'orientation 'npv5 'horiz)
      (list 'at 4 5 'npv5)
      (list 'at 5 5 'npv5)
      }
  )

;;not implemented
;;(pprint (:txt (planner test-world3 (list 'at 8 3 'pv) primary-ops)))
(def test-world3
    #{
      (list 'max-size 7 5)
      ;;y 0 wall
      ;(list 'at 0 0 'none)
      ;(list 'at 1 0 'none)
      ;(list 'at 2 0 'none)
      ;(list 'at 3 0 'none)
      ;(list 'at 4 0 'none)
      ;(list 'at 5 0 'none)
      ;(list 'at 6 0 'none)
      ;(list 'at 7 0 'none)
      ;(list 'at 8 0 'none)
      ;;y 1
      ;(list 'at 0 1 'none) wall
      (list 'at 1 1 'none)
      (list 'at 2 1 'none)
      (list 'at 3 1 'none)
      ;(list 'at 4 1 'none)
      ;(list 'at 5 1 'none)
      (list 'at 6 1 'none)
      (list 'at 7 1 'none)
      ;(list 'at 8 1 'none) wall
      ;;y 2
      ;(list 'at 0 2 'none) wall
      (list 'at 1 2 'none)
      (list 'at 2 2 'none)
      (list 'at 3 2 'none)
      (list 'at 4 2 'none)
      ;(list 'at 5 2 'none)
      (list 'at 6 2 'none)
      (list 'at 7 2 'none)
      ;(list 'at 8 2 'none) wall
      ;;y 3
      ;(list 'at 0 3 'none) wall
      ;(list 'at 1 3 'none)
      ;(list 'at 2 3 'none)
      (list 'at 3 3 'none)
      ;(list 'at 4 3 'none)
      ;(list 'at 5 3 'none)
      (list 'at 6 3 'none)
      (list 'at 7 3 'none)
      (list 'at 8 3 'none) ;goal
      ;;y 4
      ;(list 'at 0 4 'none) wall
      (list 'at 1 4 'none)
      (list 'at 2 4 'none)
      (list 'at 3 4 'none)
      ;(list 'at 4 4 'none)
      (list 'at 5 4 'none)
      (list 'at 6 4 'none)
      (list 'at 7 4 'none)
      ;(list 'at 8 4 'none) wall
      ;;y 5
      ;(list 'at 0 5 'none) wall
      (list 'at 1 5 'none)
      (list 'at 2 5 'none)
      (list 'at 3 5 'none)
      ;(list 'at 4 5 'none)
      ;(list 'at 5 5 'none)
      (list 'at 6 5 'none)
      (list 'at 7 5 'none)
      ;(list 'at 8 5 'none) wall
      ;;y 6 wall
      ;(list 'at 0 6 'none)
      ;(list 'at 1 6 'none)
      ;(list 'at 2 6 'none)
      ;(list 'at 3 6 'none)
      ;(list 'at 4 6 'none)
      ;(list 'at 5 6 'none)
      ;(list 'at 6 6 'none)
      ;(list 'at 7 6 'none)
      ;(list 'at 8 6 'none)

      ;;goal
      (list 'isa 8 3 'goal)

      ;;player vehicle
      (list 'isa 'pv 'vehicle)
      (list 'colour 'pv 'red)
      (list 'orientation 'pv 'horiz)
      (list 'at 1 3 'pv)
      (list 'at 2 3 'pv)
      (list 'clear-me 1 3 'pv)

      ;;other vehicles
      (list 'isa 'npv2 'vehicle)
      (list 'colour 'npv2 'orange)
      (list 'orientation 'npv2 'vert)
      (list 'at 4 3 'npv2)
      (list 'at 4 4 'npv2)

      (list 'isa 'npv3 'vehicle)
      (list 'colour 'npv3 'green)
      (list 'orientation 'npv3 'vert)
      (list 'at 5 2 'npv3)
      (list 'at 5 3 'npv3)

      (list 'isa 'npv4 'vehicle)
      (list 'colour 'npv4 'crimson)
      (list 'orientation 'npv4 'horiz)
      (list 'at 4 1 'npv4)
      (list 'at 5 1 'npv4)

      (list 'isa 'npv5 'vehicle)
      (list 'colour 'npv5 'yellow)
      (list 'orientation 'npv5 'horiz)
      (list 'at 4 5 'npv5)
      (list 'at 5 5 'npv5)
      }
  )


;;(pprint (:txt (planner test-world4 (list 'at 8 3 'pv) primary-ops)))
(def test-world4
    #{
      (list 'max-size 7 5)
      ;;y 0 wall
      ;(list 'at 0 0 'none)
      ;(list 'at 1 0 'none)
      ;(list 'at 2 0 'none)
      ;(list 'at 3 0 'none)
      ;(list 'at 4 0 'none)
      ;(list 'at 5 0 'none)
      ;(list 'at 6 0 'none)
      ;(list 'at 7 0 'none)
      ;(list 'at 8 0 'none)
      ;;y 1
      ;(list 'at 0 1 'none) wall
      (list 'at 1 1 'none)
      (list 'at 2 1 'none)
      (list 'at 3 1 'none)
      ;(list 'at 4 1 'none)
      (list 'at 5 1 'none)
      (list 'at 6 1 'none)
      (list 'at 7 1 'none)
      ;(list 'at 8 1 'none) wall
      ;;y 2
      ;(list 'at 0 2 'none) wall
      (list 'at 1 2 'none)
      (list 'at 2 2 'none)
      (list 'at 3 2 'none)
      ;(list 'at 4 2 'none)
      (list 'at 5 2 'none)
      (list 'at 6 2 'none)
      (list 'at 7 2 'none)
      ;(list 'at 8 2 'none) wall
      ;;y 3
      ;(list 'at 0 3 'none) wall
      (list 'at 1 3 'none)
      ;(list 'at 2 3 'none)
      ;(list 'at 3 3 'none)
      ;(list 'at 4 3 'none)
      (list 'at 5 3 'none)
      (list 'at 6 3 'none)
      (list 'at 7 3 'none)
      (list 'at 8 3 'none) ;goal
      ;;y 4
      ;(list 'at 0 4 'none) wall
      (list 'at 1 4 'none)
      (list 'at 2 4 'none)
      ;(list 'at 3 4 'none)
      ;(list 'at 4 4 'none)
      (list 'at 5 4 'none)
      (list 'at 6 4 'none)
      (list 'at 7 4 'none)
      ;(list 'at 8 4 'none) wall
      ;;y 5
      ;(list 'at 0 5 'none) wall
      (list 'at 1 5 'none)
      (list 'at 2 5 'none)
      ;(list 'at 3 5 'none)
      ;(list 'at 4 5 'none)
      ;(list 'at 5 5 'none)
      ;(list 'at 6 5 'none)
      ;(list 'at 7 5 'none)
      ;(list 'at 8 5 'none) wall
      ;;y 6 wall
      ;(list 'at 0 6 'none)
      ;(list 'at 1 6 'none)
      ;(list 'at 2 6 'none)
      ;(list 'at 3 6 'none)
      ;(list 'at 4 6 'none)
      ;(list 'at 5 6 'none)
      ;(list 'at 6 6 'none)
      ;(list 'at 7 6 'none)
      ;(list 'at 8 6 'none)

      ;;goal
      (list 'isa 8 3 'goal)

      ;;player vehicle
      (list 'isa 'pv 'vehicle)
      (list 'colour 'pv 'red)
      (list 'orientation 'pv 'horiz)
      (list 'at 3 3 'pv)
      (list 'at 2 3 'pv)
      (list 'clear-me 2 3 'pv)

      ;;other vehicles
      (list 'isa 'npv2 'vehicle)
      (list 'colour 'npv2 'purple)
      (list 'orientation 'npv2 'vert)
      (list 'at 4 1 'npv2)
      (list 'at 4 2 'npv2)

      (list 'isa 'npv3 'vehicle)
      (list 'colour 'npv3 'green)
      (list 'orientation 'npv3 'vert)
      (list 'at 4 3 'npv3)
      (list 'at 4 4 'npv3)

      (list 'isa 'npv4 'vehicle)
      (list 'colour 'npv4 'blue)
      (list 'orientation 'npv4 'vert)
      (list 'at 3 4 'npv4)
      (list 'at 3 5 'npv4)

      (list 'isa 'npv5 'vehicle)
      (list 'colour 'npv5 'crimson)
      (list 'orientation 'npv5 'horiz)
      (list 'at 5 5 'npv5)
      (list 'at 4 5 'npv5)

      (list 'isa 'npv6 'vehicle)
      (list 'colour 'npv6 'orange)
      (list 'orientation 'npv6 'horiz)
      (list 'at 7 5 'npv6)
      (list 'at 6 5 'npv6)

      }
  )
