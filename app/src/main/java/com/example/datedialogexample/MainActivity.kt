package com.example.datedialogexample

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import java.text.DateFormat
import java.time.Year
import java.util.*

//Date Pick Fragment를 만든다고 하는구나... 그때 사용자 정의 다이얼로그를 프레그먼트로 만들었었지..

class MainActivity : AppCompatActivity(), DatePickerDialog.OnDateSetListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button).also { it.setOnClickListener {
            //Fragment를 불러오는 내용이 들어가야겠지.. FragmentManager와 함께..
            //이거 뭐 괭장히 쉽게 불러오네..
            val datePicker = DatePickerFragment();
            datePicker.show(supportFragmentManager, "Date Picker")
        } }
    }

    override fun onDateSet(p0: DatePicker?, p1: Int, p2: Int, p3: Int) {
        val text = findViewById<TextView>(R.id.textView).also { it.setText("TODO") }
        val c = Calendar.getInstance().also { it.set(Calendar.YEAR, p1)}.also { it.set(Calendar.MONTH, p2)}.also { it.set(Calendar.DAY_OF_MONTH, p3) }
        val currentDateString = DateFormat.getDateInstance(DateFormat.FULL).format(c.time)
        val textView = findViewById<TextView>(R.id.textView).also { it.setText(currentDateString) }
    }

}