;; fibonacci numbers
(defn fibonacci-recur [n]
	(if (< n 1)
		1
		(+ (fibonacci-recur (- n 1))
		 	(fibonacci-recur (- n 2)))))

;; iterative fibonacci numbers

(defn fibonacci-iter [n]
	(defn iter [a b counter]
		(if (> counter n) a
			(iter b (+ a b) (inc counter))))
	(iter 1 1 0))

(println "computing iteratively:")
(println (fibonacci-iter 6))
(println (fibonacci-iter 7))
(println (fibonacci-iter 8))

(println "computing recursively")
(println (fibonacci-recur 6))
(println (fibonacci-recur 7))
(println (fibonacci-recur 8))
