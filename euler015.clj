; euler015
; https://www.hackerrank.com/contests/projecteuler/challenges/euler015
(defn factorial [N]
	(reduce * (range 1N (inc N))))

(defn comb [n r]
	(quot (factorial n) (* (factorial r) (factorial (- n r)))))

(defn ans [N M]
	(str (rem (comb (+ N M) M) 1000000007)))

(defn solve []
	(let [inp (clojure.string/split (read-line) #" ")]
		(println (ans (Integer. (nth inp 0)) 
					  (Integer. (nth inp 1))
					  ))))

(loop [T (Integer. (read-line))]
	(if (pos? T)
		(do (solve)
		(recur (dec T)))))
