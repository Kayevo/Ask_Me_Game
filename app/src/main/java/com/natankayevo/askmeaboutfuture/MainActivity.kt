package com.natankayevo.askmeaboutfuture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.natankayevo.askmeaboutfuture.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var test1 = "1"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_main)









        """companion object {
        @JvmField
        var testVar: String = "one"
    }

        val txtAnswer = findViewById<TextView>(R.id.textView)
        val sendButton = findViewById<Button>(R.id.button)

        

        test1 = "2"

        println(test1)

        Thread.sleep(3000)
        // testVar = "two"

        // txtAnswer.setText(testVar)


        
   sendButton.setOnClickListener {
            // var answer = Random.nextInt(0, 3)
            var answer = testVar
            txtAnswer.setText("")
        }
"""

    }
}