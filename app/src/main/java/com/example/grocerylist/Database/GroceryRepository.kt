package com.example.grocerylist.Database

import com.example.grocerylist.Database.Entity.GroceryItems

class GroceryRepository(private val db: GroceryDatabase) {

    suspend fun insert(item:GroceryItems) = db.getGroceryDao().insert(item)
    suspend fun delete(item:GroceryItems) = db.getGroceryDao().delete(item)

    fun allGroceryItems() = db.getGroceryDao().getAllGroceryItems()




}