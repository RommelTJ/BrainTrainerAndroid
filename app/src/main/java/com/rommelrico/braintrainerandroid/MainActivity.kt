package com.rommelrico.braintrainerandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.support.constraint.solver.widgets.ConstraintHorizontalLayout
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

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
    var gameLayout: ConstraintHorizontalLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(view: View) {
        // TODO: Implement me.
    }

    fun playAgain(view: View) {
        score = 0
        numberOfQuestions = 0
        timerTextView.setText("30s")
        scoreTextView.setText(Integer.toString(score) + "/" + Integer.toString(numberOfQuestions))
        newQuestion()
        playAgainButton.setVisibility(View.INVISIBLE)
        resultTextView.setText("")

        object : CountDownTimer(30100, 1000) {

            override fun onTick(l: Long) {
                timerTextView.setText((l / 1000).toString() + "s")
            }

            override fun onFinish() {
                resultTextView.setText("Done!")
                playAgainButton.setVisibility(View.VISIBLE)
            }
        }.start()
    }

    fun chooseAnswer(view: View) {
        // TODO: Implement me.
    }

    fun newQuestion() {
        val rand = Random()

        val a = rand.nextInt(21)
        val b = rand.nextInt(21)

        sumTextView?.text = "${a} ${b}"

        locationOfCorrectAnswer = rand.nextInt(4)

        answers.clear()

        for (i in 0..3) {
            if (i == locationOfCorrectAnswer) {
                answers.add(a + b)
            } else {
                var wrongAnswer = rand.nextInt(41)

                while (wrongAnswer == a + b) {
                    wrongAnswer = rand.nextInt(41)
                }

                answers.add(wrongAnswer)
            }

        }

        button0?.text = answers[0].toString()
        button1?.text = answers[1].toString()
        button2?.text = answers[2].toString()
        button3?.text = answers[3].toString()
    }

}
