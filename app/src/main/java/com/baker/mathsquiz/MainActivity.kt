package com.baker.mathsquiz

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    val questionsList = listOf(
        "Five out of eight are better odds than three out of five.",
        "The sum of angles around a point in a circle is 350.",
        "The perimeter of a circle is known as the diameter.",
        "7000mm = 7km",
        "15% of 60 equals 9.",
        "2.68 > 2.8",
        "The interior angles of a triangle will always add up to 180.",
        "A convex shape curves outwards",
        "The product of two negative numbers is a positive.",
        "Pi can be written as a fraction."
    )

    val correctAnswers = mutableListOf<String>()
    var index = 0
    var question = questionsList[index]


    fun beginQuiz(view: View) {
        correctAnswers.clear()
        youScoredTxt.text = " "
        resultsTxt.text = " "
        resultCommentTxt.text = " "
        index = 0
        question = questionsList[index]
        questionTxt.text = question
    }

    fun onTrueClick(view: View) {
        if (question == questionsList[0]
            || question == questionsList[4]
            || question == questionsList[6]
            || question == questionsList[7]
            || question == questionsList[8]
        ) {
            correctAnswers.add(question)
            Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
            if (index == 9) {
                questionTxt.text = " "
                val score = correctAnswers.count()
                if (score == 10) {
                    resultCommentTxt.text = "Perfect Score!"
                } else if (score >= 8) {
                    resultCommentTxt.text = "Very good."
                } else if (score >= 6) {
                    resultCommentTxt.text = "Not bad."
                } else if (score >= 4) {
                    resultCommentTxt.text = "You can do better than that"
                } else {
                    resultCommentTxt.text = "Not good at all!."
                }
                youScoredTxt.text = "You scored:"
                resultsTxt.text = "$score out of 10."
            } else {
                index += 1
                question = questionsList[index]
                questionTxt.text = question
            }
        } else {
            Toast.makeText(this@MainActivity, "incorrect", Toast.LENGTH_SHORT).show()
            if (index == 9) {
                questionTxt.text = " "
                val score = correctAnswers.count()
                if (score == 10) {
                    resultCommentTxt.text = "Perfect Score!"
                } else if (score >= 8) {
                    resultCommentTxt.text = "Very good."
                } else if (score >= 6) {
                    resultCommentTxt.text = "Not bad."
                } else if (score >= 4) {
                    resultCommentTxt.text = "You can do better than that"
                } else {
                    resultCommentTxt.text = "Not good at all!."
                }
                youScoredTxt.text = "You scored:"
                resultsTxt.text = "$score out of 10."
            } else {
                index += 1
                question = questionsList[index]
                questionTxt.text = question
            }
        }
    }

        fun onFalseClick(view: View) {
            if (question == questionsList[1]
                || question == questionsList[2]
                || question == questionsList[3]
                || question == questionsList[5]
                || question == questionsList[9])
            {
                correctAnswers.add(question)
                Toast.makeText(this@MainActivity, "correct", Toast.LENGTH_SHORT).show()
                if (index == 9) {
                    questionTxt.text = " "
                    val score = correctAnswers.count()
                    if (score == 10) {
                        resultCommentTxt.text = "Perfect Score!"
                    } else if (score >= 8) {
                        resultCommentTxt.text = "Very good."
                    } else if (score >= 6) {
                        resultCommentTxt.text = "Not bad."
                    } else if (score >= 4) {
                        resultCommentTxt.text = "You can do better than that"
                    } else {
                        resultCommentTxt.text = "Not good at all!."
                    }
                    youScoredTxt.text = "You scored:"
                    resultsTxt.text = "$score out of 10."
                } else {
                    index += 1
                    question = questionsList[index]
                    questionTxt.text = question
                }
            } else {
                Toast.makeText(this@MainActivity, "incorrect", Toast.LENGTH_SHORT).show()
                if (index == 9) {
                    questionTxt.text = " "
                    val score = correctAnswers.count()
                    if (score == 10) {
                        resultCommentTxt.text = "Perfect Score!"
                    } else if (score >= 8) {
                        resultCommentTxt.text = "Very good."
                    } else if (score >= 6) {
                        resultCommentTxt.text = "Not bad."
                    } else if (score >= 4) {
                        resultCommentTxt.text = "You can do better than that"
                    } else {
                        resultCommentTxt.text = "Not good at all!."
                    }
                    youScoredTxt.text = "You scored:"
                    resultsTxt.text = "$score out of 10."
                } else {
                    index += 1
                    question = questionsList[index]
                    questionTxt.text = question
                }
            }
        }

        fun startAgain(view: View) {
            correctAnswers.clear()
            youScoredTxt.text = " "
            resultsTxt.text = " "
            resultCommentTxt.text = " "
            index = 0
            question = questionsList[index]
            questionTxt.text = question
        }
    }


