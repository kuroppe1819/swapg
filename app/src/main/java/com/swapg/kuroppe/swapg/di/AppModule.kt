package com.swapg.kuroppe.swapg.di

import com.swapg.kuroppe.swapg.data.api.KonachanService
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
open class AppModule {

    @Singleton
    @Provides
    fun provideKonachanSefvice(client: OkHttpClient): KonachanService =
        Retrofit.Builder()
                .baseUrl("https://konachan.net")
                .client(client).addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
                .create(KonachanService::class.java)
}