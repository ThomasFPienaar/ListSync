package com.listsync.model.shoppinglist.impl

import com.listsync.model.shoppinglist.ShoppingList
import com.listsync.model.shoppinglist.ShoppingListItem
import junit.framework.Assert
import org.junit.Test

class ShoppingListImplTest {
    @Test
    fun addOneItemsCountTest() {
        var sList : ShoppingList = ShoppingListImpl()
        sList.addItem(ShoppingListItem())

        Assert.assertEquals(1, sList.getItemCount())
    }

    @Test
    fun addTwoItemsCountTest() {
        var sList : ShoppingList = ShoppingListImpl()
        sList.addItem(ShoppingListItem())
        sList.addItem(ShoppingListItem())

        Assert.assertEquals(2, sList.getItemCount())
    }
}

