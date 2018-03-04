package com.swapg.kuroppe.swapg.data.repository

import io.reactivex.Completable

interface KonachanRepository {
    fun getKonachanPosts(): Completable
}