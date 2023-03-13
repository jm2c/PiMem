package com.jmcareaga.pimem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var game: MemGame
    private lateinit var tvPiStr: TextView
    private lateinit var tvScore: TextView
    private lateinit var btnReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvPiStr  = findViewById(R.id.tvPiDigits)
        tvScore  = findViewById(R.id.tvScore)
        btnReset = findViewById(R.id.btnReset)
        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)

        init()

        btnReset.setOnClickListener{
            init()
            btnReset.visibility = View.INVISIBLE
        }

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

    fun init() {
        game = MemGame()
        update()
    }

    fun update() {
        tvPiStr.text = game.getPi()
        tvScore.text = "Puntaje: ${game.getScore()}"
    }

    private fun checkGameStatus(){
        val score = game.getScore()

        if (game.isFinished()) {
            Log.d("Game", "The Game has been terminated: ${score - 1}")
            btnReset.visibility = View.VISIBLE
            tvScore.text = "Puntaje final: ${game.getScore() - 1}"
        } else {
            Log.d("Game", "Continue...")
            update()
        }
    }
}