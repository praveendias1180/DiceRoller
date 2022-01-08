package range.quest.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import range.quest.diceroller.R.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val rollButton: Button = findViewById(id.roll_button)
        rollButton.text = getString(string.button_text_new)
        rollButton.setOnClickListener {
            rollDice()
            Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT).show()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt( 6) + 1
        resultText.text = randomInt.toString()
    }
}