; not working'

; b = N(N-2a)/2(N-a)
(defn get-b [ N a] (quot (* N (- N (* 2 a))) (* 2 (- N a))))
; from a+b+c=N, c = N-a-b
(defn get-c [N a b] (- N a b))

; test if a^2 + b^2 = c^
(def correct? [a b c]
	(= (+ (* a a) (* b b)) (* c c)))
; test if all are positive
(def all-pos? [v]
	(reduce pos? (vec v)))

(defn read-int []
	(read-string (read-line)))

(defn solve [N]
	(def a-vect (range 1 N))
	(def b-vect (map #(get-b N %) (vec a-vect)))
	(def c-vect (map #(get-c N %1 %2) (vec a-vect) (vec b-vect)))
	(def all-vec (map #(vector %1 %2 %3) (vec a-vect) (vec b-vect) (vec c-vect)))
	; filtering errors
	(filter #(correct? (nth % 0) (nth % 1) (nth % 2)) (vec all-vec))
	)


(doall (repeatedly (read-int) #(solve (read-int))))