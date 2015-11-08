;; given three number test if they can be the sides of a triangle
(defn is-triangle [a b c]
	(let [x (max a b c) y (min a b) x (min a c)]
		(if (> x (+ y z)) true false)))


