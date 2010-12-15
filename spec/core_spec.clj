(ns basics-spec
  (:use [speclj.core]
        [euler5.core])
  (:require [euler5.core]))

(describe "Euler 5 - smallest number that can be divided by each of the numbers from 1 to 20"

  (it "calculates 1"
    (should= 1 (euler5 1)))
          
)

(describe "prime-factors"
;;  (it "factors 1"
;;    (should= [] (prime-factors 1)))
;;  (it "factors 2"
;;    (should= [2] (prime-factors 2)))
;;  (it "factors 3"
;;    (should= [3] (prime-factors 3)))
;;  (it "factors 4"
;;    (should= [2 2] (prime-factors 4)))
;;  (it "factors 5"
;;    (should= [5] (prime-factors 5)))
;;  (it "factors 6"
;;    (should= [2 3] (prime-factors 6)))
;;  (it "factors 7"
;;    (should= [7] (prime-factors 7)))
;;  (it "factors 8"
;;    (should= [2 2 2] (prime-factors 8)))
;;  (it "factors 9"
;;    (should= [3 3] (prime-factors 9)))
)

(run-specs)
