(ns reflechant.rgb-to-hex)

(defn normalize [n]
  (cond (< n 0) 0
        (> n 255) 255
        :else n))

(defn hex [n]
  (format "%02X" n))

(defn rgb [r g b]
  (->> [r g b]
       (map normalize)
       (map hex)
       (apply str)))

(comment
  (rgb 255 0 255)
  )