package com.example.myapplication01.presentation.updatestatusscreen

import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.launch
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication01.R


@Composable
@Preview(showSystemUi = true)
fun TopBarC() {

    var isSearching by remember { mutableStateOf(false) }
    var search by remember { mutableStateOf("") }

    // Renamed for clarity
    var showMenu by remember { mutableStateOf(false) }
    var selectedMenuOption by remember { mutableStateOf("") }







// UI store in variable
    val topBarUI = @Composable {
        // This structure now works correctly with Arrangement.SpaceBetween
        Text(
            text = "Communities",
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp,
            modifier = Modifier.padding(start = 12.dp)
        )

        Row(verticalAlignment = Alignment.CenterVertically) {

            IconButton(onClick = { isSearching = true }) {

                Icon(
                    painter = painterResource(id = R.drawable.search),
                    contentDescription = "Search",
                    modifier = Modifier.size(24.dp)
                )
            }

            Box { // Use a Box to anchor the DropdownMenu to the IconButton
                IconButton(onClick = { showMenu = true }) {
                    Icon(
                        painter = painterResource(id = R.drawable.more),
                        contentDescription = "More Options",
                        modifier = Modifier.size(24.dp)
                    )
                }
                DropdownMenu(
                    expanded = showMenu,
                    onDismissRequest = { showMenu = false },
                    modifier = Modifier.align(Alignment.TopEnd) // Aligns menu to the right
                ) {
                    listOf(
                        "Setting"
                    ).forEach { item ->
                        DropdownMenuItem(text = { Text(text = item) }, onClick = {
                            selectedMenuOption = item
                            showMenu = false
                        })
                    }
                }

            }
        }
    }

    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp), // Added some vertical padding for better spacing
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // This is the logic you wanted to preserve
            if (isSearching || showMenu) {
                if (isSearching && !showMenu) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        TextField(
                            value = search,
                            onValueChange = { search = it },
                            placeholder = { Text(text = "Search") },
                            colors = TextFieldDefaults.colors(
                                unfocusedContainerColor = Color.Transparent,
                                focusedContainerColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                focusedIndicatorColor = Color.Transparent
                            ),
                            modifier = Modifier.weight(1f), // Use weight to fill available space
                            singleLine = true
                        )
                        IconButton(onClick = { isSearching = false }) {
                            Icon(
                                painter = painterResource(id = R.drawable.cross),
                                contentDescription = "Close Search",
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    }
                }
                else if (showMenu && !isSearching) {
                    topBarUI()

                }
                // The LaunchedEffect above handles the camera logic, so the UI part can be empty
                // else if (cameraBtn && !isSearching && !showMenu) { }

            } else {
                topBarUI()
            }
        }
        HorizontalDivider()
    }
}
