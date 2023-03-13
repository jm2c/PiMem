package com.jmcareaga.pimem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var game: MemGame
    private lateinit var btn0: Button
    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button
    private lateinit var btn4: Button
    private lateinit var btn5: Button
    private lateinit var btn6: Button
    private lateinit var btn7: Button
    private lateinit var btn8: Button
    private lateinit var btn9: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        game = MemGame()
        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)


        btn0.setOnClickListener{
            game.step(0)
            checkGameStatus()
        }
        btn1.setOnClickListener{
            game.step(1)
            checkGameStatus()
        }
        btn2.setOnClickListener{
            game.step(2)
            checkGameStatus()
        }
        btn3.setOnClickListener{
            game.step(3)
            checkGameStatus()
        }
        btn4.setOnClickListener{
            game.step(4)
            checkGameStatus()
        }
        btn5.setOnClickListener{
            game.step(5)
            checkGameStatus()
        }
        btn6.setOnClickListener{
            game.step(6)
            checkGameStatus()
        }
        btn7.setOnClickListener{
            game.step(7)
            checkGameStatus()
        }
        btn8.setOnClickListener{
            game.step(8)
            checkGameStatus()
        }
        btn9.setOnClickListener{
            game.step(9)
            checkGameStatus()
        }
    }

    private fun checkGameStatus(){
        if (game.isFinished()) {
            val score = game.getScore()
            Log.d("Game", "The Game has been terminated: $score")
        } else {
            Log.d("Game", "Continue...")
        }
    }
}