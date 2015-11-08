; euler001
; https://www.hackerrank.com/contests/projecteuler/challenges/euler001/
; O(1) complexity

(defn sum-multiples [N a]
	(let [n (quot (dec N) a)]
		(* a (quot (* n (inc n)) 2))))


(defn solve []
	(let [N (Integer. (read-line))]
		(println 
			(- 
				(+  (sum-multiples N 3)
					(sum-multiples N 5))
			(sum-multiples N 15)))))

(loop [T (Integer. (read-line))]
	(if (pos? T)
		(do (solve)
		(recur (dec T)))))
