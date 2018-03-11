package com.swapg.kuroppe.swapg.data.api

import com.swapg.kuroppe.swapg.data.api.response.Post
import io.reactivex.Single
import retrofit2.http.GET

interface KonachanService {
    @GET("/post.json?")
    fun getPosts(): Single<List<Post>>
}