package com.swapg.kuroppe.swapg.ui.home

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v7.app.AppCompatActivity
import com.swapg.kuroppe.swapg.R
import com.swapg.kuroppe.swapg.databinding.ActivityMainBinding
import com.swapg.kuroppe.swapg.model.ContentTabs

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

    inner class HomePagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment = HomeListFragment.newInstance(ContentTabs.values()[position].name)

        override fun getCount(): Int = ContentTabs.values().size

        override fun getPageTitle(position: Int): CharSequence? = ContentTabs.values()[position].name
    }
}
