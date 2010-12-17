(ns euler5.core)

(defn divide-if-able [num den]
	(if (= 0 (rem num den))
		(/ num den)
		num))

(defn divide-out [composite-numbers factor]
	(remove #(= 1 %) (map #(divide-if-able % factor) composite-numbers)))
	
(defn common-factors [composite-numbers]
	(defn common [composite-numbers factors]
		(if (= (count composite-numbers) 0)
			(sort factors)
			(common (divide-out composite-numbers (first composite-numbers)) (conj factors (first composite-numbers)))))
	(common (sort composite-numbers) []))
	
(defn euler5 [n]
	(reduce #(* %1 %2) (common-factors (range 1 (+ n 1)))))
	
(defn -main [& args]
	(euler5 20))