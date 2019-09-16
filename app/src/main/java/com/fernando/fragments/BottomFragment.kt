package com.fernando.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.bottom_fragment.*

class BottomFragment: Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.bottom_fragment, container, false)
        return v

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
        quote1.setOnClickListener(this)
        quote2.setOnClickListener(this)
        quote3.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var index:Int = 0
        when(v?.id){
            R.id.quote1 -> {
                index = 0
            }
            R.id.quote2 -> {
                index = 1
            }
            R.id.quote3 -> {
                index = 2
            }
        }
        val activity = getActivity()
        if(activity is Coordinator) {
            activity.onFragmentChange(index)
        }
    }
}