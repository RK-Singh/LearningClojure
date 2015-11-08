;==============================================================================
; euler #10: Summation of Primes
; https://www.hackerrank.com/contests/projecteuler/challenges/euler010/
; Sieve complexity O(nloglogn)
; Precomputing sums lookup O(n)
; lookup O(1)
; Note: using 0 => true, 1 => false
; defines the maximum limit
(def MAX 1000000)
; create an array of MAX+1 elements
; because array index begins from 0
(def primes (long-array (long (inc MAX))))
; 0 and 1 are not prime number
(aset-long ^longs primes 0 1)
(aset-long ^longs primes 1 1)
; perform seive
(let [limit (int (inc (Math/sqrt MAX)))]
	(loop [i (int 2)]
		(if (< i limit)
		(do 
            (if (zero? (aget ^longs primes i))
			(loop [k (* i i)]
				(if (< k MAX)
					(do 
                        (aset-long ^longs primes k 1)
						(recur (+ k i)))
                    )))
			(recur (inc i)))
         )))
; precomputing for O(1) lookup
(loop [i (int 0) total (long 0)]
	(if (<= i MAX)
		(if (zero? (aget ^longs primes i))
			(do ; if the given index is prime
				(aset-long ^longs primes i (+ total i))
				(recur (inc i) (+ total i)))
			(do ; if the given index is not prime 
				(aset-long ^longs primes i total)
				(recur (inc i) total)))))
; read and print result for each test case 
(loop [T (Integer. (read-line))]
	(if (> T 0)
		(do
			(println (aget ^longs primes (Integer. (read-line))))
		(recur (dec T)))))
; lookup for answer is done in O(1) time
;==============================================================================