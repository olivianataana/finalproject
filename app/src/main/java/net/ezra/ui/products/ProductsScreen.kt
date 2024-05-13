package net.ezra.ui.products




import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

import net.ezra.R
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_OURSTORE
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_VOUCHER


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun ProductsScreen(navController: NavHostController) {


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "HERE WE HAVE ARRANGED ALL THE PRODUCTS",

                        fontSize = 20.sp,
                        textAlign = TextAlign.Center ,
                        textDecoration = TextDecoration.Underline,
                        fontFamily = FontFamily.Cursive,
                        color = (Color.Green),



                        modifier = Modifier
                            .background(Color.Black)




                    )


                },
                navigationIcon = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
            )
        },

        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)
                    .padding(top = 10.dp)
                    .background(Color.White),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){





                Button(onClick = {
                    navController.navigate(ROUTE_VOUCHER) {
                        popUpTo(ROUTE_PRODUCTS) { inclusive = true }
                    }
                }) {

                    Text(text = "SECURE YOUR VOUCHER CARD",
                        fontSize = 20.sp,
                        color = (Color(0xff5122b5 )),
                        textAlign = TextAlign.Center ,
                        textDecoration = TextDecoration.LineThrough,
                        fontFamily = FontFamily.Cursive,

                        modifier = Modifier
                            .background(Color.White)







                    )

                }





                Spacer(modifier = Modifier.height(5.dp))



                Column {

                    Text(text = "electronics",
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline,


                    )



                }




                LazyRow (modifier=Modifier.fillMaxWidth()){
                    item{


                        Image(
                            painter = painterResource(R.drawable.ele1),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )


                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.ele2),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.ele3),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )


                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.ele4),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )



                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.photo1),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )



                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.photo2),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )




                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.way1),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )


                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.way2),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )


                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.way3),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.way4),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )




                    }

                }














                Spacer(modifier = Modifier.height(5.dp))


                Column {

                    Text(text = "Clothing Area",
                        fontSize = 20.sp,
                        color = Color.Magenta,
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline,



                        )



                }




                LazyRow (modifier=Modifier.fillMaxWidth()){
                    item{




                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} } ,modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)
                        ) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.image1), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " wedding dresses")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} } ,modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)) {
                                Image(painter = painterResource(id = R.drawable.dresses), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = "Fancy dresses")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(
                            onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS) } },
                            modifier = Modifier
                                .padding(15.dp)
                                .height(150.dp)
                                .width(150.dp)
                                .border(
                                    shape = RoundedCornerShape(10.dp),
                                    width = 1.dp,
                                    color = Color.White
                                )
                                .shadow(elevation = 10.dp)
                        ) {
                            Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.hoodies), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = "hoodies")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.sneakers), contentDescription = "", modifier = Modifier.size(70.dp) )
                                Text(text = " sneakers for all sizes")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))


                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.suites), contentDescription = "", modifier = Modifier.size(70.dp) )
                                Text(text = " engagement suites")
                            }
                        }

                        Spacer(modifier = Modifier.width(15.dp))



                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.image4), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " Beautiful baby clothes")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.highheel), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " high heels")
                            }
                        }


                    }

                }

                Spacer(modifier = Modifier.height(5.dp))



                Column {

                    Text(text = "beauty hub",
                        fontSize = 20.sp,
                        color = Color.Cyan,
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline,



                        )



                }




                LazyRow (modifier=Modifier.fillMaxWidth()){
                    item{


                        Image(
                            painter = painterResource(R.drawable.skincare),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )


                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.jewelry),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.perfumes),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )


                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.bodylotion),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )



                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.expperfume),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )



                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.cocobutter),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )




                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.jewel),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )


                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.lipglose),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )


                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.perfumes),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )

                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.makeup),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )




                    }

                }





                Spacer(modifier = Modifier.height(5.dp))


                Column {

                    Text(text = "luxury furniture",
                        fontSize = 20.sp,
                        color = Color.Blue,
                        fontStyle = FontStyle.Italic,
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        textDecoration = TextDecoration.Underline,




                        )



                }




                LazyRow (modifier=Modifier.fillMaxWidth()){
                    item{




                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} } ,modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)
                        ) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.house1), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " house interior sits")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} } ,modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)) {
                                Image(painter = painterResource(id = R.drawable.house2), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = "comfy matress")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(
                            onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS) } },
                            modifier = Modifier
                                .padding(15.dp)
                                .height(150.dp)
                                .width(150.dp)
                                .border(
                                    shape = RoundedCornerShape(10.dp),
                                    width = 1.dp,
                                    color = Color.White
                                )
                                .shadow(elevation = 10.dp)
                        ) {
                            Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.house3), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = "affordable bathtubs")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.house4), contentDescription = "", modifier = Modifier.size(70.dp) )
                                Text(text = " affordable cookers")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))


                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.house5), contentDescription = "", modifier = Modifier.size(70.dp) )
                                Text(text = " high tables")
                            }
                        }

                        Spacer(modifier = Modifier.width(15.dp))



                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.house6), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " affordable curtains")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_SHOP) { popUpTo(ROUTE_PRODUCTS)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(
                                shape = RoundedCornerShape(10.dp),
                                width = 1.dp,
                                color = Color.White
                            )
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.house7), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " kitchen utensils")
                            }
                        }


                    }

                }
























            }




        },

        bottomBar = { BottomBar()}
    )












}

@Composable
fun BottomBar() {

    val selectedIndex = remember { mutableStateOf(0) }
    BottomNavigation(elevation = 10.dp) {

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Home,"")
        },
            label = { Text(text = "Home") },
            selected = (selectedIndex.value == 0),
            onClick = {
                selectedIndex.value = 0
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite,"")
        },
            label = { Text(text = "Favorite") },
            selected = (selectedIndex.value == 1),
            onClick = {
                selectedIndex.value = 1
            })

        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person,"")
        },
            label = { Text(text = "Profile") },
            selected = (selectedIndex.value == 2),
            onClick = {
                selectedIndex.value = 2
            })
    }
}



























@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProductsScreen(rememberNavController())
}










