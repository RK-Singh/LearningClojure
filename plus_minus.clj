; solution for hackerrank 
; https://www.hackerrank.com/challenges/plus-minus
(defn hr-run []
	(let [N (read-string (read-line)) 
		numbers (map read-string (clojure.string/split (read-line) #" "))]
		(println (float (/ (count (filter pos? numbers)) N)))
		(println (float (/ (count (filter neg? numbers)) N)))
		(println (float (/ (count (filter zero? numbers)) N)))
		))
        
(hr-run)
