;; program to test if a number is prime or not
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

;; test
;; print all prime numbers less than 1000
(doall (map println (filter prime? (range 1000))))