package com.swapg.kuroppe.swapg.view.activity

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import com.swapg.kuroppe.swapg.R
import com.swapg.kuroppe.swapg.databinding.ActivityMainBinding
import com.swapg.kuroppe.swapg.view.item.PostItem
import com.swapg.kuroppe.swapg.viewmodel.MainViewModel
import com.swapg.kuroppe.swapg.viewmodel.ViewModelFactory
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.ViewHolder
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var viewModelFactory: ViewModelFactory

    private val postSection = Section()

    private val binding: ActivityMainBinding by lazy {
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }

    private val viewModel: MainViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.postRecyclerView.adapter = GroupAdapter<ViewHolder>().also { it.add(postSection) }
        viewModel.posts().observe(this, Observer { list ->
            list?.let {
                postSection.update(it.map { post -> PostItem(post) })
            }
        })
    }
}
