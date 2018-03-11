package com.swapg.kuroppe.swapg.di

import com.swapg.kuroppe.swapg.data.repository.KonachanRepository
import com.swapg.kuroppe.swapg.data.repository.KonachanRepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {
/*
    @Bindsを付けると以下のコードと等価になる

    @Provides
    fun provideKonachanRepository(repository: KonachanRepositoryImpl): KonachanRepository {
        return repository
    }
*/
    @Binds
    fun provideKonachanRepository(repository: KonachanRepositoryImpl): KonachanRepository
}