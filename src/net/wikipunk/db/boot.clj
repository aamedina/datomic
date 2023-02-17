(ns net.wikipunk.db.boot
  {:rdf/type :jsonld/Context})

(def db
  {:rdf/type    :rdfa/PrefixMapping
   :rdfa/prefix "db"
   :rdfa/uri    "https://wikipunk.net/db/"})

(def db.alter
  "alter"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.alter",
   :rdfa/uri    "https://wikipunk.net/db/alter/"})

(def db.attr
  "attr"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.attr",
   :rdfa/uri    "https://wikipunk.net/db/attr/"})

(def db.bootstrap
  "bootstrap"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.bootstrap",
   :rdfa/uri    "https://wikipunk.net/db/bootstrap/"})

(def db.cardinality
  "cardinality"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.cardinality",
   :rdfa/uri    "https://wikipunk.net/db/cardinality/"})

(def db.entity
  "entity"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.entity",
   :rdfa/uri    "https://wikipunk.net/db/entity/"})

(def db.excise
  "excise"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.excise",
   :rdfa/uri    "https://wikipunk.net/db/excise/"})

(def db.install
  "install"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.install",
   :rdfa/uri    "https://wikipunk.net/db/install/"})

(def db.part
  "part"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.part",
   :rdfa/uri    "https://wikipunk.net/db/part/"})

(def db.type
  "type"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.type",
   :rdfa/uri    "https://wikipunk.net/db/type/"})

(def db.unique
  "unique"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "db.unique",
   :rdfa/uri    "https://wikipunk.net/db/unique/"})

(def fressian
  "fressian"
  {:rdf/type    :rdfa/PrefixMapping,
   :rdfa/prefix "fressian",
   :rdfa/uri    "https://wikipunk.net/fressian/"})
