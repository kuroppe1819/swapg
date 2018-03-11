package com.swapg.kuroppe.swapg.viewmodel

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.LiveDataReactiveStreams
import android.arch.lifecycle.ViewModel
import com.swapg.kuroppe.swapg.data.api.response.Post
import com.swapg.kuroppe.swapg.data.repository.KonachanRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.reactivestreams.Publisher
import javax.inject.Inject

class MainViewModel @Inject constructor(
        private val repository: KonachanRepository
) : ViewModel() {

    // TODO: utilに書く
    fun <T> Publisher<T>.toLiveData() = LiveDataReactiveStreams.fromPublisher(this)

    // TODO: Implements onError
    fun posts() : LiveData<List<Post>> {
        return repository.loadKonachanPosts()
                .subscribeOn(Schedulers.single())
                .observeOn(AndroidSchedulers.mainThread())
                .toLiveData()
    }

}