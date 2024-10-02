package com.example.fabatv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fabatv.ui.theme.FabATVTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FabATVTheme {
                FABATV()
            }
        }
    }
}

@Composable
fun FABATV() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        FloatingActionButton(
            onClick = { /* TODO */ },
        ) {
            Icon(Icons.Filled.Add, contentDescription = "Adicionar")
        }

        SmallFloatingActionButton(
            onClick = { /* TODO */ },
        ) {
            Icon(Icons.Filled.Add, contentDescription = "pequeno")
        }

        LargeFloatingActionButton(
            onClick = { /* TODO */ },
        ) {
            Icon(Icons.Filled.Add, contentDescription = "grande")
        }

        ExtendedFloatingActionButton(
            onClick = { /* TODO */ },
            icon = { Icon(Icons.Filled.Edit, contentDescription = "Editar") },
            text = { Text("FAB Estendido") }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFAB() {
    FabATVTheme {
        FABATV()
    }
}