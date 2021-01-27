import androidx.compose.desktop.Window
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random.Default.nextInt

fun main() {
    val appTitle = "Typer"
    Window(title = appTitle) {
        val content2 = remember { mutableStateOf("") }
        val startTime = remember { mutableStateOf(0L) }
        Column(modifier = Modifier.padding(16.dp)) {
            Row {
                Button(
                    onClick = {
                        content2.value = Constants.testText[nextInt(Constants.testText.size)]
                        startTime.value = System.currentTimeMillis()
                    }
                ) {
                    Text("Start")
                }

            }
            Text(content2.value, fontSize = 24.sp, modifier = Modifier.padding(0.dp, 8.dp))

        }
    }
}