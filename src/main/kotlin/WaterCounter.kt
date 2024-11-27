import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter (modifier: Modifier = Modifier) {
    val count = 0
    Text(
        text = "Tienes $count gafas.",
        modifier = Modifier.padding(16.dp)
    )
}