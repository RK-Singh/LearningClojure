; euler005
; https://www.hackerrank.com/contests/projecteuler/challenges/euler007/
(def read-int #(read-string (read-line)))
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

(def primes (doall (reduce conj '[2 ] (filter prime? (range 3 105000 2)))))
(defn solve []
	(let [case (read-int)]
		(println (nth primes (dec case)))))
(doall (repeatedly (read-int) solve))