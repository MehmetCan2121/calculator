package com.mehmetcanmut.hesapmakinasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var sayi1: Int? = null
    var sayi2: Int? = null
    var sonuc: Int? = null
    var _sonuc="Sonuç : "
    var _eror="Error!!"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun topla(view: View) {

        sayi1 = editTextNumber.text.toString().toIntOrNull()
        sayi2 = editTextNumber2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = _eror
        } else {
            sonuc = sayi1!! + sayi2!!
            textView.text = _sonuc + sonuc
        }
    }

    fun cikar(view: View) {
        sayi1 = editTextNumber.text.toString().toIntOrNull()
        sayi2 = editTextNumber2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = _eror
        } else {
            sonuc = sayi1!! - sayi2!!
            textView.text = _sonuc + sonuc
        }
    }

    fun çarp(view: View) {
        sayi1 = editTextNumber.text.toString().toIntOrNull()
        sayi2 = editTextNumber2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = _eror
        } else {
            sonuc = sayi1!! * sayi2!!
            textView.text = _sonuc + sonuc
        }
    }

    fun böl(view: View) {
        sayi1 = editTextNumber.text.toString().toIntOrNull()
        sayi2 = editTextNumber2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null) {
            textView.text = _eror
        } else {
            sonuc = sayi1!! / sayi2!!
            textView.text = _sonuc + sonuc
        }

    }
}