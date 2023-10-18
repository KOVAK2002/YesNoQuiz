package com.example.kviz2

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private val questions = listOf(
        R.string.question_1 to R.string.answer_1,
        R.string.question_2 to R.string.answer_2,
        // Dodajte ostala pitanja i odgovore ovdje
    )
    private var currentQuestionIndex = 0

    private lateinit var questionTextView: TextView
    private lateinit var answerEditText: EditText
    private lateinit var checkAnswerButton: Button
    private lateinit var nextQuestionButton: Button
    private lateinit var resultTextView: TextView
   // private lateinit var backButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        questionTextView = findViewById(R.id.questionTextView)
        answerEditText = findViewById(R.id.answerEditText)
        checkAnswerButton = findViewById(R.id.checkAnswerButton)
        nextQuestionButton = findViewById(R.id.nextQuestionButton)
        resultTextView = findViewById(R.id.resultTextView)
        //backButton = findViewById(R.id.backButton)

        checkAnswerButton.setOnClickListener {
            checkAnswer()
        }

        nextQuestionButton.setOnClickListener {
            showNextQuestion()
        }

       /* backButton.setOnClickListener {
            showPreviousQuestion()
        }
        */


        if (savedInstanceState != null) {
            currentQuestionIndex = savedInstanceState.getInt("currentQuestionIndex")
            updateQuestion()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "Aplikacija je započela izvođenje")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "Aplikacija je nastavljena")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "Aplikacija je pauzirana")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "Aplikacija je zaustavljena")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "Aplikacija ne postoji")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("currentQuestionIndex", currentQuestionIndex)
    }

    private fun checkAnswer() {
        val userAnswer = answerEditText.text.toString()
        val correctAnswer = getString(questions[currentQuestionIndex].second)

        if (userAnswer.equals(correctAnswer, ignoreCase = true)) {
            resultTextView.text = getString(R.string.correct_message)
        } else {
            resultTextView.text = getString(R.string.incorrect_message)
        }

        answerEditText.isEnabled = false
        checkAnswerButton.visibility = View.GONE
        nextQuestionButton.visibility = View.VISIBLE
    }

    private fun showNextQuestion() {
        if (currentQuestionIndex < questions.size - 1) {
            currentQuestionIndex++
            updateQuestion()
        }
    }

    private fun showPreviousQuestion() {
        if (currentQuestionIndex > 0) {
            currentQuestionIndex--
            updateQuestion()
        }
    }

    private fun updateQuestion() {
        questionTextView.text = getString(questions[currentQuestionIndex].first)
        answerEditText.text.clear()
        resultTextView.text = ""
        answerEditText.isEnabled = true
        checkAnswerButton.visibility = View.VISIBLE
        nextQuestionButton.visibility = View.GONE
    }
}


