package com.example.myfirstkmmapp.domain.note

import database.NoteEntity
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun NoteEntity.toNote():Note{
    return Note(
        id = id,
        title = title,
        content = content,
        colorHex = colorHex,
        createdDateTime = Instant
            .fromEpochMilliseconds(createdDate)
            .toLocalDateTime(TimeZone.currentSystemDefault())
    )
}