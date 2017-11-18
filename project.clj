(defproject install-cacert "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "3.6.1"]
                 [commons-dbcp/commons-dbcp "1.2.2"]]

:user {:repository [["mvncentral" "http://central.maven.org/maven2/"]]}

  :main ^:skip-aot install-cacert.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
