package com.mea.todoapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat

@Entity(tableName = "task_table")
@Parcelize
data class Task (
    val title: String,
    val isImportant: Boolean = false,
    val isCompleted: Boolean = false,
    val created_at: Long = System.currentTimeMillis(),
    @PrimaryKey(autoGenerate = true) val id: Int = 0
) : Parcelable {
    val createdAtFormatted: String
        get() = DateFormat.getDateTimeInstance().format(created_at)
}