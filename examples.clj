;; Programmieren Sie die Funktion fac zu Berechnung der Fakultät einer Zahl mit und ohne Rekursion.

;; faculty with recursion

(defn facR[x] (
	if (= x 0) 
	1
	(* x (fuck (- x 1)))
	))

(facR 5)

;; faculty function wwithour recursion 
(defn fac [x] (reduce * (range 1 (+ x 1))))
(fac 1)
