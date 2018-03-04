package com.swapg.kuroppe.swapg.view

import com.swapg.kuroppe.swapg.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ViewModule {

    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity
}