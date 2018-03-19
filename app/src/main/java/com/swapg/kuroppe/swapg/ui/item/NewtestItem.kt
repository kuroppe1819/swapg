package com.swapg.kuroppe.swapg.ui.item

import com.swapg.kuroppe.swapg.R
import com.swapg.kuroppe.swapg.data.api.response.Newtest
import com.swapg.kuroppe.swapg.databinding.ItemNewtestBinding
import com.xwray.groupie.databinding.BindableItem

class NewtestItem(
        private val newtest: Newtest
) : BindableItem<ItemNewtestBinding>() {

    override fun getLayout(): Int = R.layout.item_newtest

    override fun bind(viewBinding: ItemNewtestBinding, position: Int) {
        viewBinding.also { v ->
            v.newtest = newtest
            v.imageUrl = "http:${newtest.sampleUrl}"
        }
    }
}
