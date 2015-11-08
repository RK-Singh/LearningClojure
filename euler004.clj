; euler004
; https://www.hackerrank.com/contests/projecteuler/challenges/euler004/submissions/code/4156568
(def read-int #(read-string (read-line)))					;; read an int from STDIN
(def palindrome? #(= (seq (str % )) (reverse (str %))))		;; test if a number is palindrome
(def product
	(doall 
		(remove 
			#(< % 100000) 
			(filter palindrome? 
				(for [x (range 100 1000) y (range 100 1000)] (* x y))))))
;(println (realized? product))
(defn answer [N]
	(println (reduce max (filter #(< % N) product))))
(doall (repeatedly (read-int) #(answer (read-int))))
