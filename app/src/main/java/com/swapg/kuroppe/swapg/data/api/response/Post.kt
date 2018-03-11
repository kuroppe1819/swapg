package com.swapg.kuroppe.swapg.data.api.response

import com.google.gson.annotations.SerializedName

data class Post(
        val id: String?,
        @SerializedName("file_url")
        val fileUrl: String?,
        @SerializedName("sample_url")
        val sampleUrl: String?,
        @SerializedName("preview_url")
        val previewUrl: String?
)