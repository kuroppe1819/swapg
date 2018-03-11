package com.swapg.kuroppe.swapg.data.repository

import com.swapg.kuroppe.swapg.data.api.response.Post
import io.reactivex.Flowable

interface KonachanRepository {
    fun loadKonachanPosts(): Flowable<List<Post>>
}