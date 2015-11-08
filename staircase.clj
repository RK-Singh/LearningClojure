; solution for hackerrank
; https://www.hackerrank.com/challenges/staircase
(use '[clojure.string :only (join split)])
(defn print-stairs [N]
	(loop [a 1]
		(if (<= a N)
			(do (println (format "%s%s" (join (repeat (- N a) " ")) (join (repeat a "#"))))
		(recur (inc a))))))


(print-stairs (read-string (read-line)))

