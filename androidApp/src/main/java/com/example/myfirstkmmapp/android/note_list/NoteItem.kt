package com.example.myfirstkmmapp.android.note_list

import android.media.JetPlayer
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myfirstkmmapp.domain.note.Note
import com.example.myfirstkmmapp.domain.time.DateTimeUtil


@Composable
fun NoteItem(
    note: Note,
    backGroundColor: Color,
    onNoteClick: () -> Unit,
    onDeleteClick: () -> Unit,
    modifier: Modifier = Modifier

) {

    val formattedDate = remember(note.createdDateTime) {
        DateTimeUtil.formatNoteDate(note.createdDateTime)
    }
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(5.dp))
            .background(backGroundColor)
            .clickable { onNoteClick() }
            .padding(16.dp)



    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Text(
                text = note.title,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp

            )
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Delete note",
                modifier = remember(onDeleteClick) {
                    Modifier
                        .clickable(MutableInteractionSource(), null) { onDeleteClick() }
                }
            )
        }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = note.content, fontWeight = FontWeight.Light)
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = formattedDate,
                color = Color.DarkGray,
                modifier = Modifier
                    .align(Alignment.End)

            )

        }
    Spacer(modifier = Modifier.height(16.dp))

    }

@Preview
@Composable
fun NoteItemPreview(){
    NoteItem(
        note = Note(1,"Test1","Content1", 1111111,DateTimeUtil.now()),
        backGroundColor = Color.DarkGray,
        onNoteClick = {},
        onDeleteClick = {  }
    )
}


