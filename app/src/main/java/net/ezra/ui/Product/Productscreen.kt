package net.ezra.ui.Product
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize


import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

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

@Composable
fun CountdownApp() {
    CountdownTimer()
}
