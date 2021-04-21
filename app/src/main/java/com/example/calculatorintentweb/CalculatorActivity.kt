package com.example.calculatorintentweb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        btn_Add.setOnClickListener {
            //Receive entered data from the user on a avariable
            //var firstnum= edt_fnum.text.toString()

            var firstnum= edt_fnum.text.toString()
            var secondnum = edt_Snum.text.toString()

            if (firstnum.isEmpty()or secondnum.isEmpty()){

                txt_Answer.text="Please fill in all the inputs"

            }else{
                var answer= firstnum.toDouble() + secondnum.toDouble()
                txt_Answer.text=answer.toString()
            }




        }
        btn_Subract.setOnClickListener {

            var firstnum= edt_fnum.text.toString()
            var secondnum = edt_Snum.text.toString()

            if (firstnum.isEmpty()or secondnum.isEmpty()){

                txt_Answer.text="Please fill in all the inputs"

            }else{
                var answer= firstnum.toDouble() - secondnum.toDouble()
                txt_Answer.text=answer.toString()
            }


        }

       btn_Division.setOnClickListener {

           var firstnum= edt_fnum.text.toString()
           var secondnum = edt_Snum.text.toString()

           if (firstnum.isEmpty()or secondnum.isEmpty()){

               txt_Answer.text="Please fill in all the inputs"

           }else{
               var answer= firstnum.toDouble() / secondnum.toDouble()
               txt_Answer.text=answer.toString()
           }
       }
      btn_Multiply.setOnClickListener {
          var firstnum= edt_fnum.text.toString()
          var secondnum = edt_Snum.text.toString()

          if (firstnum.isEmpty()or secondnum.isEmpty()){

              txt_Answer.text="Please fill in all the inputs"

          }else{
              var answer= firstnum.toDouble() * secondnum.toDouble()
              txt_Answer.text=answer.toString()
          }
      }

    }
}