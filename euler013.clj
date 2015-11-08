; solution for project euler
; https://www.hackerrank.com/contests/projecteuler/challenges/euler013

(defn get-sum [n]
	(loop [i 1 sum 0N ]
		(if (> i n)
			sum
			(recur (inc i) (+ sum (bigint (read-string (read-line))))))))
(println (clojure.string/join (take 10 (str (get-sum (read-string (read-line)))))))

