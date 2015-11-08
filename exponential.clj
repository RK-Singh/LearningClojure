;; exponentiation of a number and its implementations

;; recursive algo
(defn exp-recur [x n]
	(if (= n 0) 1
		(* x (exp-recur x (dec n)))))

;; iterative algorithm
(defn exp-iter [x n]
	(defn iter [result counter]
		(if (= counter n)
			result
			(iter (* x result) (inc counter))))
	(iter 1 0))
;; fast exponentiation
(defn square [a]
		(* a a))
(defn fast-exp [x n]
	(if (= 0 n) 1 
		(if (even? n)
			(square (fast-exp x (/ n 2)))
			(* x (fast-exp x (dec n))))
		)
	)


;; testing
(println "computing recursively:")
(println (exp-recur 2 0))
(println (exp-recur 2 1))
(println (exp-recur 2 2))
(println (exp-recur 2 3))
(println (exp-recur 2 4))
(println "computing iteratively:")
(println (exp-iter 2 0))
(println (exp-iter 2 1))
(println (exp-iter 2 2))
(println (exp-iter 2 3))
(println (exp-iter 2 4))
(println "computing fastly:")
(println (fast-exp 2 0))
(println (fast-exp 2 1))
(println (fast-exp 2 2))
(println (fast-exp 2 3))
(println (fast-exp 2 4))