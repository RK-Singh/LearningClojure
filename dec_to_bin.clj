;; convert decimal to binary
(defn dec-to-bin [N]
	(loop [result '() n N]
		(if (zero? n) (clojure.string/join result)
			(recur (conj result (rem n 2)) (quot n 2)))))

;; test
(defn print-binary [arg]
	(println arg))

(doall (map print-binary (map dec-to-bin (range 100))))
;;(println (dec-to-bin 8))