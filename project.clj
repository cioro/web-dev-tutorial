(defproject webdev "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring "1.7.0-RC1"]
                 [compojure "1.6.1"]]

  :min-lein-version "2.0.0"

  :uberjar-name "webdev.jar"

  :main webdev.core

  :profiles {:dev
             {:source-paths ["src" "dev"]
              :main webdev.dev}
             :uberjar {:aot :all}}
  )
