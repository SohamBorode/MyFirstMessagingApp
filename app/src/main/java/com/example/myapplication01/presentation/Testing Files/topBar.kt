package com.example.myapplication01.presentation

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.launch
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication01.R

@Composable
@Preview(showSystemUi = true)
fun TopBar() {

    var isSearching by remember {
        mutableStateOf(false)
    }
    var search by remember {
        mutableStateOf("")
    }

    // Show menue
    var showMwnue by remember {
        mutableStateOf(false)
    }
    var selectedMenuOption by remember {
        mutableStateOf("")
    } // currently no use but use for validation or checking

    var cameraBtn by remember {
        mutableStateOf(false)
    }
    val context = LocalContext.current
    val cameraLauncher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.TakePicturePreview()
    ) { bitmap ->
        if (bitmap != null) {
            /**
             *I will get image here
             * I can save or process it
             **/
        }
    }



    Box(modifier = Modifier.fillMaxWidth()) {
        Column {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            )
            {
                if (isSearching) {
                    TextField(
                        value = search,
                        onValueChange = {
                            search = it
                        },
                        placeholder = {
                            Text(text = "Search")
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color.Transparent,
                            focusedContainerColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent
                        ),
                        modifier = Modifier.padding(1.dp).weight(9f),
                        singleLine = true
                    )
                } else {
                    Text(
                        text = "Updates",
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp,
                        modifier = Modifier.padding(start = 12.dp, top = 20.dp)
                    )
                }

                Spacer(modifier = Modifier.weight(1f))

                if (isSearching) {
                    IconButton(onClick = { isSearching = false }) {
                        Icon(
                            painter = painterResource(id = R.drawable.cross),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )
                    }
                } else {
                    IconButton(onClick = {
                        cameraLauncher.launch()
                    }) {
                        Icon(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { isSearching = true }) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(onClick = { showMwnue = true }) {
                        Icon(
                            painter = painterResource(id = R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }

                if (showMwnue) {
                    Box(

                    ) {
                        DropdownMenu(
                            expanded = showMwnue,
                            onDismissRequest = { showMwnue = false }) {

                            listOf(
                                "Create Channel",
                                "Status privacy",
                                "Started",
                                "Setting"
                            ).forEach { item ->
                                DropdownMenuItem(text = { Text(text = item) }, onClick = {
                                    selectedMenuOption = item
                                    showMwnue = false
                                })
                            }

                        }
                    }
                }

                if (cameraBtn) {
                    cameraLauncher.launch()
                }
            }

            HorizontalDivider()


        }
    }
}