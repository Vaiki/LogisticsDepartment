package com.example.logisticsdepartment.db

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "REQUEST_TABLE")
data class Request(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    @ColumnInfo(name = "order_name")
    val orderName: String,
    val equipment: String,
    val description: String,
    val qty: String,
    val date: String,
    var status:String
)