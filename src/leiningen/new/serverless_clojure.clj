(ns leiningen.new.serverless-clojure
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "serverless-clojure"))

(defn serverless-clojure
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' serverless-clojure project.")
    (->files data
             ["README.md" (render "README.md" data)]
             ["LICENSE" (render "LICENSE" data)]
             ["project.clj" (render "project.clj" data)]
             ["Serverless.yml" (render "Serverless.yml" data)]
             ["src/main/clojure/{{sanitized}}/hello.clj" (render "hello.clj" data)]
             ["src/main/java/{{sanitized}}/MyEvent.java" (render "java/MyEvent.java" data)])))
