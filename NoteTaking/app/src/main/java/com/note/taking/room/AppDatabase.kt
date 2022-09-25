package com.note.taking.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.note.taking.room.dao.NoteDao
import com.note.taking.room.dao.UserDao
import com.note.taking.room.entity.Note
import com.note.taking.room.entity.User

@Database(entities = [User::class, Note::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun noteDao(): NoteDao
    companion object{
        fun db(ctx:Context):AppDatabase{
            return Room.databaseBuilder(
                ctx,
                AppDatabase::class.java, "NoteTaking"
            )
                .allowMainThreadQueries()
                .build()
        }
    }
}