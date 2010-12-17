(ns core-spec
  (:use [speclj.core]
        [euler5.core])
  (:require [euler5.core]))

(describe "divide-if-able"
	(it "divides 8 by 2"
		(should= 4 (divide-if-able 8 2)))
	(it "returns 9"
		(should= 9 (divide-if-able 9 2)))
)

(describe "divide-out"
	(it "divides all multiples of 2"
		(should= [3 2] (divide-out [3 4] 2)))
	(it "gets rid of 1's"
		(should= [3 2] (divide-out [2 3 4] 2)))
)

(describe "common-factors"
	(it "has common factors for 2"
		(should= [2] (common-factors [2])))
	(it "has common factors for 2-3"
		(should= [2 3] (common-factors [2 3])))
	(it "has common factors for 2-4"
		(should= [2 2 3] (common-factors [2 3 4])))
	(it "has common factors for 2-5"
		(should= [2 2 3 5] (common-factors [2 3 4 5])))
	(it "handles out of order"
		(should= [2 2 3 5] (common-factors [5 3 4 2])))
	(it "has common factors for 2-10"
		(should= [2 2 2 3 3 5 7] (common-factors [2 3 4 5 6 7 8 9 10])))
)

(describe "Euler 5 - smallest number that can be divided by each of the numbers from 1 to 20"
  (it "calculates 1"
    (should= 1 (euler5 1)))
	(it "calculates 2"
		(should= 2 (euler5 2)))
	(it "calculates 3"
		(should= 6 (euler5 3)))
	(it "calculates 4"
		(should= 12 (euler5 4)))
	(it "calculates 20"
		(should= 232792560 (euler5 20)))
)

(run-specs)
