package com.example.guessthenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number : Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        printTheQuestion()
    }

    fun clickDownArrow(view: View) {
        if (number == 5) {
            number = 3
            printTheQuestion()
        }else if (number == 3){
            number = 2
            printTheQuestion()
        }else if (number == 2){
            number = 1
            printTheQuestion()
        }else if(number == 8){
            number = 7
            printTheQuestion()
        }else if (number == 7){
            number = 6
            printTheQuestion()
        }
    }
    fun clickSuccess(view: View) {
        question_textview.visibility = INVISIBLE
        answer_textview.visibility = VISIBLE
        answer_textview.text = String.format(resources.getString(R.string.str_success), number)
    }
    fun clickUpArrow(view: View) {
        if (number == 3){
            number = 4
            printTheQuestion()
        }else if (number == 5){
            number = 8
            printTheQuestion()
        }else if(number == 8){
            number = 9
            printTheQuestion()
        }else if (number == 9){
            number = 10
            printTheQuestion()
        }
    }
    fun clickResetBtn(view: View) {
        answer_textview.visibility = INVISIBLE
        question_textview.visibility = VISIBLE
        number = 5
        printTheQuestion()
    }

    fun printTheQuestion(){
        question_textview.text = String.format(resources.getString(R.string.str_question), number)
    }
}