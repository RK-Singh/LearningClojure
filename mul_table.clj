;; print multiplication table
(defn print-table [M N]
	(loop [m 1]
		(if (<= m M)
			(do (println N "x" m "=" (* m N))
				(recur (inc m))))))

(print-table 20 2)