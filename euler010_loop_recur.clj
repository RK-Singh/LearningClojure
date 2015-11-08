; euler010: test case #7 time out
; test for primality
(defn prime? [num]
	(cond 
		(<= num 1) false
		(<= num 3) true
		(or (zero? (rem num 2))
			(zero? (rem num 3)))
			false
		:else
		(loop [i 5]
			(if (<= (* i i) num)
				(if (or (zero? (rem num i))
						(zero? (rem num (+ i 2))))
					false
					(recur (+ i 6)))
				true))))
; generate and store all prime numbers
(def primes (loop [prim '[2] i 3]
	(if (> i 1000010)
		prim
	(if (prime? i)
		(recur (conj prim i) (+ i 2))
		(recur prim (inc i))))))
(def prime-sum (loop [prime-sum ]))
; iterative solve
(defn iter-solve[N]
	(loop [result 0 i 0]
		(if (> (nth primes i) N)
			result
		(recur (+ result (nth primes i)) (inc i) ))))

(loop [T (Integer. (read-line))]
	(if (> T 0)
		(do
			(println (iter-solve (Integer. (read-line))))
		(recur (dec T)))))