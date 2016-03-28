(ns ml4fun.k-means
  (:require [clojure.pprint :refer [pprint]]
            [clojure.tools.reader.edn :as edn]))

(defn dist [[x1 y1] [x2 y2]]
  (+ (* (- x1 x2) (- x1 x2))
     (* (- y1 y2) (- y1 y2))))

(defn nearest-center [centers n]
  (let [dist-from (partial dist n)]
    (apply min-key dist-from centers)))

(defn centroid [coords]
  (->> coords
       (apply map +)
       (map #(/ % (count coords)))))







(defn k-means [input centers]
  (group-by (partial nearest-center centers) input))








;; (def centers [[10 1] [10 2] [11 1] [11 2]])
;; (def input (user/input :k-means))


;; (def s1 (k-means input centers))
;; (first (vals s1))

