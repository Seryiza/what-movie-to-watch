(ns whatmovie.core
  (:require [org.httpkit.server :as http-server]))

(def server* (atom nil))

(defn app [req]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello"})

(defn start-app []
  (comment (start-app))

  (reset! server* (http-server/run-server app {:port 8080})))
