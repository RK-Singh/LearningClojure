; solution for hackerrank
; https://www.hackerrank.com/contests/projecteuler/challenges/euler020

; use of anonymous functions
(def char-to-int #(- (int %) (int \0)))			; convert \i to i
(def num-char? #(Character/isDigit %))			; test if \0 t0 \9
(def factorial #(reduce *' (range 1N (inc %))))	; calc n!
(def sum-of-digits #(reduce +' %))				; calc 123 -> 1+2+3
(def read-int #(read-string (read-line)))		; read an int from STDIN
(def solve-test-case #(println (sum-of-digits (map char-to-int (filter num-char? (str (factorial (read-int))))))))
(doall (repeatedly (read-int) solve-test-case))