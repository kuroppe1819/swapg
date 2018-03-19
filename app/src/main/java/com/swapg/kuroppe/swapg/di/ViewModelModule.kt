package com.swapg.kuroppe.swapg.di

import android.arch.lifecycle.ViewModelProvider
import com.swapg.kuroppe.swapg.util.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
interface ViewModelModule {

    @Binds
    fun provideViewModule(factory: ViewModelFactory): ViewModelProvider.Factory
}