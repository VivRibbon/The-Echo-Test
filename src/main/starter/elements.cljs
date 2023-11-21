(ns starter.elements
  (:require [reagent.dom :as rd]
            [reagent.core :as r]))

(defn nav-menu []
  [:nav.chapter.footnav
   [:div.button-container
    [:button "Back"]
    [:button "Table of Contents"]
    [:button "Home"]
    [:button "Next"]]])
