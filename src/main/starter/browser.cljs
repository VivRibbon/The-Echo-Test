(ns starter.browser
  (:require [reagent.dom :as rd]
            [reagent.core :as r]
            [starter.chapter1 :as c1]
            [starter.landing-page :as lp]
            [starter.elements :as e]))

(defn viewport-one []
  [:<>
   [:h2.chapter-header "I: Kudzu"]
   [c1/page1]])

(defn viewport-two []
  [c1/commentary1])

(defn page []
  [:div.page
   [:header
    [:h1 "The Echo Test"]
    [:sup "Being the account of the travels of Actino Cataphyl as transcribed by Flora Karyote"]]
   [viewport-one]
   [:br]
   [viewport-two]
   [:br]
   [e/nav-menu]])

(defn landing []
  [lp/landing-page])

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (rd/render [page] (js/document.getElementById "app")))

(defn init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init")
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))
