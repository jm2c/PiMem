package com.jmcareaga.pimem

import android.util.Log

class MemGame {
    private var finished: Boolean = false
    private var piStr: String = "π ≈ 3."
    private val digitsStr: String = "1415926535897932384626433832795028841971693993751058209749" +
            "4459230781640628620899862803482534211706798214808651328230664709384460955058223172" +
            "5359408128481117450284102701938521105559644622948954930381964428810975665933446128" +
            "4756482337867831652712019091456485669234603486104543266482133936072602491412737245" +
            "8700660631558817488152092096282925409171536436"
    private var index: Int = 0

    private fun nextDigit(): Int {
        return try {
            digitsStr[index++].digitToInt()
        } catch (e: StringIndexOutOfBoundsException) {
            this.finished = true
            0
        }
    }

    fun step(guess: Int): Boolean {
        if(finished)
            return false

        Log.d("Game", "Your guess: $guess")
        val digit = nextDigit()
        val isCorrect = (guess == digit.toInt())
        if(!isCorrect)
            finished = !finished

        piStr += digit
        Log.d("Game", "LLevamos $piStr")
        return isCorrect
    }

    fun getScore(): Int {
        return index
    }

    fun getPi(): String {
        return piStr
    }

    fun isFinished(): Boolean {
        return finished
    }
}
