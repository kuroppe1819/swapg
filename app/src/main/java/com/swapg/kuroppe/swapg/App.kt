package com.swapg.kuroppe.swapg

import com.swapg.kuroppe.swapg.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =
            DaggerAppComponent.builder()
                    .build()
}