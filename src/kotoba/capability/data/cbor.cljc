(ns kotoba.capability.data.cbor
  "Importable contract for data/cbor."
  (:require [kotoba.core.capability-repository :as repository]))

(def manifest
  (repository/repository-manifest "data/cbor"))
