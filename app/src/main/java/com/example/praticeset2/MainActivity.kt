package com.example.praticeset2


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var raspberryPrices = 5
        display1("1 box: R$", raspberryPrices)
        raspberryPrices = 10
        display2("2 boxes: R$", raspberryPrices)
        display3("3 boxes: R$", raspberryPrices * 3)
    }
    
    fun display1(mensagem: String, raspberryPrices: Int) {
        val t = display_text_view
        t.setText(mensagem + raspberryPrices)
    }

    private fun display2(mensagem: String, raspberryPrices: Int) {
        val t = display_text_view2
        t.setText(mensagem + raspberryPrices)
    }

    private fun display3(mensagem: String, raspberryPrices: Int) {
        val t = display_text_view3
        t.setText(mensagem + raspberryPrices)
    }


}