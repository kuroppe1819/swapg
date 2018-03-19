package com.swapg.kuroppe.swapg.di

import com.swapg.kuroppe.swapg.App
import com.swapg.kuroppe.swapg.ui.home.HomeModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
            AndroidSupportInjectionModule::class,
            AppModule::class,
            HomeModule::class,
            HttpClientModule::class,
            RepositoryModule::class,
            ViewModelModule::class
        ]
)

interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }

    override fun inject(app: App)
}