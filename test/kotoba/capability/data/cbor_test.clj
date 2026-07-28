(ns kotoba.capability.data.cbor-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.capability.data.cbor :as capability]
            [kotoba.core.capability-repository :as repository]
            [kotoba.core.contracts :as contracts]))

(deftest manifest-conforms
  (is (= [] (repository/validate-manifest
             (contracts/capability-contract)
             capability/manifest))))
