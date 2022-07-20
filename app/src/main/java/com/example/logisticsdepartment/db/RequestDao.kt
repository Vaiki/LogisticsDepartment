package com.example.logisticsdepartment.db

import androidx.room.*
import kotlinx.coroutines.flow.Flow

@Dao
interface RequestDao {

    @Insert
    suspend fun insert(request: Request)

    @Update
    suspend fun update(request: Request)

    @Delete
    suspend fun delete(request: Request)

    @Query("SELECT*FROM REQUEST_TABLE")
    fun getAllRequest(): Flow<List<Request>>

    @Query("SELECT*FROM REQUEST_TABLE WHERE order_name = :orderName ")
    fun getGroupByName(orderName:String):Flow<List<Request>>
}