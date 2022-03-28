package com.example.datedialogexample

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import java.util.*

class DatePickerFragment : DialogFragment() {
    val c : Calendar = Calendar.getInstance()
    val year : Int = c.get(Calendar.YEAR)
    val month : Int = c.get(Calendar.MONTH)
    val day : Int = c.get(Calendar.DAY_OF_MONTH)
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return DatePickerDialog(requireContext(), activity as DatePickerDialog.OnDateSetListener, year, month, day)
    }
}