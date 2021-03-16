package com.demo.viewpager2ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val images= listOf(
            R.drawable.one,
            R.drawable.two,
            R.drawable.three
        )

        val adapter=VIewPagerAdapter(images)
        vp_2.adapter=adapter
        vp_2.orientation= ViewPager2.ORIENTATION_HORIZONTAL
        vp_2.beginFakeDrag()
        vp_2.fakeDragBy(-10f)
    }
}