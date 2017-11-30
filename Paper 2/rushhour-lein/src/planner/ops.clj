(ns planner.ops
  (:require [cgsx.tools.matcher :refer :all])
  )

(def planner-ops
  '{
    move-east {
               :name move-east
               :achieves (at (?x-west-old ?y) none)
               :when (
                      (at (?x-east-old ?y) ?v)
                      (at (?x-west-old ?y) ?v)
                      (at (?x-east ?y) none)
                      (isa ?v vehicle)
                      (:guard (and
                                (= 1 (- (? x-east) (? x-east-old)))
                                (= 1 (- (? x-east-old) (? x-west-old)))
                                )
                              )
                      )
               :post (
                      (at (?x-east ?y) none)
                      )
               :pre (
                     (at (?x-east-old ?y))
                     (at (?x-east ?y) none)
                     )
               :del (
                     (at (?x-west-old ?y) ?v)
                     (at (?x-east ?y) none)
                     )
               :add (
                     (at (?x-east ?y) ?v)
                     (at (?x-west-old) none)
                     )
               :cmd ()
               :txt (move ?v to (?x-east ?y))
               }

    move-south {
                :name move-south
                :achieves (at (?x ?y-north-old) none)
                :when (
                       (at (?x ?y-south-old) ?v)
                       (at (?x ?y-north-old) ?v)
                       (at (?x ?y-south) none)
                       (isa ?v vehicle)
                       (:guard (and
                                 (= 1 (- (? x-south) (? x-south-old)))
                                 (= 1 (- (? x-south-old) (? x-south-old)))
                                 )
                               )
                       )
                :post (
                       (at (?x-south ?y) none)
                       )
                :pre (
                      (at (?x-south-old ?y))
                      (at (?x-south ?y) none)
                      )
                :del (
                      (at (?x-north-old ?y) ?v)
                      (at (?x-south ?y) none)
                      )
                :add (
                      (at (?x-south ?y) ?v)
                      (at (?x-north-old) none)
                      )
                :cmd ()
                :txt (move ?v to (?x-south ?y))
                }
    }
  )
