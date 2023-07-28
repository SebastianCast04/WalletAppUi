package com.example.walletui.Screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.NorthEast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.walletui.R
import com.example.walletui.ui.theme.CustomCyan
import com.example.walletui.ui.theme.CustomDarkGray
import com.example.walletui.ui.theme.CustomLightGreen
import com.example.walletui.ui.theme.CustomOrange
import com.example.walletui.ui.theme.Green

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Preview(showSystemUi = true)
@Composable
fun ProfileScreen() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        CustomDarkGray,
                        CustomLightGreen
                    )
                )
            )
    ) {
        Scaffold(
            backgroundColor = Color.Transparent,
            topBar = {
                TopAppBar(
                    backgroundColor = Color.Transparent,
                    contentPadding = PaddingValues(horizontal = 24.dp, vertical = 16.dp),
                    elevation = 0.dp
                ) {
                    IconButton(onClick = { /*TODO*/ }) {

                        Icon(
                            modifier = Modifier.size(35.dp),
                            painter = painterResource(id = R.drawable.more),
                            contentDescription = "More",
                            tint = Color.White
                        )

                    }

                    Spacer(modifier = Modifier.weight(1f))

                    Box(
                        modifier = Modifier
                            .size(50.dp)
                            .border(
                                width = 1.dp,
                                color = CustomOrange,
                                shape = RoundedCornerShape(25f)
                            ),
                        contentAlignment = Alignment.Center,

                        ) {
                        Image(
                            painter = painterResource(id = R.drawable.profile),
                            contentDescription = "profile picture",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .size(40.dp)
                                .clip(RoundedCornerShape(5.dp))
                        )
                    }
                }
            },
            bottomBar = {
                BottomAppBar(
                    backgroundColor = Color.Transparent,
                    elevation = 0.dp,
                    modifier = Modifier.fillMaxWidth(),
                    contentPadding = PaddingValues(horizontal = 25.dp)
                ) {

                    BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {

                        androidx.compose.material.Icon(
                            painter = painterResource(id = R.drawable.home),
                            contentDescription = "Home",
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )

                    })

                    Spacer(modifier = Modifier.weight(0.5f))

                    BottomNavigationItem(selected = true, onClick = { /*TODO*/ }, icon = {

                        androidx.compose.material.Icon(
                            painter = painterResource(id = R.drawable.wallet),
                            contentDescription = "wallet",
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )

                    })
                    Spacer(modifier = Modifier.weight(0.5f))


                    BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {

                        androidx.compose.material.Icon(
                            painter = painterResource(id = R.drawable.finance),
                            contentDescription = "finance",
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )

                    })
                    Spacer(modifier = Modifier.weight(0.5f))


                    BottomNavigationItem(selected = false, onClick = { /*TODO*/ }, icon = {

                        androidx.compose.material.Icon(
                            painter = painterResource(id = R.drawable.user),
                            contentDescription = "profile",
                            tint = Color.White,
                            modifier = Modifier.size(30.dp)
                        )

                    })

                }
            }


        ) {
            Column(modifier = Modifier.padding(start = 20.dp, end = 20.dp)) {

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp, top = 15.dp)
                ) {

                    Text(
                        text = "Hello Sebastian",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.ubuntu))
                    )
                    Text(
                        text = "Welcome Back !",
                        fontSize = 15.sp,
                        color = Color.Gray,
                        fontFamily = FontFamily(Font(R.font.ubuntu))
                    )
                }

                Spacer(modifier = Modifier.height(20.dp))

                ProfileInfo(
                    heading = "Sales",
                    subHeading = "Total Sales Today",
                    valueText = "$500",
                    percentage = 55,
                    color = CustomOrange,
                    isIncreasing = true
                )
                Spacer(modifier = Modifier.height(10.dp))

                ProfileInfo(
                    heading = "Profit",
                    subHeading = "Per day ratio",
                    valueText = "$150",
                    percentage = 30,
                    color = Green,
                    isIncreasing = false
                )
                Spacer(modifier = Modifier.height(10.dp))

                ProfileInfo(
                    heading = "Orders",
                    subHeading = "Total Orders Today",
                    valueText = "$1250",
                    percentage = 80,
                    color = CustomCyan,
                    isIncreasing = true
                )
                



            }
        }

    }
}

@Composable
fun ProfileInfo(
    heading: String,
    subHeading: String,
    valueText: String,
    percentage: Int,
    color: Color,
    isIncreasing: Boolean
) {

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .height(140.dp)
            .background(Color.White.copy(0.1f))
            .padding(start = 30.dp, top = 10.dp, end = 10.dp, bottom = 10.dp)
            .fillMaxWidth()
    ) {

        Row(modifier = Modifier.fillMaxSize()) {

            Column(
                modifier = Modifier
                    .weight(7f)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {

                Text(
                    text = heading,
                    fontSize = 24.sp,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = Color.White
                )
                Text(
                    text = subHeading,
                    fontSize = 12.sp,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = Color.LightGray
                )
                Spacer(modifier = Modifier.height(5.dp))

                Text(
                    text = valueText,
                    fontSize = 30.sp,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = color
                )

            }

            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxHeight()
            ) {

                androidx.compose.material.Icon(
                    imageVector = Icons.Default.ArrowForward,
                    tint = color ,
                    contentDescription = "Arrow",
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .rotate(if (isIncreasing) -45f else 45f)
                )

                Text(
                    text = "$percentage",
                    modifier = Modifier.align(Alignment.Center),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(Font(R.font.ubuntu)),
                    color = color
                )

                Canvas(
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(70.dp)
                ) {

                    drawArc(
                        color = color,
                        startAngle = -120f,
                        sweepAngle = 360 * percentage / 100f,
                        useCenter = false,
                        style = Stroke(width = 10f, cap = StrokeCap.Round)
                    )
                }


            }

        }

    }
}
