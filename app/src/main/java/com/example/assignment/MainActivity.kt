package com.example.assignment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment.ui.theme.AssignmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AssignmentTheme {
                //HomePage()
                ParentLoginPage()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomePage() {

//    var isClicked by remember { mutableStateOf(false) }
//
//    // Define an animation spec for the color transition
//    val colorTransition = updateTransition(targetState = isClicked, label = "Color Transition")
//
//    // Define color animation
//    val color by colorTransition.animateColor(
//        transitionSpec = {
//            tween(durationMillis = 500) // 500 milliseconds fade animation
//        },
//        label = "Color Animation"
//    ) { clicked ->
//        if (clicked) {
//            Color(0xff5b5b5b) // New color when clicked
//        } else {
//            Color.Transparent // Original color when not clicked
//        }
//    }
//
//    // Define alpha animation
//    val alpha by colorTransition.animateFloat(
//        transitionSpec = {
//            tween(durationMillis = 500) // 500 milliseconds fade animation
//        },
//        label = "Alpha Animation"
//    ) { clicked ->
//        if (clicked) {
//            1f // Fully opaque when clicked
//        } else {
//            0f // Fully transparent when not clicked
//        }
//    }
//

    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .absolutePadding(10.dp),
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painterResource(R.drawable.logo),
                    contentDescription = "logo",
                    modifier = Modifier
                        .size(90.dp)
                        .padding(5.dp)
                )

                Text(
                    text = "Super TAR Education Group",
                    modifier = Modifier.align(Alignment.CenterVertically),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Bottom
        ){
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color.Gray)
            )
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                verticalAlignment = Alignment.Bottom
            ){
                Spacer(modifier = Modifier.weight(0.5f))
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.clickable {
//                        isClicked = !isClicked
                    }
//                        .background(
//                            color = if(isClicked) Color.LightGray else Color.Transparent,
//                            shape = RoundedCornerShape(100.dp)
//                        )
                ) {
                    Image(
                        painterResource(R.drawable.home),
                        contentDescription = "home",
                        modifier = Modifier.size(39.dp)
                    )
                    Text(text = "Home", fontSize = 11.sp, color = Color(0xff5b5b5b))
                }
                Spacer(modifier = Modifier.weight(1f))
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.clickable {  }
                ){
                    Image(painterResource(R.drawable.teacher), contentDescription = "teacher", modifier = Modifier.size(39.dp))
                    Text(text = "Teacher", fontSize = 11.sp, color = Color(0xff5b5b5b))                }
                Spacer(modifier = Modifier.weight(1f))
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.clickable {  }
                ){
                    Image(painterResource(R.drawable.parent), contentDescription = "parent", modifier = Modifier.size(39.dp))
                    Text(text = "Parent", fontSize = 11.sp, color = Color(0xff5b5b5b))                }
                Spacer(modifier = Modifier.weight(0.5f))
            }
            Spacer(modifier = Modifier.height(15.dp))
        }

    }
}


@Preview(showBackground = true)
@Composable
fun ParentLoginPage(){
    var userID by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Spacer(modifier = Modifier.weight(0.5f))
        Text(text = "Parent Login", fontSize = 25.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(), color = Color.Black)

        Spacer(modifier = Modifier.weight(0.8f))
        Text(text = "User ID", fontSize = 15.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(),color = Color(0xffbd5683))
        Spacer(modifier = Modifier.weight(0.1f))

        EditTextField(
            label = R.string.userid,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Next
            ),
            value = userID,
            onValueChanged = { userID = it }
        )
        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "Password", fontSize = 15.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth(), color = Color(0xffbd5683))
        Spacer(modifier = Modifier.weight(0.1f))

        EditTextField(
            label = R.string.password,
            keyboardOptions = KeyboardOptions.Default.copy(
                keyboardType = KeyboardType.Text,
                imeAction = ImeAction.Done
            ),
            value = password,
            onValueChanged = { password = it }
        )
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            buildAnnotatedString {
                withStyle(style = SpanStyle(textDecoration = TextDecoration.Underline)) {
                    append("Forgot Password?")
                }
            },
            fontSize = 11.sp,
            color = Color(0xffbd5683)
            )
        Spacer(modifier = Modifier.height(50.dp))

        Row() {
            Spacer(modifier = Modifier.weight(1f))
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color(0xffbd5683)),
                modifier = Modifier
                    .height(45.dp)
                    .weight(4f)
                    .shadow(elevation = 10.dp, shape = CircleShape)
            ) {
                Text(text = "Login", fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.weight(1f))
        }

        Spacer(modifier = Modifier.weight(3f))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color.Gray)
        )
        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            verticalAlignment = Alignment.Bottom
        ){
            Spacer(modifier = Modifier.weight(0.5f))
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {  }
            ){
                Image(painterResource(R.drawable.home), contentDescription = "home", modifier = Modifier.size(39.dp))
                Text(text = "Home", fontSize = 11.sp, color = Color(0xff5b5b5b))
            }
            Spacer(modifier = Modifier.weight(1f))
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {  }
            ){
                Image(painterResource(R.drawable.teacher), contentDescription = "teacher", modifier = Modifier.size(39.dp))
                Text(text = "Teacher", fontSize = 11.sp, color = Color(0xff5b5b5b))                }
            Spacer(modifier = Modifier.weight(1f))
            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.clickable {  }
            ){
                Image(painterResource(R.drawable.parent), contentDescription = "parent", modifier = Modifier.size(39.dp))
                Text(text = "Parent", fontSize = 11.sp, color = Color(0xff5b5b5b))                }
            Spacer(modifier = Modifier.weight(0.5f))
        }
        Spacer(modifier = Modifier.height(15.dp))
    }
}

@Composable
fun EditTextField(
    @StringRes label: Int,
    keyboardOptions: KeyboardOptions,
    value: String,
    onValueChanged: (String) -> Unit) {
    var image = R.drawable.show
    var show by remember { mutableStateOf(false) }

    Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
        Spacer(modifier = Modifier.weight(1f))
        Box (
            modifier = Modifier.weight(4f)
        ) {
            TextField(
                modifier = Modifier.border(2.dp, Color(0xffbd5683), CircleShape),
                value = value,
                shape = RoundedCornerShape(20.dp),
                singleLine = true,
                onValueChange = onValueChanged,
                textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                label = {
                    Text(
                        stringResource(label),
                        fontSize = 12.sp,
                        color = Color(0xffbd5683)
                    )
                },
                keyboardOptions = keyboardOptions,
                colors = TextFieldDefaults.colors(
                    cursorColor = Color(0xffbd5683),
                    focusedIndicatorColor = Color(0xffFBE9F0),
                    unfocusedIndicatorColor = Color(0xffFBE9F0),
                    focusedContainerColor = Color(0xffFBE9F0),
                    unfocusedContainerColor = Color(0xffFBE9F0),
                    focusedTextColor = Color(0xff9e446d),
                    unfocusedTextColor = Color(0xff9e446d)
                )
            )
            if (label == R.string.password) {
                Image(painter = painterResource(if(show) R.drawable.hide else R.drawable.show), contentDescription = "show",
                    modifier = Modifier
                        .size(40.dp)
                        .padding(top = 5.dp, bottom = 5.dp, end = 15.dp)
                        .align(Alignment.CenterEnd)
                        .clickable { show = !show }
                )
            }
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
