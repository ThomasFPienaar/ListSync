package com.listsync.viewmodel

import com.listsync.model.shoppinglist.ShoppingList
import com.listsync.model.shoppinglist.ShoppingListItem
import org.junit.Test

class ShoppingListViewModelTest {

    @Test
    fun isViewModelCorrectData() {
        val list = object : ShoppingList{
            override fun addItem(shoppingListItem: ShoppingListItem) {

            }

            override fun getItemCount(): Int {
                return 1
            }

        }
        val shoppingListViewModel = ShoppingListViewModel(list)



    }
}