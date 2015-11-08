;;Write a program that takes a positive integer as input and outputs the Fibonacci
;;sequence up to that number
(defn fibonacci-upto-n [N]
	(loop [a 0 b 1 result (vector 0)]
		(if (> b N) result
			(recur b (+ a b) (conj result b)))))

(println (fibonacci-upto-n 0))
(println (fibonacci-upto-n 1))
(println (fibonacci-upto-n 10))
(println (fibonacci-upto-n 8))
(println (fibonacci-upto-n 12345))

