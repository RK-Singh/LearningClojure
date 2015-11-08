; euler010
; https://www.hackerrank.com/contests/projecteuler/challenges/euler016/
(defn square [x]
	(* x x))

(defn fast-exp [x n]
	(if (= 0 n) 1 
		(if (even? n)
			(square (fast-exp x (/ n 2)))
			(* x (fast-exp x (dec n))))))

(defn char-to-int [ch]
	(- (int ch) (int \0)))

(defn sum-digits [N]
		(reduce + (map char-to-int (str N))))

(loop [T (Integer. (read-line))]
	(if (pos? T)
		(do (println (sum-digits (fast-exp 2N (Integer. (read-line)))))
		(recur (dec T)))))
