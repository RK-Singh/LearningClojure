; euler008
; https://www.hackerrank.com/contests/projecteuler/challenges/euler008/
(defn char-to-int [ch]
    (- (int ch) (int \0)))

(defn read-test-case []
    (read-string (read-line)))

(defn read-n-k []
    (map #(read-string %) (clojure.string/split (read-line) #" ")))

(defn gen-subvec [V N k]
    (for [a (range (- N k))] (subvec V a (+ a k))))


(defn get-answer []
    (let [nk (read-n-k) v (map char-to-int (read-line)) ]
        (reduce max (map #(reduce * %) (gen-subvec (vec v) (first nk) (last nk))))))

(doall (repeatedly (read-test-case) #(println (get-answer))))
