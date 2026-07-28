(ns kotoba.capability.data.cbor-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.data.cbor :as capability]
            [kotoba.core.capability-repository :as repository]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest capability/manifest))))
