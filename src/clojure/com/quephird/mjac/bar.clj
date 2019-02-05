(ns com.quephird.mjac.bar
 (:gen-class)
 (:import [com.quephird.mjac Foo Dove])
  ;(:import [com.quephird.mjac Dizz])
  )

(defn -main [& args]
  (println "I am in bar.clj!!!")
  ;(let [foo (Foo.)]
  ;  (.saySomething foo)
  ;  )

  (let [dove (Dove.)]
    (.saySomething dove)
    )
  )


(defn transform* [person]
  (-> person
      (assoc :hair-color :gray)
      ))