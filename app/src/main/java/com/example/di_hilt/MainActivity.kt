package com.example.di_hilt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.di_hilt.mdi.Group
import com.example.di_hilt.mdi.containers.AppContainer
import com.example.di_hilt.mdi.containers.ApplicationContainerInterface
import com.example.di_hilt.ui.theme.DI_HiltTheme
import com.example.di_hilt.ui.view.MainScreenView

class MainActivity : ComponentActivity() {
/*    private lateinit var group : Group
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        group = (application as MdiMyApp).group
        setContent {
            DI_HiltTheme {
                MainScreenView(group)
            }
        }
    }*/
    // Remove Group Column in Without Constructor case

    // Part of Mannual Dependency Injection with out using Cotainer
    // with Container below
    // we can access this container in any activity and viewModel easily.


    private lateinit var container: ApplicationContainerInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        container = (application as MdiMyApp).container
        setContent {
            DI_HiltTheme {
                MainScreenView(container)
            }
        }
    }
}

