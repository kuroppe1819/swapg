package com.swapg.kuroppe.swapg.view.item

import com.swapg.kuroppe.swapg.R
import com.swapg.kuroppe.swapg.data.api.response.Post
import com.swapg.kuroppe.swapg.databinding.ItemPostBinding
import com.xwray.groupie.databinding.BindableItem

class PostItem(
        private val post: Post
) : BindableItem<ItemPostBinding>() {

    override fun getLayout(): Int = R.layout.item_post

    override fun bind(viewBinding: ItemPostBinding, position: Int) {
        viewBinding.also { v ->
            v.post = post
            v.imageUrl = "http:/${post.sampleUrl}"
        }
    }
}
