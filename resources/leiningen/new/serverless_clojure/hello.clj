(ns {{name}}.hello
  (:gen-class
    :methods [^:static [handler [String] String]
                       [handlepojo [{{name}}.MyEvent] String]
                       [handlemap [java.util.Map] String]]))

(defn -handler
  "Simple handler, accepts a <string> and returns 'Hello <string>!'"
  [s]
  (str "Hello " s "!"))

(defn -handlepojo
  "A more complex example that accepts a Java pojo"
  [this event]
  (str "Hello " (.getFirstName event) " " (.getLastName event)))

(defn -handlemap
  "Handle a map rather than a pojo"
  [this event]
  (str "Hello " (into {} event) "!"))
