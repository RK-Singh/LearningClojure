;; recursive factorial compuation
(defn factorial-recurr [n]
	(if (< n 1) 1
		(* n (factorial-recurr (dec n)))))

;; iterative algorithm to find the factorial of a number
(defn fact-iter [product counter max-count]
	(if (> counter max-count)
		product
		(fact-iter 
			(* product counter)
			(inc counter)
			max-count)))

(defn factorial [n]
	(fact-iter 1 1 n))

;; compact version of factorial
(defn factorial-v2 [x]
	(defn iter [product counter]
		(if (> counter x) product
			(iter (* product counter) (inc counter))))
	(iter 1 1))

(println (factorial 5))
(println (factorial 6))
(println (factorial-v2 7))
(println (factorial-recurr 3))