; euler010
; naive implementation working for 6/7 test cases

; string to int
(defn parseInt [N]
	(Integer. N))
; print using System.out.println
(defn printLn [N]
	(.println (System/out) N))
; br = new java.io.BufferedReader(*in*)
(def br (new java.io.BufferedReader *in*))

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

;(def primes (into [] (filter prime? (range 1000010))))


(def primes (loop [prim '[2] i 3]
	(if (> i 1000010)
		prim
	(if (prime? i)
		(recur (conj prim i) (+ i 2))
		(recur prim (inc i))))))


;(defn solve [N]
;	(reduce + (filter #(<= % N) primes)))

; iterative solve
(defn iter-solve[N]
	(loop [result 0 i 0]
		(if (> (nth primes i) N)
			result
		(recur (+ result (nth primes i)) (inc i) ))))
;read all test cases

(def read-stdin (line-seq br))
(def T (parseInt (nth read-stdin 0)))
(def test-cases
	(loop [t [] i 1]
		(if (>= i T) t (recur (conj t (parseInt (nth read-stdin i))) (inc i)))))

;(def test-cases (into [] (map parseInt (line-seq br))))

(loop [t (nth test-cases 0) i 1]
	(if (pos? t)
		(do (printLn (iter-solve (nth test-cases i)))
			(recur (dec t) (inc i)))))


;(doall (map printLn (map solve test-cases)))