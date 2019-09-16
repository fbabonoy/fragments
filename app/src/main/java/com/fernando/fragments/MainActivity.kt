package com.fernando.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.bottom_fragment.*

class MainActivity : AppCompatActivity(), Coordinator {

//    lateinit var topFragment: TopFragment
//    lateinit var bottomFragment: BottomFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        topFragment = TopFragment()
//        bottomFragment = BottomFragment()
//        val transaction = supportFragmentManager.beginTransaction()
//        transaction.add(R.id.fragtop, topFragment)
//        transaction.add(R.id.fragbottom, bottomFragment)
//        transaction.commit()

    }

//    override fun onFragmentChange(index: Int) {
//        topFragment.changeDescription(index)
//    }

    override fun onFragmentChange(index: Int) {
        val frag = fragtop
        if (frag is TopFragment) {
            frag.changeDescription(index)
        }
    }


}
