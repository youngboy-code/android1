package com.example.realestate.ui.theme.screens.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar

import androidx.compose.material3.TopAppBarDefaults

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.ui.theme.lightpink

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()) {


        TopAppBar(
            title = {
                Text(text = "Magic Bricks", fontFamily = FontFamily.Cursive)},
            colors = TopAppBarDefaults.mediumTopAppBarColors(lightpink),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "", tint = Color.Cyan)
                    
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "", tint = Color.Cyan)
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "", tint = Color.Cyan)
                }
            }

        )

        Box (modifier = Modifier
            .fillMaxWidth()
            .height(240.dp),
            contentAlignment = Alignment.Center){

            Image(painter = painterResource(id = R.drawable.img_5) ,
                contentDescription ="home",
                modifier =Modifier.fillMaxSize()
                )

            Text(
                text = "Choose your best property",
                fontSize = 40.sp,
                fontWeight = FontWeight.ExtraBold,
                textAlign = TextAlign.Center
            )


        }
        Spacer(modifier = Modifier.height(20.dp))
        //search bar

        var search by remember { mutableStateOf("") }
        OutlinedTextField(value = search,
            onValueChange = {search = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "search")},
            placeholder = { Text(text = "What's your location ")}
        )

        // end of search bar

        Spacer(modifier = Modifier.height(20.dp))

        Row (modifier = Modifier
            .padding(start = 20.dp)
            .horizontalScroll(rememberScrollState())
        ){
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp)){

                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_1) ,
                        contentDescription ="home",
                        modifier =Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            // end of card 1

            Spacer(modifier = Modifier.width(20.dp))
            //card 2

            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp)){

                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_2) ,
                        contentDescription ="home",
                        modifier =Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //card 3
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp)){

                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_3) ,
                        contentDescription ="home",
                        modifier =Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            //card 4
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp)){

                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_5) ,
                        contentDescription ="home",
                        modifier =Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            //card 5
            Card (modifier = Modifier
                .height(180.dp)
                .width(200.dp)){

                Box (modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
                    Image(painter = painterResource(id = R.drawable.img_6) ,
                        contentDescription ="home",
                        modifier =Modifier.fillMaxSize(),
                        contentScale = ContentScale.Crop
                    )

                }
            }



        }














    }

    
    
}
@Composable
@Preview(showBackground = true)
fun DetailsScreenPreview(){
    DetailsScreen(rememberNavController())
}