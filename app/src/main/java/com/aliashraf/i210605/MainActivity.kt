package com.aliashraf.i210605

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.os.Handler


class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        //window.setFlags(android.R.attr.windowFullscreen, android.R.attr.windowFullscreen)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Delay switching to layout2.xml after 3 seconds
        Handler().postDelayed({
            switchToLayout2()
        }, 3000)
    }

    private fun switchToLayout2() {
        setContentView(R.layout.layout2)

        // Find the TextView in layout2.xml
        val textViewInLayout2 = findViewById<TextView>(R.id.SignUp2)
        textViewInLayout2.paintFlags = textViewInLayout2.paintFlags or Paint.UNDERLINE_TEXT_FLAG

        // Set OnClickListener for the TextView in layout2.xml
        textViewInLayout2.setOnClickListener {
            // Switch to layout3.xml when the TextView in layout2.xml is clicked
            switchToLayout3()
        }

        // Find the ImageView in layout2.xml
        val imageViewInLayout2 = findViewById<ImageView>(R.id.imageView)
        val imageViewInLayout2_2 = findViewById<TextView>(R.id.textViewForgotPassword)
        // Set OnClickListener for the ImageView in layout2.xml
        imageViewInLayout2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout4()
        }
        imageViewInLayout2_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout5()
        }
    }

    private fun switchToLayout3() {
        setContentView(R.layout.layout3)

        // Find the TextView in layout3.xml
        val textViewInLayout3 = findViewById<TextView>(R.id.Login3)

        // Set OnClickListener for the TextView in layout3.xml
        textViewInLayout3.setOnClickListener {
            // Switch back to layout2.xml when the TextView in layout3.xml is clicked
            switchToLayout2()
        }
    }

    private fun switchToLayout4() {
        setContentView(R.layout.layout4)
        val imageViewInLayout4 = findViewById<ImageView>(R.id.imageView)
        imageViewInLayout4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
    }

    private fun switchToLayout5() {
        setContentView(R.layout.layout5)
        val textViewInLayout5 = findViewById<TextView>(R.id.SignUp2)
        textViewInLayout5.paintFlags = textViewInLayout5.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        val imageViewInLayout5 = findViewById<ImageView>(R.id.imageView)
        imageViewInLayout5.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout6()
        }
        textViewInLayout5.setOnClickListener {
            // Switch to layout3.xml when the TextView in layout2.xml is clicked
            switchToLayout2()
        }

    }
    private fun switchToLayout6() {
        setContentView(R.layout.layout6)
        val textViewInLayout6 = findViewById<TextView>(R.id.SignUp2)
        textViewInLayout6.paintFlags = textViewInLayout6.paintFlags or Paint.UNDERLINE_TEXT_FLAG
        textViewInLayout6.setOnClickListener {
            // Switch to layout3.xml when the TextView in layout2.xml is clicked
            switchToLayout2()
        }
    }

    private fun switchToLayout7() {
        setContentView(R.layout.layout7)
        val imageViewInLayout7 = findViewById<ImageView>(R.id.imageView25)
        imageViewInLayout7.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout8()
        }
        val imageViewInLayout7_2 = findViewById<ImageView>(R.id.imageView19)
        imageViewInLayout7_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout12()
        }
        val imageViewInLayout7_3 = findViewById<ImageView>(R.id.imageView214)
        imageViewInLayout7_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout10()
        }
        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView11222)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout14()
        }
        val imageViewInLayout7_10 = findViewById<ImageView>(R.id.imageView2552)
        imageViewInLayout7_10.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout21()
        }
        val imageViewInLayout7_11 = findViewById<ImageView>(R.id.imageView9)
        imageViewInLayout7_11.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout24()
        }
    }

    private fun switchToLayout8() {
        setContentView(R.layout.layout8)
        val imageViewInLayout8 = findViewById<ImageView>(R.id.imageView20)
        imageViewInLayout8.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
        val imageViewInLayout8_2 = findViewById<ImageView>(R.id.imageView17)
        imageViewInLayout8_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout9()
            }

        val imageViewInLayout8_3 = findViewById<ImageView>(R.id.imageView19)
        imageViewInLayout8_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout12()
        }
        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView252)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout14()
        }
        val imageViewInLayout7_9 = findViewById<ImageView>(R.id.imageView2552)
        imageViewInLayout7_9.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout21()
        }
        }

    private fun switchToLayout9() {
        setContentView(R.layout.layout9)
        val imageViewInLayout9 = findViewById<ImageView>(R.id.imageView26)
        imageViewInLayout9.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout8()
        }
        val imageViewInLayout9_2 = findViewById<ImageView>(R.id.imageView20)
        imageViewInLayout9_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
        val imageViewInLayout9_3 = findViewById<ImageView>(R.id.imageView19)
        imageViewInLayout9_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout12()
        }
        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView11222)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout14()
        }
        val imageViewInLayout7_9 = findViewById<ImageView>(R.id.imageView2552)
        imageViewInLayout7_9.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout21()
        }

    }


    private fun switchToLayout10() {
        setContentView(R.layout.layout10)
        val imageViewInLayout10 = findViewById<ImageView>(R.id.imageView430)
        imageViewInLayout10.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout11()
        }
        val imageViewInLayout10_2 = findViewById<ImageView>(R.id.imageView44)
        imageViewInLayout10_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout13()
        }
        val imageViewInLayout10_3 = findViewById<ImageView>(R.id.imageView40)
        imageViewInLayout10_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout16()
        }
    }

    private fun switchToLayout11() {
        setContentView(R.layout.layout11)
        val imageViewInLayout11 = findViewById<ImageView>(R.id.imageView44)
        imageViewInLayout11.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
    }

    private fun switchToLayout12() {
        setContentView(R.layout.layout12)
        val imageViewInLayout12 = findViewById<ImageView>(R.id.imageView20)
        imageViewInLayout12.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
        val imageViewInLayout12_2 = findViewById<ImageView>(R.id.imageView25)
        imageViewInLayout12_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout8()
        }
        val imageViewInLayout12_3 = findViewById<ImageView>(R.id.imageView)
        imageViewInLayout12_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView252)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout14()
        }
        val imageViewInLayout7_5 = findViewById<ImageView>(R.id.imageView28)
        imageViewInLayout7_5.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout17()
        }
        val imageViewInLayout7_6 = findViewById<ImageView>(R.id.imageView238)
        imageViewInLayout7_6.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout18()
        }
        val imageViewInLayout7_9 = findViewById<ImageView>(R.id.imageView11222)
        imageViewInLayout7_9.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout21()
        }
    }

    private fun switchToLayout13() {
        setContentView(R.layout.layout13)
        val imageViewInLayout13 = findViewById<ImageView>(R.id.imageView44)
        imageViewInLayout13.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }

    }

    private fun switchToLayout14() {
        setContentView(R.layout.layout14)
        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView20)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
        val imageViewInLayout7_3 = findViewById<ImageView>(R.id.imageView26)
        imageViewInLayout7_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout8()
        }
        val imageViewInLayout7_2 = findViewById<ImageView>(R.id.imageView19)
        imageViewInLayout7_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout12()
        }
        val imageViewInLayout7_1 = findViewById<ImageView>(R.id.imageView3112323)
        imageViewInLayout7_1.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout15()
        }
        val imageViewInLayout7 = findViewById<TextView>(R.id.textView221340)
        imageViewInLayout7.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout15()
        }
        val imageViewInLayout7_9 = findViewById<ImageView>(R.id.imageView2552)
        imageViewInLayout7_9.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout21()
        }
    }

    private fun switchToLayout15() {
        setContentView(R.layout.layout15)
        val imageViewInLayout10_3 = findViewById<ImageView>(R.id.imageView26)
        imageViewInLayout10_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout8()
        }
        val imageViewInLayout10_4 = findViewById<ImageView>(R.id.imageView20)
        imageViewInLayout10_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
        val imageViewInLayout7_2 = findViewById<ImageView>(R.id.imageView19)
        imageViewInLayout7_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout12()
        }

        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView252)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout14()
        }

        val imageViewInLayout7_5 = findViewById<ImageView>(R.id.imageView4127)
        imageViewInLayout7_5.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout19()
        }

    }


    private fun switchToLayout16() {
        setContentView(R.layout.layout16)
        val imageViewInLayout10_3 = findViewById<ImageView>(R.id.imageView26)
        imageViewInLayout10_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout8()
        }
        val imageViewInLayout10_4 = findViewById<ImageView>(R.id.imageView20)
        imageViewInLayout10_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
        val imageViewInLayout10_5 = findViewById<ImageView>(R.id.imageView252)
        imageViewInLayout10_5.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout14()
        }
        val imageViewInLayout7_2 = findViewById<ImageView>(R.id.imageView19)
        imageViewInLayout7_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout12()
        }
        val imageViewInLayout7_5 = findViewById<ImageView>(R.id.imageView4127)
        imageViewInLayout7_5.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout19()
        }
        val imageViewInLayout7_9 = findViewById<ImageView>(R.id.imageView11222)
        imageViewInLayout7_9.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout21()
        }
    }

    private fun switchToLayout17() {
        setContentView(R.layout.layout17)
        val imageViewInLayout7_2 = findViewById<ImageView>(R.id.imageView9)
        imageViewInLayout7_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView17)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout18()
        }
        val imageViewInLayout7_3 = findViewById<TextView>(R.id.textView28)
        imageViewInLayout7_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout18()
        }
    }

    private fun switchToLayout18() {
        setContentView(R.layout.layout18)
        val imageViewInLayout7_2 = findViewById<ImageView>(R.id.imageView17)
        imageViewInLayout7_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout17()
        }
        val imageViewInLayout7_3 = findViewById<TextView>(R.id.textView28)
        imageViewInLayout7_3.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout17()
        }
        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView9)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
    }

    private fun switchToLayout19() {
        setContentView(R.layout.layout19)
        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView50)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout15()
        }
        val imageViewInLayout7_5 = findViewById<ImageView>(R.id.imageView54350)
        imageViewInLayout7_5.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout20()
        }

    }



    private fun switchToLayout20() {
        setContentView(R.layout.layout20)

        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView50)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout15()
        }
        val imageViewInLayout7_5 = findViewById<ImageView>(R.id.imageView54350)
        imageViewInLayout7_5.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout19()
        }
    }


    private fun switchToLayout21() {
        setContentView(R.layout.layout21)
        val imageViewInLayout7 = findViewById<ImageView>(R.id.imageView25)
        imageViewInLayout7.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout8()
        }
        val imageViewInLayout7_2 = findViewById<ImageView>(R.id.imageView19)
        imageViewInLayout7_2.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout12()
        }
        val imageViewInLayout7_4 = findViewById<ImageView>(R.id.imageView252)
        imageViewInLayout7_4.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout14()
        }
        val imageViewInLayout7_5 = findViewById<ImageView>(R.id.imageView20)
        imageViewInLayout7_5.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
        val imageViewInLayout7_6 = findViewById<ImageView>(R.id.imageView54)
        imageViewInLayout7_6.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout22()
        }
        val imageViewInLayout7_7 = findViewById<ImageView>(R.id.imageView51234)
        imageViewInLayout7_7.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout22()
        }
        val imageViewInLayout7_12 = findViewById<ImageView>(R.id.imageView56)
        imageViewInLayout7_12.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout23()
        }
    }

    private fun switchToLayout22() {
        setContentView(R.layout.layout22)
        val imageViewInLayout7_7 = findViewById<ImageView>(R.id.imageView)
        imageViewInLayout7_7.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout21()
        }

    }

    private fun switchToLayout23() {
        setContentView(R.layout.layout23)
        val imageViewInLayout7_7 = findViewById<ImageView>(R.id.imageView51)
        imageViewInLayout7_7.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout21()
        }
    }

    private fun switchToLayout24() {
        setContentView(R.layout.layout24)
        val imageViewInLayout7_7 = findViewById<ImageView>(R.id.imageView51)
        imageViewInLayout7_7.setOnClickListener {
            // Switch to layout4.xml when the ImageView in layout2.xml is clicked
            switchToLayout7()
        }
    }

    override fun onClick(v: View?) {
    }
}
