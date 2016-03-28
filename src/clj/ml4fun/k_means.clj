(ns ml4fun.k-means
  (:require [clojure.pprint :refer [pprint]]
            [clojure.tools.reader.edn :as edn]))

(defn dist- [[x1 y1] [x2 y2]]
  (+ (* (- x1 x2) (- x1 x2))
     (* (- y1 y2) (- y1 y2))))


(defn k-means [input centers]
  (count input))



