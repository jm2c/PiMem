package com.jmcareaga.pimem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var game: MemGame

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        game = MemGame()

        for(i in 0..10) {
            println(game.nextDigit())
        }
    }
}