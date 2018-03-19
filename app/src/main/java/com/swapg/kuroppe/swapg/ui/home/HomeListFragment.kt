package com.swapg.kuroppe.swapg.ui.home

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.swapg.kuroppe.swapg.databinding.FragmentHomeBinding
import com.swapg.kuroppe.swapg.ui.item.NewtestItem
import com.swapg.kuroppe.swapg.util.ViewModelFactory
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.Section
import com.xwray.groupie.ViewHolder
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class HomeListFragment : DaggerFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private lateinit var binding : FragmentHomeBinding
    private val section = Section()

    private val viewModel: HomeViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(HomeViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.homeRecycler.adapter = GroupAdapter<ViewHolder>().apply { add(section) }
        viewModel.newtest().observe(this, Observer { list ->
            list?.let {
                section.update(it.map { post -> NewtestItem(post) })
            }
        })
    }

    companion object {
        fun newInstance() : HomeListFragment = HomeListFragment()
    }
}
