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


;; Aufgabe 4
;; Programmieren Sie eine Funktion brackets, welche als Parameter eine Liste erhält und die
;; jedes Element durch eine Liste mit diesem Element ersetzt.
;; Beispiel: (brackets '(1 2 3 5)) → ((1) (2) (3) (5)) 

;; create list by number
(list 4)
(defn brackets [liste] (map #(list %) liste))
(brackets '(1 2 3))


;; Aufgabe 5
;;Programmieren Sie eine rekursive Funktion, die die Reihenfolge einer Liste umkehrt:
;;Beispiel: (rev '(1 2 3 4)) → (4 3 2 1)
;;Anmerkung: eine einfache Lösung verwendet die Funktion concat zum Konkatenieren
;;zweier Listen

(defn umdrehen[neueliste alteliste] 
  (if (empty? alteliste) neueliste
  (concat (umdrehen neueliste (rest alteliste)) (list(first alteliste)))))

(umdrehen () '(5 4 3 2 1))


;; Aufgabe 6
;;Addieren Sie alle Zahlen bis 1000, die durch 3 oder 5 teilbar sind. In Clojure können Sie die
;;Funktion (rem num div) verwenden, die den Rest bei der Division von num durch div berechnet

(apply + (filter #(or (= 0 (mod % 3))
                      (= 0 (mod % 5)))
                    (range 1 1001)))





