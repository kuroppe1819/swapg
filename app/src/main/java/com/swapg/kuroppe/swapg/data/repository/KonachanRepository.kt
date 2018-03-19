package com.swapg.kuroppe.swapg.data.repository

import com.swapg.kuroppe.swapg.data.api.response.Newest
import io.reactivex.Flowable

interface KonachanRepository {
    fun loadNewtest(): Flowable<List<Newest>>
}