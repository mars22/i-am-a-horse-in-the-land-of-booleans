(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  [x]
  (if (or (nil? x) (false? x))
    false
    true))

(defn abs
  [x]
  (if (< x 0)
    (- x)
    x))

(defn divides?
  [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz
  [n]
  (cond
   (= (mod n 15) 0) "gotcha!"
   (= (mod n 3) 0) "fizz"
   (= (mod n 5) 0) "buzz"
   :else ""
   ))

(defn teen? [age]
  (<= 13 age 19))

(defn not-teen? [age]
  (or (< age 13) (> age 19)))

   

(defn generic-doublificate [x]
  (cond
    (number? x) (* x 2) 
    (empty? x) nil
    (list? x) (* (count x) 2)
    (vector? x) (* (count x) 2)
    :else true
  ))

(defn leap-year? [year]
  ":(")

; '_______'
