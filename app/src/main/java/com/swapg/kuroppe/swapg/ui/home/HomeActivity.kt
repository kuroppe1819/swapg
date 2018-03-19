package com.swapg.kuroppe.swapg.ui.home

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import com.swapg.kuroppe.swapg.R
import com.swapg.kuroppe.swapg.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(binding.toolbar)
        binding.viewPager.adapter = HomePagerAdapter(supportFragmentManager)
        binding.tab.setupWithViewPager(binding.viewPager)
    }

    class HomePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

        enum class Tab {
            NEWTEST() {
                override val fragment: Fragment
                    get() = HomeListFragment.newInstance()
            };

            abstract val fragment: Fragment
        }

        override fun getItem(position: Int): Fragment = Tab.values()[position].fragment

        override fun getCount(): Int = Tab.values().size
    }
}
