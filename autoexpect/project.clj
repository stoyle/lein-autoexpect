(defproject lein-autoexpect "1.7.1-SNAPSHOT"
  :description "Automatically run expecations when a source file changes"
  :url "https://github.com/jakemcc/lein-autoexpect"
  :developer "Jake McCrary"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/tools.namespace "0.2.11" :exclusions [org.clojure/clojure]]
                 [leinjacker "0.4.2" :exclusions [org.clojure/clojure]]
                 [jakemcc/clojure-gntp "0.1.1" :exclusions [org.clojure/clojure]]]
  :profiles {:dev {:dependencies [[expectations "2.0.6"]]}}
  :deploy-repositories [["snapshots" {:url "https://clojars.org/repo"
                                      :username :gpg :password :gpg}]
                        ["releases" {:url "https://clojars.org/repo"
                                      :username :gpg :password :gpg}]]
  :scm {:name "git"
        :url "https://github.com/jakemcc/lein-autoexpect"})
