(ns com.example.components.blob-store
  (:require
    [com.fulcrologic.rad.blob-storage :as storage]
    [mount.core :refer [defstate]]))

(defstate temporary-blob-store
  :start
  (storage/transient-blob-store "" 1))

(defstate file-blob-store
  :start
  (storage/transient-blob-store "/files" 10000))

