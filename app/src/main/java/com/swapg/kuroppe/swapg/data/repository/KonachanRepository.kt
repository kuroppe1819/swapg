package com.swapg.kuroppe.swapg.data.repository

import com.swapg.kuroppe.swapg.data.api.response.Newtest
import io.reactivex.Flowable

interface KonachanRepository {
    fun loadNewtest(): Flowable<List<Newtest>>
}