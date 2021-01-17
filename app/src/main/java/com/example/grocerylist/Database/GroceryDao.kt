package com.example.grocerylist.Database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.grocerylist.Database.Entity.GroceryItems

@Dao
interface GroceryDao{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item:GroceryItems)

    @Delete
    suspend fun delete(item: GroceryItems)

    @Query("SELECT * FROM grocery_items")
     fun getAllGroceryItems():LiveData<List<GroceryItems>>
}