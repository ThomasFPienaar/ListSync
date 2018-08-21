package com.listsync.model.shoppinglist

interface ShoppingList {
    fun addItem(shoppingListItem: ShoppingListItem)
    fun getItemCount(): Int
}
