(ns reflechant.binary-pow
  "binary exponentiation")

(defn pow
  ([n exp] (pow 1 n exp))
  ([acc n exp]
   (cond (zero? exp) acc
         (= 1 exp) (* n acc)
         (even? exp) (recur acc (* n n) (/ exp 2))
         :else (recur (* n acc) (* n n) (/ (dec exp) 2)))))

(comment
  (pow 2 3)
  ;; => 8
  (pow 3 2)
  ;; => 9
)