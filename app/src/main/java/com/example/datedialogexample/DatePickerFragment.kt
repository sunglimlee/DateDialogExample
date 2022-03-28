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
    lateinit var mDateSetListener : DatePickerDialog.OnDateSetListener
    public fun setOnDateSetListener(dateSetListener : DatePickerDialog.OnDateSetListener) {
        mDateSetListener = dateSetListener
    }
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        //Activity가 DatePickerDialog.OnDateSetLister를 상속받아서 해당 이벤트 함수를 처리할때
        //return DatePickerDialog(requireContext(), activity as DatePickerDialog.OnDateSetListener, year, month, day)
        //Anonymous 객체를 이용해서 해당 이벤트 함수를 처리할 때
        //내가 이걸 이렇게 정확하게 처리하는거 보면 내가 정확히 알고 있는거지... 많이 배웠네.. 그리고 이해가 되기 시작했네...
        return DatePickerDialog(requireContext(), mDateSetListener, year, month, day)
    }
}