(ns ml4fun.core-test
  (:require [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.generators   :as gen]
            [clojure.test.check.properties   :as prop]
            [ml4fun.core              :refer :all]))

(defspec first-element-is-min-after-sorting 100
  (prop/for-all [v (gen/not-empty (gen/vector gen/int))]
    (= (apply min v)
       (first (sort v)))))
