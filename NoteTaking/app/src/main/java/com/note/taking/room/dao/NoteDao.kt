package com.note.taking.room.dao

import androidx.room.*
import com.note.taking.room.entity.Note

@Dao
interface NoteDao {
    @Query("SELECT * FROM note WHERE email = :email")
    fun getNote(email: String): List<Note>

    @Insert
    fun insert(note: Note):Long

    @Update
    fun update(note: Note):Int

    @Delete
    fun delete(note: Note):Int

}