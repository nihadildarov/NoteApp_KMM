package com.example.myfirstkmmapp.domain.note

import com.example.myfirstkmmapp.domain.note.Note

interface NoteDataSource {
    suspend fun insertNote (note: Note)
    suspend fun getNoteById (id: Long): Note?
    suspend fun getAllNotes(): List<Note>
    suspend fun deleteNoteById(id:Long)
}