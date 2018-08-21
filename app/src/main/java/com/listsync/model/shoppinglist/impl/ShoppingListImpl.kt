package com.listsync.model.shoppinglist.impl

import com.listsync.model.shoppinglist.ShoppingList
import com.listsync.model.shoppinglist.ShoppingListItem

class ShoppingListImpl : ShoppingList {

    private var shoppingList : MutableList<ShoppingListItem> = ArrayList()
    override fun getItemCount(): Int {
        return shoppingList.size
    }

    override fun addItem(shoppingListItem: ShoppingListItem) {
        shoppingList.add(shoppingListItem)

    }
}