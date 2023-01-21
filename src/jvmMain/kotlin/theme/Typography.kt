package theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font
import androidx.compose.ui.unit.sp

data class Typography(
    val fontColor: Color = Color.Transparent,
    val fontFamily: FontFamily = FontFamily(
        Font(resource = "fonts/heebo_bold.ttf", weight = FontWeight.Bold),
        Font(resource = "fonts/heebo_black.ttf", weight = FontWeight.Black),
        Font(resource = "fonts/heebo_extra_bold.ttf", weight = FontWeight.ExtraBold),
        Font(resource = "fonts/heebo_extra_light.ttf", weight = FontWeight.ExtraLight),
        Font(resource = "fonts/heebo_light.ttf", weight = FontWeight.Light),
        Font(resource = "fonts/heebo_medium.ttf", weight = FontWeight.Medium),
        Font(resource = "fonts/heebo_regular.ttf", weight = FontWeight.Normal),
        Font(resource = "fonts/heebo_semi_bold.ttf", weight = FontWeight.SemiBold),
        Font(resource = "fonts/heebo_thin.ttf", weight = FontWeight.Thin),
    ),
    val title: TextStyle = TextStyle(
        fontFamily = fontFamily,
        color = fontColor,
        fontWeight = FontWeight.Bold,
        fontSize = 18.sp
    ),
    val smallTitle: TextStyle = TextStyle(
        fontFamily = fontFamily,
        color = fontColor,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    ),
    val subtitle: TextStyle = TextStyle(
        fontFamily = fontFamily,
        color = fontColor,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    ),
    val body: TextStyle = TextStyle(
        fontFamily = fontFamily,
        color = fontColor,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )
)