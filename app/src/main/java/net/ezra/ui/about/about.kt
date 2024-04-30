package net.ezra.ui.about

import android.content.Intent
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
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
import net.ezra.ui.theme.AppTheme



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AboutScreen(navController: NavHostController) {

    Box(modifier = Modifier
//
        .fillMaxSize()
        .fillMaxWidth()
        .background(color = Color.Black)){

        LazyColumn {

            item {
                Column (modifier = Modifier
                    .padding(20.dp)){

//                val mContext = LocalContext.current
                    TopAppBar(




                        title = {

                            Row {
                                Text(
                                    text = "Travel with us",
                                    color = Color(0xff1f6d80),
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 15.sp

                                )
                                Spacer(modifier = Modifier
                                    .width(6.dp))
                                Image(
                                    painter = painterResource(id = R.drawable.sta),
                                    contentDescription ="High 2",
                                    modifier = Modifier
                                        .height(25.dp)
                                        .width(15.dp)
                                        .background(color = Color.Black)
                                        .size(5.dp)
//                                        .clip(shape = CircleShape),
//                                    contentScale = ContentScale.Crop

                                )
                                Spacer(modifier = Modifier
                                    .width(6.dp))


                                Image(
                                    painter = painterResource(id = R.drawable.sta),
                                    contentDescription ="High 2",
                                    modifier = Modifier
                                        .height(25.dp)
                                        .width(15.dp)
                                        .background(color = Color.Black)
                                        .size(5.dp)
//                                        .clip(shape = CircleShape),
//                                    contentScale = ContentScale.Crop

                                )
                                Spacer(modifier = Modifier
                                    .width(6.dp))

                                Image(
                                    painter = painterResource(id = R.drawable.sta),
                                    contentDescription ="High 2",
                                    modifier = Modifier
                                        .height(25.dp)
                                        .width(15.dp)
                                        .background(color = Color.Black)
                                        .size(5.dp)
//                                        .clip(shape = CircleShape),
//                                    contentScale = ContentScale.Crop

                                )
                                Spacer(modifier = Modifier
                                    .width(6.dp))


                                Image(
                                    painter = painterResource(id = R.drawable.sta),
                                    contentDescription ="High 2",
                                    modifier = Modifier
                                        .height(25.dp)
                                        .width(15.dp)
                                        .background(color = Color.Black)
                                        .size(5.dp)
//                                        .clip(shape = CircleShape),
//                                    contentScale = ContentScale.Crop

                                )
                                Spacer(modifier = Modifier
                                    .width(6.dp))
                                Image(
                                    painter = painterResource(id = R.drawable.sta),
                                    contentDescription ="High 2",
                                    modifier = Modifier
                                        .height(25.dp)
                                        .width(15.dp)
                                        .background(color = Color.Black)
                                        .size(5.dp)
//                                        .clip(shape = CircleShape),
//                                    contentScale = ContentScale.Crop

                                )





                            }



                        },


                        actions = {
                            Image(
                                painter = painterResource(id = R.drawable.not),
                                contentDescription ="High 2",
                                modifier = Modifier
                                    .background(color = Color.White)
                                    .size(15.dp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop

                            )

                            Text(
                                modifier = Modifier

                                    .clickable {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }

                                        }
                                    },


                                text = "",
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier = Modifier
                                .width(10.dp))


                            Image(
                                painter = painterResource(id = R.drawable.cha),
                                contentDescription ="High 2",
                                modifier = Modifier

                                    .size(15.dp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop

                            )


                            Text(
                                modifier = Modifier

                                    .clickable {
                                        navController.navigate(ROUTE_ABOUT) {
                                            popUpTo(ROUTE_EVENING) { inclusive = true }

                                        }




                                    },


                                text = "",
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurface
                            )
                            Spacer(modifier = Modifier
                                .width(10.dp))


                            Image(
                                painter = painterResource(id = R.drawable.ip),
                                contentDescription ="High 2",
                                modifier = Modifier

                                    .size(15.dp)
                                    .clip(shape = CircleShape),
                                contentScale = ContentScale.Crop

                            )


                            Text(
                                modifier = Modifier

                                    .clickable {
                                        navController.navigate(ROUTE_HOME) {
                                            popUpTo(ROUTE_ABOUT) { inclusive = true }

                                        }




                                    },


                                text = "",
                                textAlign = TextAlign.Center,
                                color = MaterialTheme.colorScheme.onSurface
                            )






//
//

                        }, colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black)
                    )

                    Spacer(modifier = Modifier
                        .height(20.dp))




                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_HOME) {
                                    popUpTo(ROUTE_ABOUT) { inclusive = true }

                                }
                            },


                        text = "CITIES",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center,
                        color = Color(0xff1f6d80)
                    )
                    Spacer(modifier = Modifier
                        .height(10.dp))

                    Row {
                        Column {
                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0XffFB3207)),
                                elevation = CardDefaults.cardElevation(0.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.fit),
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


                                   text = "NAIROBI",
                                   fontSize = 20.sp,
                                   fontFamily = FontFamily.Cursive,
                                   textAlign = TextAlign.Center,
                                   color = Color(  0xff1f6d80)
                               )
                           }
//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }



                        }


                        Spacer(modifier = Modifier
                            .width(20.dp))



                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0Xffe7351b )),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
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
                                color = Color(0xff68d1eb )
                            )


//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                    )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }







                        }













                        Spacer(modifier = Modifier
                            .height(10.dp))







                    }

                    Row {
                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0Xffe7351b )),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.kis),
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


                                text = "KISUMU",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                textAlign = TextAlign.Center,
                                color = Color( 0xff68d1eb)
                            )

//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                    )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }
//



                        }
                        Spacer(modifier = Modifier
                            .width(20.dp))



                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xff68d1eb)),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.el),
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


                                text = "ELDORET",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                textAlign = TextAlign.Center,
                                color = Color( 0xff68d1eb)
                            )


//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                    )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }


                        }





                    }

                    Row {
                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0Xffe7351b )),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.mal),
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


                                text = "MALINDI",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                textAlign = TextAlign.Center,
                                color = Color( 0xff68d1eb)
                            )

//                            Row {
//                                Button(onClick = {
//                                    navController.navigate(ROUTE_ABOUT) {
//                                        popUpTo(ROUTE_EVENING) { inclusive = true }
//                                    }
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb )),
//
//
//
//                                    )
//
//
//                                {
//
//                                    Text(text = "Get ticket",color= Color.Black, fontSize = 9.sp)
//
//
//
//                                }
//                                Spacer(modifier = Modifier
//                                    .width(5.dp))
//
//                                Button(onClick = {
//                                    val callIntent = Intent(Intent.ACTION_DIAL)
//                                    callIntent.data = "tel:0111992361".toUri()
//                                    val mContext = null
////                                    mContext.null(callIntent)
//                                },
//                                    colors = ButtonDefaults.buttonColors(Color(0xff68d1eb ))
//
//
//                                )
//                                {
//                                    Text(text = "rate",color= Color.Blue)
//                                }
//
//                            }




                        }
                        Spacer(modifier = Modifier
                            .width(20.dp))



                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.nak),
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


                                text = "NAKURU",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                textAlign = TextAlign.Center,
                                color = Color( 0xff68d1eb)
                            )

//


                        }










                    }

                    Row {



                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.nye),
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


                                text = "NYERI",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                textAlign = TextAlign.Center,
                                color = Color( 0xff68d1eb)
                            )

//


                        }
                        Spacer(modifier = Modifier
                            .width(20.dp))

                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.emb),
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


                                text = "EMBU",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                textAlign = TextAlign.Center,
                                color = Color( 0xff68d1eb)
                            )

//


                        }






                    }


                    Row {

                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.mach),
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


                                text = "MACHAKOS",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                textAlign = TextAlign.Center,
                                color = Color( 0xff68d1eb)
                            )

//


                        }
                        Spacer(modifier = Modifier
                            .width(20.dp))



                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.mg),
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


                                text = "MURANGA",
                                fontSize = 20.sp,
                                fontFamily = FontFamily.Cursive,
                                textAlign = TextAlign.Center,
                                color = Color( 0xff68d1eb)
                            )

//


                        }




                    }
                    Row {


                        Column {


                            Card (modifier = Modifier
                                .height(110.dp)
                                .width(150.dp)
                                .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xff68d1eb )),
                                elevation = CardDefaults.cardElevation(10.dp)


                            ){
                                Box(modifier = Modifier.fillMaxWidth()) {
                                    Image(
                                        painter = painterResource(id = R.drawable.`in`),
                                        contentDescription = "germany",
                                        modifier = Modifier.fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )

                                    Icon(
                                        imageVector = Icons.Default.Add,
                                        contentDescription = "favorite",
                                        tint = Color.Blue,
                                        modifier = Modifier
                                            .align(Alignment.TopEnd)
                                            .padding(10.dp)
                                    )




                                }
                                Text(
                                    modifier = Modifier

                                        .clickable {
                                            navController.navigate(ROUTE_ABOUT) {
                                                popUpTo(ROUTE_PRODUCTSCREEN) { inclusive = true }

                                            }
                                        },


                                    text = "MURANGA",
                                    fontSize = 20.sp,
                                    fontFamily = FontFamily.Cursive,
                                    textAlign = TextAlign.Center,
                                    color = Color( 0xff68d1eb)
                                )

                            }




//


                        }

                    }
















                }


            }


        }






    }






}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    AboutScreen(rememberNavController())
}

