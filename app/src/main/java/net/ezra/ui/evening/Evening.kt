package net.ezra.ui.evening


import android.content.Context
import android.content.Intent
import android.icu.text.CaseMap.Title
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_PRODUCTSCREEN
import androidx.compose.ui.tooling.preview.Preview as Preview1

@Composable
fun EveningScreen(navController: NavHostController) {

Box(modifier = Modifier

    .fillMaxSize()
    .fillMaxWidth()
    .fillMaxHeight()
    .background(color = Color.Black)
) {

    LazyColumn {
        item {
            Column {
                Text(text = "Nairobi travel view", color = Color(0xff284A8E), fontSize = 30.sp)

                Row {
                    Column(modifier = Modifier
                        .padding(10.dp)) {
                        Card(
                            modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                            colors = CardDefaults.cardColors(Color(0XffFB3207)),
                            elevation = CardDefaults.cardElevation(0.dp)


                        ) {
                            Box(modifier = Modifier.fillMaxWidth()) {
                                Image(
                                    painter = painterResource(id = R.drawable.mo),
                                    contentDescription = "germany",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )

                                Icon(
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = "fsv",
                                    tint = Color.Red,
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(10.dp)
                                )


                            }


                        }

                        Row {
                            Text(
                                modifier = Modifier

                                    .clickable {
                                        navController.navigate(ROUTE_ABOUT) {
                                            popUpTo(ROUTE_EVENING) { inclusive = true }

                                        }
                                    },


                                text = "TO MOMBASA",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                textAlign = TextAlign.Center,
                                color = Color(0xff1f6d80)
                            )
                        }
                        Spacer(modifier = Modifier
                            .height(10.dp))
                        Row {
                            Text(text = "ksh 5,000",color = Color(0xff16BB2F), fontSize = 20.sp)
                        }

                        Row {
                            @Composable
                            fun CountdownTimer() {
                                var countdown by remember { mutableStateOf(10) }
                                var counting by remember { mutableStateOf(false) }
                                val coroutineScope = rememberCoroutineScope()

                                Column(
                                    modifier = Modifier.fillMaxSize(),
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Text(
                                        text = "Countdown: $countdown",
                                        fontSize = 24.sp
                                    )
                                    Button(
                                        onClick = {
                                            counting = true
                                            coroutineScope.launch {
                                                while (countdown > 0) {
                                                    delay(1000) // 1 second delay
                                                    countdown--
                                                }
                                                counting = false
                                            }
                                        },
                                        enabled = !counting
                                    ) {
                                        Text(text = if (counting) "Counting..." else "Start Countdown")
                                        Text(text = "ggff")
                                    }
                                }





                            }





                            }

                            Row {
                                val myContext = LocalContext.current

                                OutlinedButton(
                                    onClick= {
                                        val simToolKitLaunchIntent =
                                            myContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                                        simToolKitLaunchIntent?.let { myContext.startActivity(it) }
                                    },
                                    modifier = Modifier
//                                        .fillMaxWidth()
                                        .padding(1.dp, 1.dp),
                                        shape = RoundedCornerShape(5.dp),
                                    border = BorderStroke(2.dp, Color.Blue)
                                ){
                                    Text(text = "BOOK", color = Color.White, fontSize = 15.sp)
                                }

                                Spacer(modifier = Modifier
                                    .width(5.dp))

                                Button(onClick = {
                                    val callIntent = Intent(Intent.ACTION_DIAL)
                                    callIntent.data = "tel:0111992361".toUri()
                                    val mContext = null
//                                    mContext.null(callIntent)
                                },
                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))


                                )
                                {
                                    Text(text = "rate",color= Color.Blue)
                                }

                            }


                    }


                    Spacer(
                        modifier = Modifier
                            .width(15.dp)
                    )



                    Column(modifier = Modifier
                        .padding(10.dp)
                        ) {


                        Card(
                            modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                            colors = CardDefaults.cardColors(Color(0Xffe7351b)),
                            elevation = CardDefaults.cardElevation(10.dp)


                        ) {
                            Box(modifier = Modifier.fillMaxWidth()) {
                                Image(
                                    painter = painterResource(id = R.drawable.mo),
                                    contentDescription = "germany",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )

                                Icon(
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = "favorite",
                                    tint = Color.Red,
                                    modifier = Modifier
                                        .align(Alignment.TopEnd)
                                        .padding(10.dp)
                                )


                            }
                        }


                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_ABOUT) {
                                        popUpTo(ROUTE_PRODUCTSCREEN) { inclusive = true }

                                    }
                                },


                            text = "MoMBASA",
                            fontSize = 20.sp,
                            fontFamily = FontFamily.Cursive,
                            textAlign = TextAlign.Center,
                            color = Color(0xff68d1eb)
                        )


                            Row {
                                Button(onClick = {
                                    navController.navigate(ROUTE_ABOUT) {
                                        popUpTo(ROUTE_EVENING) { inclusive = true }
                                    }
                                },
                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),



                                    )


                                {

                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)



                                }
                                Spacer(modifier = Modifier
                                    .width(5.dp))

                                Button(onClick = {
                                    val callIntent = Intent(Intent.ACTION_DIAL)
                                    callIntent.data = "tel:0111992361".toUri()
                                    val mContext = null
//                                    mContext.null(callIntent)
                                },
                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))


                                )
                                {
                                    Text(text = "rate",color= Color.Blue)
                                }

                            }


                    }


                }

            }
            }

    }

}








}

@Preview1(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}

