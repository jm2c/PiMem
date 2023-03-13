package com.jmcareaga.pimem

import android.util.Log

class MemGame {
    private var finished: Boolean = false
    private var piStr: String = "3."
    private val digitsStr: String = "14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196442881097566593344612847564823378678316527120190914564856692346034861045432664821339360726024914127372458700660631558817488152092096282925409171536436"
    private val digits: CharArray = digitsStr.toCharArray()
    private var index: Int = 0

    private fun nextDigit(): Int {
        return digits[index++].digitToInt()
    }

    fun step(guess: Int): Boolean {
        if(finished)
            return false

        Log.d("Game", "Your guess: $guess")
        val isCorrect = (guess == nextDigit().toInt())
        if(!isCorrect)
            finished = !finished
        return isCorrect
    }

    fun getScore(): Int {
        return index
    }

    fun isFinished(): Boolean {
        return finished
    }
}
