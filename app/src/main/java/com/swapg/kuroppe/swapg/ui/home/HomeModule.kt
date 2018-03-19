package com.swapg.kuroppe.swapg.ui.home

import android.arch.lifecycle.ViewModel
import com.swapg.kuroppe.swapg.di.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
interface HomeModule {

    @ContributesAndroidInjector
    fun contributeHomeListFragment(): HomeListFragment

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    fun provideHomeModule(homeViewModel: HomeViewModel) : ViewModel
}