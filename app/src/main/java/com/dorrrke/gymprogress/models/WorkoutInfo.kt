package com.dorrrke.gymprogress.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    foreignKeys = [ForeignKey(
        entity = Workouts::class,
        parentColumns = arrayOf("wId"),
        childColumns = arrayOf("wId"),
        onDelete = ForeignKey.CASCADE
    ),
    ForeignKey(
        entity = TypesOfLoads::class,
        parentColumns = arrayOf("tolId"),
        childColumns = arrayOf("tolId"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class WorkoutInfo(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "wId") val wId: Int,
    @ColumnInfo(name = "tolId") val tolId: Int,
    @ColumnInfo(name = "Repeat") val repeat: Int,
    @ColumnInfo(name = "Plates") val plates: String
)
