package com.fernando.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.top_fragment.*

class TopFragment : Fragment() {

    lateinit var arrbookdesc: Array<String>
    var bookindex = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.top_fragment, container, false)
        arrbookdesc = resources.getStringArray(R.array.quotes)
        bookindex = if (savedInstanceState?.getInt("bookindex") == null) 3
        else {savedInstanceState?.getInt("bookindex")}
        return v
    }


    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("bookindex", bookindex)
    }

    fun changeDescription(index:Int) : Unit {
        bookindex = index
        txtdescription?.setText(arrbookdesc[bookindex])
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        changeDescription(bookindex)
    }
}