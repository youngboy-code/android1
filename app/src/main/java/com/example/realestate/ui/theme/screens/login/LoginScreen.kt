package com.example.realestate.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.data.AuthViewModel
import com.example.realestate.navigation.ROUT_DETAIL
import com.example.realestate.navigation.ROUT_SIGNUP


@Composable
fun LoginScreen(navController: NavController){

    Column(modifier = Modifier.fillMaxSize()
        .paint(painterResource(id = R.drawable.img_9), contentScale = ContentScale.FillBounds)
    ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(
            painter = painterResource(id = R.drawable.property),
            contentDescription = "home",
            modifier = Modifier
                .size(200.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Welcome Back!",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.LightGray,
            fontWeight = FontWeight.ExtraLight
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Already have an account .Please enter your credentials",
            fontSize = 18.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Gray,
            fontWeight = FontWeight.ExtraLight,
            textAlign = TextAlign.Center
        )
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }

        OutlinedTextField(
            value =email  ,
            onValueChange = { email = it},
            label = { Text(text = "Enter Email ")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.AccountBox, contentDescription = "", tint = Color.Black)   },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        OutlinedTextField(
            value =password ,
            onValueChange = { password = it},
            label = { Text(text = "Enter password")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = Color.Black)   },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )

        Spacer(modifier = Modifier.height(10.dp))

        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)



        Button(onClick = { authViewModel.login(email, password) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            shape = RoundedCornerShape(100.dp)


        ) {
            Text(text = "Log in")

        }
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Do not have an account? SIGNUP",
            fontSize = 18.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Black,
            fontWeight = FontWeight.ExtraLight,
            textAlign = TextAlign.Center,
            modifier = Modifier.clickable {
                navController.navigate(ROUT_SIGNUP)

            }
        )









    }


}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())

}

