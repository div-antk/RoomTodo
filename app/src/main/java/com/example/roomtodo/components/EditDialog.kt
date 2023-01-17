package com.example.roomtodo.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import org.w3c.dom.Text

class EditDialog {
    @Composable
    fun EditDialog(isShowDialog: MutableState<Boolean>) {
        AlertDialog(
            onDismissRequest = { isShowDialog.value = false },
            title = { Text(text = "Task新規作成") },
            text = {
                Column {
                    Text(text= "タイトル")
                    TextField(value = "", onValueChange = { /* TODO */ })
                    Text(text= "詳細")
                    TextField(value = "", onValueChange = { /* TODO */ })
                }
            },

            ) {

        }
    }
}