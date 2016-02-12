;; Aufgabe 1
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


;; Aufgabe 2
;;Gesucht ist eine Funktion pos, die aus einer Liste von Zahlen diejenigen Zahlen zurückgibt,
;;die positiv sind. Programmieren Sie zwei Lösungen: einmal mit und einmal ohne die Funktion filter.
(defn pos [x, list] (filter #(> % x) list))
(pos 0 '(-1 0 1 3))

;; Aufgabe 3
;; Programmieren Sie eine Funktion Last, die das letzte Element einer Liste zurück gibt.
;; Beispiel: (Last '(1 2 3 4)) → 4

;; count elements of a list
(count '(1 2 3 4 5 6))
;; show nth element
(nth '(1 2 3 4 5 6) 0)
(defn last[liste] (nth liste (- (count liste) 1)))

(last '(1 2 3))