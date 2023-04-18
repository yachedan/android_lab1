package com.example.lab1

import kotlin.random.Random

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return Random.nextInt(1, numSides)
    }
}
