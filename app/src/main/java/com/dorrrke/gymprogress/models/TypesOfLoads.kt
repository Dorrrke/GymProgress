package com.dorrrke.gymprogress.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity()
data class TypesOfLoads(
    @PrimaryKey(autoGenerate = true) val tolId: Int,
    @ColumnInfo(name = "Name") val name: String,
    @ColumnInfo(name = "Group") val group: String
)