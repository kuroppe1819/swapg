package com.swapg.kuroppe.swapg.view

import android.arch.lifecycle.ViewModel
import com.swapg.kuroppe.swapg.di.ViewModelKey
import com.swapg.kuroppe.swapg.view.activity.MainActivity
import com.swapg.kuroppe.swapg.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
interface ViewModule {

    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun provideMainViewModule(mainViewModel: MainViewModel) : ViewModel
}