package com.example.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener {
            rollDice();
        }

        rollDice()
    }

    private fun rollDice() {
        val diceD6 = Dice(6)
        val diceRollD6 = diceD6.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)

        val diceRollD6Second = diceD6.roll()
        val diceImageSecond: ImageView = findViewById(R.id.imageView2)

        val drawableResource = when (diceRollD6) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawableResourceSecond = when (diceRollD6Second) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = diceRollD6.toString()

        diceImageSecond.setImageResource(drawableResourceSecond)
        diceImageSecond.contentDescription = diceRollD6Second.toString()
    }

}

