package com.swapg.kuroppe.swapg.di

import com.swapg.kuroppe.swapg.MainApplication
import com.swapg.kuroppe.swapg.view.ViewModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            AppModule::class,
            ViewModule::class,
            HttpClientModule::class,
            RepositoryModule::class
        ]
)

interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }

    override fun inject(mainApp: MainApplication)
}