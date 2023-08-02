package com.example.recipe_app.model

import androidx.room.*


@Dao
interface MealDao {
    @Query("SELECT * FROM FavMeals")
    suspend fun getFavMeals():List<MealX>
    @Insert
    suspend fun insertMeal(meal : MealX)
    @Delete
    suspend fun deleteMeal(meal: MealX)
}