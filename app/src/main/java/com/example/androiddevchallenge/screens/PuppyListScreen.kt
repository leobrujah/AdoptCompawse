/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.Screen
import com.example.androiddevchallenge.data.puppiesData
import com.example.androiddevchallenge.models.Puppy
import com.example.androiddevchallenge.models.PuppyCharacteristics
import com.example.androiddevchallenge.ui.theme.darkGrey

@Composable
fun PuppyListScreen(navController: NavHostController) {
    LazyColumn {
        item { HeaderItem() }
        items(puppiesData) { puppy ->
            PuppyCard(
                puppy = puppy,
                puppyPicture = {
                    PuppyPicture(
                        resPicture = it.picture,
                        contentDescription = it.name,
                        size = 132.dp
                    )
                },
                puppyDescriptionBox = {
                    PuppyDescriptionBox(it) {
                        Text(
                            it.description,
                            style = MaterialTheme.typography.body2,
                            maxLines = 3,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            ) {
                navController.navigate("${Screen.PuppyDetails.route}${puppiesData.indexOf(puppy)}")
            }
        }
    }
}

@Composable
fun HeaderItem() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = stringResource(R.string.paws_website),
            modifier = Modifier.padding(16.dp)
        )
        Text(
            stringResource(R.string.paws_website),
            style = MaterialTheme.typography.h6,
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Composable
fun PuppyPicture(resPicture: Int, contentDescription: String, size: Dp) {
    Image(
        painter = painterResource(id = resPicture),
        contentDescription = "Adopt puppy $contentDescription",
        alignment = Alignment.TopCenter,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .height(size)
    )
}

@Composable
fun PuppyCard(
    puppy: Puppy,
    puppyPicture: @Composable (Puppy) -> Unit,
    puppyDescriptionBox: @Composable (Puppy) -> Unit,
    onClick: (() -> Unit)? = null
) {
    Card(
        contentColor = Color.Black,
        modifier = Modifier
            .padding(16.dp)
            .clickable(
                enabled = onClick != null,
            ) {
                onClick?.invoke()
            }
    ) {
        Column {
            puppyPicture(puppy)
            Divider(color = MaterialTheme.colors.primary, thickness = 2.dp)
            puppyDescriptionBox(puppy)
        }
    }
}

@Composable
fun PuppyDescriptionBox(
    puppy: Puppy,
    description: @Composable ColumnScope.() -> Unit,
) {
    Box(modifier = Modifier.padding(8.dp)) {
        Column {
            Text(puppy.name, style = MaterialTheme.typography.subtitle1)
            Text(
                puppy.breed,
                color = MaterialTheme.colors.secondary,
                style = MaterialTheme.typography.caption
            )
            Row(modifier = Modifier.padding(vertical = 8.dp)) {
                puppy.characteristics.onEachIndexed { i, characteristics ->
                    PuppyCharacteristicsColumn(
                        characteristics,
                        Modifier.padding(start = if (i > 0) 8.dp else 0.dp)
                    )
                }
            }
            description()
        }
    }
}

@Composable
fun PuppyCharacteristicsColumn(
    puppyCharacteristics: PuppyCharacteristics,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Text(puppyCharacteristics.name, style = MaterialTheme.typography.caption, color = darkGrey)
        Text(puppyCharacteristics.value, style = MaterialTheme.typography.caption)
    }
}
