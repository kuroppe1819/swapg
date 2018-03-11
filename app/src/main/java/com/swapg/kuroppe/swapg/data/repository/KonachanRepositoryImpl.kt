package com.swapg.kuroppe.swapg.data.repository

import com.swapg.kuroppe.swapg.data.api.KonachanService
import com.swapg.kuroppe.swapg.data.api.response.Post
import io.reactivex.Flowable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class KonachanRepositoryImpl @Inject constructor(
        private val service: KonachanService
) : KonachanRepository {

    override fun loadKonachanPosts(): Flowable<List<Post>> {
        return service.getPosts().toFlowable()
    }
}