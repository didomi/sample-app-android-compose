package io.didomi.sampleappcompose.ui.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.didomi.sampleappcompose.ui.theme.DidomiBlue5
import io.didomi.sampleappcompose.ui.theme.SampleAppJetpackComposeTheme

@Composable
fun Button(label: String, action: () -> Unit) {
    androidx.compose.material.Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = DidomiBlue5),
        onClick = { action.invoke() },
    ) {
        Text(
            modifier = Modifier.padding(start = 12.dp, end = 12.dp, top = 8.dp, bottom = 8.dp),
            color = Color.White,
            text = label,
            textAlign = TextAlign.Center,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonPreview() {
    SampleAppJetpackComposeTheme {
        Button("Dummy") {}
    }
}