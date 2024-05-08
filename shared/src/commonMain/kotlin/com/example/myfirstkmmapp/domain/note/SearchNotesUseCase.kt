package com.example.myfirstkmmapp.domain.note

import com.example.myfirstkmmapp.domain.time.DateTimeUtil

class SearchNotesUseCase {
    fun execute(notes: List<Note>, query: String): List<Note> {
        if (query.isBlank()) {
            return notes
        } else {
            return notes.filter {
                it.title.trim().lowercase().contains(query.lowercase()) ||
                        it.content.trim().lowercase().contains(query.lowercase())
            }.sortedBy { DateTimeUtil.toEpochMillis(it.createdDateTime) }
        }
    }
}