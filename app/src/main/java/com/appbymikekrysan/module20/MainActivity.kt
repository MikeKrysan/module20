package com.appbymikekrysan.module20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.textView)

//        val view = layoutInflater.inflate(R.layout.item, text, false)
//        text.addView(view)

//        Обработка нажатия кнопки с помощью использования синтетиков - первый вариант. На практике чаще встречается первый вариант, так как не нужно событие прописывать еще и в activity_main.xml

        button_toast.setOnClickListener {
            Toast.makeText(this, "Я буду android-разработчиком!", Toast.LENGTH_SHORT).show()
        }

    }

//    Обработка нажатия кноки второй вариант

//    fun onClickToast(view: View) {
//        Toast.makeText(this, "Chin!", Toast.LENGTH_SHORT).show()
//    }
}