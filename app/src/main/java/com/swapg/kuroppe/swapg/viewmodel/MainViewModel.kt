package com.swapg.kuroppe.swapg.viewmodel

import android.arch.lifecycle.ViewModel
import com.swapg.kuroppe.swapg.data.repository.KonachanRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(
        private val repository: KonachanRepository
) : ViewModel() {

}