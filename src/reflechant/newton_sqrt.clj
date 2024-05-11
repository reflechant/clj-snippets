(ns reflechant.newton-sqrt
  "Isaac Newton's square root algorithm")

(def epsilon 0.00001)

(defn sqrt-good-enough? [n guess]
  (> epsilon (abs (- n (* guess guess)))))

(defn avg [x y]
  (/ (+ x y) 2))

(defn sqrt
  ([n] (sqrt n (/ n 2)))
  ([n guess]
   (if (sqrt-good-enough? n guess)
     guess
     (recur n (avg guess (/ n guess))))))

(comment
  (float (sqrt 16))
  ;; => 4.0
  (sqrt 2)
  ;; => 577/408
  (float (sqrt 2))
  ;; => 1.4142157
  (sqrt 2.0)
  ;; => 1.4142156862745097
  )