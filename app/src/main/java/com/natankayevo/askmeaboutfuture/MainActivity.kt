package com.natankayevo.askmeaboutfuture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.natankayevo.askmeaboutfuture.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var test1 = "1"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
    var answers = listOf("Yes", "No", "Follow your heart", "Follow your brain")
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val activityMainView = binding.root

        binding.sendButton.setOnClickListener {
            if (binding.questionTxt.text.isEmpty()) {
                binding.answerTxt.text = "Ask me something your mortal"
            }else{
                val answerDefinition = Random.nextInt(0,4)
                binding.answerTxt.text = answers[answerDefinition]
                binding.questionTxt.setText("")
            }
        }

        setContentView(activityMainView)
    }
}