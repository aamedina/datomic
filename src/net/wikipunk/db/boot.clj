(ns net.wikipunk.db.boot
  {:rdf/type :jsonld/Context})

(def db
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/uri    "https://wikipunk.net/db/"
   :rdfa/prefix "db"})
