/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Puppy
import com.example.androiddevchallenge.models.PuppyCharacteristics

val puppiesData = listOf(
    Puppy(
        "Bru", "Bull",
        listOf(
            PuppyCharacteristics("Age", "3y"),
            PuppyCharacteristics("Personality", "docile"),
            PuppyCharacteristics("Gender", "boy")
        ),
        "Bru first came into Paws when he was about 9 months old, he was with us for over a year and then got a home. Unfortunately it didn’t work out and Bru is now back with us.\n" +
            "\n" +
            "Bru is a very sweet, friendly boy who loves being around people. He isn’t so good with other dogs, especially small ones which is why he needs to be in a home on his own. Bru is quite an anxious dog, he will need some training and time to help him settle, it would also be better if someone is at home most of the time.\n" +
            "\n" +
            "Bru loves going for walks, being a typical bully he is quite strong on the lead, he also likes playing with his toys.\n" +
            "\n" +
            "As a restricted breed Bru must have a muzzle when out in public.",
        R.drawable.pic_bru
    ),
    Puppy(
        "Bo", "Deerhound",
        listOf(
            PuppyCharacteristics("Age", "3.5y"),
            PuppyCharacteristics("Size", "medium"),
            PuppyCharacteristics("Gender", "boy")
        ),
        "Bo was surrendered into us 2 weeks ago as his owners couldn’t keep him any longer. He is a lovely friendly boy who gets on well with females. Bo is confident and would be happy in a home on his own or with another medium to large female.\n" +
            "\n" +
            "Bo is looking for an active family, who have experience with sighthounds.",
        R.drawable.pic_bo
    ),
    Puppy(
        "Bella", "Bull",
        listOf(
            PuppyCharacteristics("Age", "4y"),
            PuppyCharacteristics("Personality", "friendly"),
            PuppyCharacteristics("Gender", "girl")
        ),
        "Bella is one of our old timers, she came to us from the local dog pound and has been with us for nearly 2 and a half years. She is a very sweet girl who really deserves a chance.\n" +
            "\n" +
            "Bella is super friendly and affectionate and just loves her cuddles. She is quite a strong willed girl, she needs a firm hand and a family experienced with bull breeds who can give her the time, commitment and training she needs.\n" +
            "\n" +
            "Bella would be best suited as an only dog in a house with no children under 15. As a restricted breed she needs an experienced home",
        R.drawable.pic_bella
    ),
    Puppy(
        "Sport", "Lurcher",
        listOf(
            PuppyCharacteristics("Age", "10y+"),
            PuppyCharacteristics("Personality", "friendly"),
            PuppyCharacteristics("Gender", "boy")
        ),
        "Sport is one of our older boys ❤\n" +
            "\n" +
            "Sport was surrendered into us before Christmas, he is a very friendly and affectionate boy who loves both people and other dogs of all sizes.\n" +
            "\n" +
            "Due to his age Sports vision has started to deteriorate but it doesn’t stop him in anyway, he is always happy and bouncy and really loves going for walks \uD83D\uDE42\n" +
            "\n" +
            "Measuring just 63cm shoulder height Sport is quite small for a lurcher, he would suit a quieter less active home.",
        R.drawable.pic_sport
    ),
    Puppy(
        "Johnny Utah", "Lurcher",
        listOf(
            PuppyCharacteristics("Age", "2y+"),
            PuppyCharacteristics("Personality", "energetic"),
            PuppyCharacteristics("Gender", "boy")
        ),
        "Utah is not a Paws dog, he is currently in a foster home in Dublin for “A dogs life” rescue.\n" +
            "\n" +
            "Utah is looking for a quieter, more rural home with a large garden and a buddy to play with.\n" +
            "\n" +
            "He is crate trained, house trained, friendly and affectionate \uD83D\uDE42  He is also a typical energetic young lurcher with a high prey drive who loves to run at speed!\n" +
            "\n" +
            "For more information please use the link below which will take you to his profile on the A dogs life website.\n" +
            "\n" +
            "https://www.adogslife.ie/johnny-utah",
        R.drawable.pic_johnny
    ),
)
