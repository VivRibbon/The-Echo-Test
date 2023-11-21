(ns starter.chapter1
  (:require [reagent.dom :as rd]
            [reagent.core :as r]
            [goog.object :as g]))

(defn page1-house-list []
   [:div.chapter.green-subset
    [:h4 "On the balcony:"]
    [:ul
     [:li "Shattered pieces of pots."]
     [:li "Broken floorboards and banisters."]
     [:li "Shredded fabric."]
     [:li "Giant scratches."]
     [:li "A door, still intact."]
     [:li "A doorknocker in the shape of a bird."]]
    [:h4 "In the foyer:"]
    [:ul
     [:li "A burnished silver coat rack."]
     [:li "A marble statue of a four-legged creature with a short tail."]
     [:li "A small table, upon which is a cobwebbed plate and a cracked read tea pot with several flowers painted on it."]]
    [:h4 "In the kitchen:"]
    [:ul
     [:li "A smudged drawing, in smashed frame, which says Ki" [:span.blur.noselect "ss Th"] "e Ch" [:span.blur.noselect "ef!"]
      [:li "Rusted and bloody knives, pots, and pans."]
      [:li "Signs of a struggle."]]]
    [:h4 "In the one remaining bedroom:"]
    [:ul
     [:li "A painting of a wall on which is a painting of two figures in a room full of clocks."]
     [:li "Another painting, which shows a cross-section of an unfamiliar type of building, though it seems like people are living in the rooms."]
     [:li "An empty frame."]
     [:li "A deep red-brown bed frame with no bed."]
     [:li "A single slipper at the foot of the bed."]]])

(defn page1 []
  [:div.chapter
   [:p.fuzzy "The ground twists under my feet. Every day I lose myself. I hold my hand out for you but I am so far away you'll never know I've done so. I am a coin dropped into a well. I love you."]
   [:p "I awoke drowned in kudzu under layers of mist. It felt as if the ice of forgotten ages slashed across my face as I rose from the vines, the cold so strong I briefly considered falling back into the broken green, allowing myself to be taken."]
   [:p "I didn't." [:span.hidden " can you hear me "]]
   [:p "If I sound grimmer than what you are used to, it is in part the weight of recent times on my neck and, in perhaps larger part, my proclivity for dressing up the way I speak. Many people over the years teased me about this, and I remember distinctly one of the things that first endeared me to you is that you didn't."]
   [:p "If anything I felt grimmer at the time of this story than I do now, sitting before this screen. I will judiciously save you a recounting of the swearing and complaining that issued from my mouth as I crawled out of the frozen kudzu."]
   [:p "The sun here doesn't exist. Is it dead? I don't know. The gammits won't tell me. I suspect they also don't know. Everything is grey clouds, mist, frost, and vines. Now and then, if I peer into the steely void, it feels like something looks back. It feel as if I can almost see something impossibly huge moving behind the clouds."]
   [:p "Trudging through these grasping limbs whose only purpose is to pull you below the permafrost is no easy task, especially for a poor poet such as myself. I was never the most physically robust, even during our quest I primarily relied on my knowledge and my relationship with the tangle. None of this is of use in the Overflow, of course." [:span.hidden "   h ello   "]]
   [:p "I was hungry, I remember that. Deathly hungry. Desperately hungry. Was the kudzu edible? Was that exactly what it wanted? Why did it writhe so invitingly, as if urging me to consider taking it into my body? I turned my head to the sky and kept walking. Better to contemplate utter emptiness than the undead resplendence of the kudzu. Better nothing than something trying to pull you into it."]
   [:p "I walked for a long time, or it felt like a long time, with that gnawing in the core of me. Thorns scraped at my legs, the cuts freezing too quickly to even bleed. I felt truly necrotic, so much so that when the mansion yawned above me, I assumed it was a halllucination and barely payed it mind until I felt the splintered wood of the demolished stables stabbing into my shin."]
   [:p [:span.echo "It was then that I truly awoke."] " And there I stood. Legs covered in frozen blood, icicles hanging off my ears, the formerly noble vestment of my station torn to pieces, standing to my knees in frozen vines and splintered wood, with the great broken mansion, torn half to pieces, hanging above me. It looked as if it had been used as a chew toy by some great creature. As did I. I tromped up the creaking balcony of the house."]
   [page1-house-list]
   [:p.fuzzy "What remains for me? To speak of the things that are left? To say my goodbyes? To finish dying? Why? To whom? Is that it?"]])

(defn commentary1 []
  [:div.chapter.commentary
   [:h2 "Commentary"]
   [:p "Hi my name is Flora! I'm a game designer and storyteller and a lot of other things like that, although right now I mostly don't work in any of that kind of stuff. Since I'm transcribing these recordings I thought it would be a good idea for me to drop in along with it so I can talk to you and tell you more about it."]
   [:p "It's pretty rare to come across recordings from the Overflow, especially from someone like Actino Cataphyl, so I knew I had to put them out there, you know? I don't know if Cataphyl will explain where they got the recording equipment, that screen they said they're sitting at. I'm transcribing these and uploading them as I write them because I'm excited and I want to get them out as quickly as possible. It's important! I'm doing something important!"]
   [:p [:a {:href "mailto:blossomkernel@proton.me"} "Btw, if you like the web design let me know. I'm proud of it!"]]])
