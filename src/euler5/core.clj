(ns euler5.core)

(defn prime-factors [n]
	(def remainder n)
	(def factors [])
	(defn internal [candidate]
		(def remainder (/ n candidate))
		(vec [candidate]))
	(if (= n 1)
		[]
		(for [candidate (range 2 (+ n 1))]
			(if (= 0 (rem remainder candidate))
				(vec (conj (internal candidate) (prime-factors (/ n candidate))))
				nil))))
;;	return [] if n == 1
;;  (2..n).each do |candidate|
;;    if n % candidate == 0
;;      return [candidate] + prime_factors(n/candidate)
;;    end
;;  end
  
;;(defn prime-factors 
;;  ([n]
;;    (prime-factors [] n 2))
;;  ([factors n candidate]
;;    (cond
;;      (= n 1) factors
;;      (= 0 (rem n candidate)) (recur (conj factors candidate) (quot n candidate) candidate)
;;      (> candidate (Math/sqrt n)) (conj factors n)
;;      :else (recur factors n (inc candidate))
;;      )
;;    )
;;  )

