package range.quest.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import range.quest.diceroller.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        val rollButton: Button = findViewById(id.roll_button)
        rollButton.text = getString(string.button_text_new)
    }
}