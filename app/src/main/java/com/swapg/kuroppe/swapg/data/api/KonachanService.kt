package com.swapg.kuroppe.swapg.data.api

import com.swapg.kuroppe.swapg.data.api.response.Newest
import io.reactivex.Single
import retrofit2.http.GET

interface KonachanService {
    @GET("/post.json?")
    fun getNewtest(): Single<List<Newest>>
}