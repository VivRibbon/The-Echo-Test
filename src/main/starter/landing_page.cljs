(ns starter.landing-page
  (:require [reagent.dom :as rd]
            [reagent.core :as r]))

(defn landing-page []
  [:div.landing-page
   [:h1 "The Echo Test"]
   [:sup "A serial novel by Moira Oona Morse"]
   [:ul
    [:li [:h2 [:button.menu-button "Begin"]]]
    [:li [:h2 [:button.menu-button "Table of Contents"]]]
    [:li [:h2 [:button.menu-button "About"]]]]])

(defn toc []
  [:div.toc
   [:h1 "Table of Contents"]])
