(defproject cljs-rest-client-server-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]
                 [ring/ring-core "1.4.0"]
                 [ring/ring-json "0.4.0"]
                 [compojure "1.4.0"]]
  :node-dependencies [[source-map-support "0.2.8"]]
  :plugins [[lein-cljsbuild "1.1.3"]
            [lein-ring "0.9.7"]]
  :ring {:handler cljs-rest-client-server-demo.handler/app}
  :source-paths ["src" "target/classes"]
  :clean-targets ["out/cljs_rest_client_server_demo"
                  "cljs_rest_client_server_demo.js"
                  "cljs_rest_client_server_demo.min.js"]
  :cljsbuild {
              :builds [{
                        :id "dev"
                        :source-paths ["src-cljs"]
                        :compiler {
                                   :main cljs-rest-client-server-demo.core
                                   :output-to "out/cljs_rest_client_server_demo.js"
                                   :output-dir "out"
                                   :optimizations :none
                                   :cache-analysis true
                                   :source-map true}}
                       {
                        :id "release"
                        :source-paths ["src-cljs"]
                        :compiler {
                                   :main cljs-rest-client-server-demo.core
                                   :output-to "out-adv/cljs_rest_client_server_demo.min.js"
                                   :output-dir "out-adv"
                                   :optimizations :advanced
                                   :pretty-print false}}]})
