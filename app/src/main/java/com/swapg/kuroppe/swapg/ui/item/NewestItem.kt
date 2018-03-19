package com.swapg.kuroppe.swapg.ui.item

import com.swapg.kuroppe.swapg.R
import com.swapg.kuroppe.swapg.data.api.response.Newest
import com.swapg.kuroppe.swapg.databinding.ItemNewestBinding
import com.xwray.groupie.databinding.BindableItem

class NewestItem(
        private val newest: Newest
) : BindableItem<ItemNewestBinding>() {

    override fun getLayout(): Int = R.layout.item_newest

    override fun bind(viewBinding: ItemNewestBinding, position: Int) {
        viewBinding.also { v ->
            v.newest = newest
            v.imageUrl = "http:${newest.sampleUrl}"
        }
    }
}
