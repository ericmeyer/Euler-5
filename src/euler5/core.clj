(ns euler5.core)

(defn prime-factors [n]
  (if (< n 2)
    [])
  (for [candidate (range 2 (+ remainder 1))]
    (if (= 0 (rem n candidate))
      ((def remainder (/ n candidate))
      (concat [candidate] (prime-factors remainder)))
        [])))
  
(defn euler5 [n]
  1)