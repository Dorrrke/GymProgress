package com.dorrrke.gymprogress.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity()
data class Workouts(
    @PrimaryKey(autoGenerate = true) val wId: Int,
    @ColumnInfo(name = "Date") val date: Date,
    @ColumnInfo(name = "TargetGroup") val target: String
)
