package com.rommelrico.braintrainerandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    var goButton: Button? = null
    var answers = ArrayList<Int>()
    var locationOfCorrectAnswer: Int = 0
    var resultTextView: TextView? = null
    var score = 0
    var numberOfQuestions = 0
    var scoreTextView: TextView? = null
    var button0: Button? = null
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var sumTextView: TextView? = null
    var timerTextView: TextView? = null
    var playAgainButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(view: View) {
        // TODO: Implement me.
    }

    fun playAgain(view: View) {
        // TODO: Implement me.
    }

    fun chooseAnswer(view: View) {
        // TODO: Implement me.
    }


}
