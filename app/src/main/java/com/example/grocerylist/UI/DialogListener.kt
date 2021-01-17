package com.example.grocerylist.UI

import com.example.grocerylist.Database.Entity.GroceryItems

interface DialogListener {
    fun onAddButtonClicked(item:GroceryItems)
}