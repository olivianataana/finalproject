package net.ezra.ui.shop




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

fun ShopScreen(navController: NavHostController) {


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "WELCOME TO OUR FANTASTIC SHOP",
                        fontSize = 20.sp,
                        color = (Color.Magenta),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.ExtraBold,
                        fontStyle = FontStyle.Italic,
                        textDecoration = TextDecoration.Underline,




                        modifier = Modifier
                            .background(Color.White)





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
                    .background(Color(0xff129ba4)),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){



                Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically) {
                    var text by remember { mutableStateOf(TextFieldValue("")) }
                    OutlinedTextField(
                        value = text,
                        trailingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = "searchIcon",modifier=Modifier.clickable {  navController.navigate(
                            ROUTE_SHOP) { popUpTo(
                            ROUTE_PRODUCTS)} }) },
                        //trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
                        onValueChange = {
                            text = it
                        },
                        label = { Text(text = "Search desired goods") },
                        placeholder = { Text(text = "Search desired goods") },
                        modifier = Modifier
                            .background(Color.White)
                            .width(300.dp)
                    )
                }




                Image(
                    modifier = Modifier
                        .size(128.dp, 128.dp),
                    painter = painterResource(id = R.drawable.name),
                    contentDescription = stringResource(id = R.string.app_name)
                )





                Spacer(modifier = Modifier.height(20.dp))













                Button(onClick = {
                    navController.navigate(ROUTE_OURSTORE) {
                        popUpTo(ROUTE_SHOP) { inclusive = true }
                    }
                }) {

                    Text(text = "visit our store",
                        fontSize = 40.sp,
                        color = (Color.White),
                        fontFamily = FontFamily.Cursive,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,





                    )

                }

                Spacer(modifier = Modifier.height(20.dp))





                LazyRow (modifier=Modifier.fillMaxWidth()){
                    item{





                        Card(
                            onClick = { navController.navigate(ROUTE_PRODUCTS) { popUpTo(ROUTE_SHOP) } },
                            modifier = Modifier
                                .padding(15.dp)
                                .height(150.dp)
                                .width(150.dp)
                                .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                .shadow(elevation = 10.dp)
                        ) {
                            Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.image3), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = "Cool cars")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_PRODUCTS) { popUpTo(ROUTE_SHOP)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.stock), contentDescription = "", modifier = Modifier.size(70.dp) )
                                Text(text = " food ingredients")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))


                        Card(onClick = { navController.navigate(ROUTE_PRODUCTS) { popUpTo(ROUTE_SHOP)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.photo1), contentDescription = "", modifier = Modifier.size(70.dp) )
                                Text(text = " Smart phones")
                            }
                        }

                        Spacer(modifier = Modifier.width(15.dp))



                        Card(onClick = { navController.navigate(ROUTE_PRODUCTS) { popUpTo(ROUTE_SHOP)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.image4), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " Beautiful baby clothes")
                            }
                        }
                        Spacer(modifier = Modifier.width(15.dp))

                        Card(onClick = { navController.navigate(ROUTE_PRODUCTS) { popUpTo(ROUTE_SHOP)} },modifier = Modifier
                            .padding(15.dp)
                            .height(150.dp)
                            .width(150.dp)
                            .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                            .shadow(elevation = 10.dp)) {
                            Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                Color.White)){
                                Image(painter = painterResource(id = R.drawable.image5), contentDescription = "" , modifier = Modifier.size(70.dp))
                                Text(text = " Amazing shoes")




                                Card(onClick = { navController.navigate(ROUTE_PRODUCTS) { popUpTo(ROUTE_SHOP)} } ,modifier = Modifier
                                    .padding(15.dp)
                                    .height(150.dp)
                                    .width(150.dp)
                                    .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                    .shadow(elevation = 10.dp)
                                ) {
                                    Row (horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.background(
                                        Color.White)){
                                        Image(painter = painterResource(id = R.drawable.image1), contentDescription = "" , modifier = Modifier.size(70.dp))
                                        Text(text = " wedding dresses")
                                    }
                                }
                                Spacer(modifier = Modifier.width(15.dp))

                                Card(onClick = { navController.navigate(ROUTE_PRODUCTS) { popUpTo(ROUTE_SHOP)} } ,modifier = Modifier
                                    .padding(15.dp)
                                    .height(150.dp)
                                    .width(150.dp)
                                    .border(shape = RoundedCornerShape(10.dp), width = 1.dp, color = Color.White)
                                    .shadow(elevation = 10.dp)) {
                                    Row(horizontalArrangement = Arrangement.Absolute.Center, verticalAlignment = Alignment.CenterVertically,modifier = Modifier.background(
                                        Color.White)) {
                                        Image(painter = painterResource(id = R.drawable.image2), contentDescription = "" , modifier = Modifier.size(70.dp))
                                        Text(text = " Baby toys")
                                    }
                                }
                                Spacer(modifier = Modifier.width(15.dp))





                            }
                        }


                    }

                }


                LazyRow (modifier=Modifier.fillMaxWidth()){
                    item{


                        Image(
                            painter = painterResource(R.drawable.house),
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
                            painter = painterResource(R.drawable.sneakers),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )



                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.suites),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )



                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.dresses),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )




                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.highheel),
                            contentDescription = "Circle Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(128.dp)
                                .clip(CircleShape) // clip to the circle shape
                                .border(5.dp, Color.White, CircleShape)//optional
                        )


                        Spacer(modifier = Modifier.width(15.dp))

                        Image(
                            painter = painterResource(R.drawable.hoodies),
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
    ShopScreen(rememberNavController())
}










