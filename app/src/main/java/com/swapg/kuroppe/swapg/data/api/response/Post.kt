package com.swapg.kuroppe.swapg.data.api.response

import com.google.gson.annotations.SerializedName

data class Post(
        val id: String?,
        @SerializedName("jpeg_url")
        val jpeg: String?
)