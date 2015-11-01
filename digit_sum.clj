;; sum of digits of a number
;; given a number, find the sum of its digits
(defn add-digits [N]
	(loop [sum 0 n N]
		(if (zero? n)
			sum
			(recur (+ sum (rem n 10)) (quot n 10)))))

;; test
(doall (map println (map add-digits (range 1000))))
