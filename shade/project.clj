(defproject shade "0.2.0-SNAPSHOT"
  :description "Library for relocating namespaces within uberjars"
  :url "https://github.com/redbadger/shade"
  :scm {:dir ".."}
  :license {:name "Eclipse Public License" :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.apache.maven.plugins/maven-shade-plugin "3.0.0"]])
