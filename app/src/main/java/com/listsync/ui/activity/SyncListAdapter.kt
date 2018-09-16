package com.listsync.ui.activity

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater

import android.view.ViewGroup
import com.listsync.R
import com.listsync.databinding.ShoppingListItemBinding
import com.listsync.viewmodel.ShoppingListItemViewModel

class SyncListAdapter : RecyclerView.Adapter<SyncListAdapter.SyncListViewHolder> {

    private var list: List<ShoppingListItemViewModel> = ArrayList()

    constructor() : super() {
        this.list += ShoppingListItemViewModel()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SyncListViewHolder {
        return SyncListViewHolder(DataBindingUtil.inflate(LayoutInflater.from(parent.context), R.layout.shopping_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: SyncListViewHolder, position: Int) {
        holder.itemViewBinding.shoppingListItem = list.get(position)
    }

    class SyncListViewHolder(val itemViewBinding : ShoppingListItemBinding) : RecyclerView.ViewHolder( itemViewBinding.root)
}