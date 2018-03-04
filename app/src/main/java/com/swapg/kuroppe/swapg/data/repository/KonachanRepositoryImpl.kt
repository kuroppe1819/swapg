package com.swapg.kuroppe.swapg.data.repository

import android.util.Log
import com.swapg.kuroppe.swapg.data.api.KonachanService
import io.reactivex.Completable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class KonachanRepositoryImpl @Inject constructor(
        private val service: KonachanService
) : KonachanRepository {

    override fun getKonachanPosts(): Completable {
        Log.d("konachan", "call getKonachanPosts")
        return service.getPosts()
                .toCompletable()
                .onErrorResumeNext {
                    Completable.create { emitter -> emitter.onError(it) }
                }
    }
}