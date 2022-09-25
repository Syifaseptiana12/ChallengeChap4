package com.note.taking.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "judul") var judul: String,
    @ColumnInfo(name = "catatan") var catatan: String,
    @ColumnInfo(name = "email") val email: String,
)