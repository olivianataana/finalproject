
package net.ezra.ui.contact

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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontFamily
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
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_LOGIN
import net.ezra.navigation.ROUTE_OURSTORE
import net.ezra.navigation.ROUTE_SIGNUP
import net.ezra.navigation.ROUTE_VOUCHER


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun ContactScreen(navController: NavHostController) {

   Box {




       Image(painter = painterResource(id = R.drawable.contactpa),
           contentDescription = "Logo",

           modifier = Modifier
               .fillMaxWidth()
               .fillMaxHeight(),
           contentScale = ContentScale.Crop
       )







       Scaffold(
           topBar = {
               TopAppBar(
                   title = {
                       Text(
                           text = "WELCOME TO OUR CONTACT PAGE",

                           modifier = Modifier

                               .background(Color.Cyan)

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
                       .background(Color.Magenta),
                   verticalArrangement = Arrangement.Center,
                   horizontalAlignment = Alignment.CenterHorizontally
               ) {


                   Text(
                       text = "FEEL FREE TO CONTACT US VIA ANY OF OUR SOCIAL MEDIA PLATFORMS",


                       fontSize = 30.sp,
                       textAlign = TextAlign.Center,
                       textDecoration = TextDecoration.Underline,
                       fontFamily = FontFamily.Cursive,
                       color = (Color.Black)


                   )

                   Spacer(modifier = Modifier.height(40.dp))















                   Button(onClick = {
                       navController.navigate(ROUTE_SIGNUP) {
                           popUpTo(ROUTE_HOME) { inclusive = true }
                       }
                   }) {

                       Text(
                           text = "GET STARTED BY SIGNING UP",
                           fontSize = 20.sp,
                           textDecoration = TextDecoration.LineThrough,
                           color = (Color.White)


                       )

                   }






                   Spacer(modifier = Modifier.height(30.dp))



                   Button(onClick = {
                       navController.navigate(ROUTE_SHOP) {
                           popUpTo(ROUTE_CONTACT) { inclusive = true }
                       }
                   }) {

                       Text(
                           text = "have you seen our shop",
                           fontSize = 30.sp,
                           textAlign = TextAlign.Center,
                           textDecoration = TextDecoration.Underline,
                           fontFamily = FontFamily.Cursive,
                           color = (Color.White)


                       )

                   }


                   Spacer(modifier = Modifier.height(60.dp))




                   Button(onClick = {
                       navController.navigate(ROUTE_HOME) {
                           popUpTo(ROUTE_CONTACT) { inclusive = true }
                       }
                   }) {

                       Text(
                           text = "HOMEPAGE",
                           fontSize = 30.sp,
                           textAlign = TextAlign.Center,
                           textDecoration = TextDecoration.Underline,
                           fontFamily = FontFamily.Cursive,
                           color = (Color.White)


                       )

                   }


               }






               @Composable
               fun SocialMediaIcons() {
                   Column {
                       Icon(
                           imageVector = ImageVector.vectorResource(R.drawable.ic_instagram),
                           contentDescription = "Instagram Icon",
                           tint = Color.Unspecified,
                           modifier = Modifier.size(48.dp)
                       )
                       Spacer(modifier = Modifier.height(8.dp))
                       Icon(
                           imageVector = ImageVector.vectorResource(R.drawable.ic_twitter),
                           contentDescription = "Twitter Icon",
                           tint = Color.Unspecified,
                           modifier = Modifier.size(48.dp)
                       )
                       Spacer(modifier = Modifier.height(8.dp))
                       Icon(
                           imageVector = ImageVector.vectorResource(R.drawable.ic_facebook),
                           contentDescription = "Facebook Icon",
                           tint = Color.Unspecified,
                           modifier = Modifier.size(48.dp)
                       )
                   }
               }














           },

           bottomBar = { BottomBar() }
       )


   }




    }

    @Composable
    fun BottomBar() {

        val selectedIndex = remember { mutableStateOf(0) }
        BottomNavigation(elevation = 10.dp) {

            BottomNavigationItem(icon = {
                Icon(imageVector = Icons.Default.Home, "")
            },
                label = { Text(text = "Home") },
                selected = (selectedIndex.value == 0),
                onClick = {
                    selectedIndex.value = 0
                })

            BottomNavigationItem(icon = {
                Icon(imageVector = Icons.Default.Favorite, "")
            },
                label = { Text(text = "Favorite") },
                selected = (selectedIndex.value == 1),
                onClick = {
                    selectedIndex.value = 1
                })

            BottomNavigationItem(icon = {
                Icon(imageVector = Icons.Default.Person, "")
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
    ContactScreen(rememberNavController())
}







































