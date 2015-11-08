; https://www.hackerrank.com/challenges/fp-filter-array/submissions/

(let [lines (line-seq (java.io.BufferedReader. *in*))] (println (apply str (map (fn [x] (str x "\n"))(
 (fn [d lst](filter (fn [x] (< x d)) lst))

(Integer. (first lines)) (map #(Integer. %) (rest lines)))))))