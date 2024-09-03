package com.example.di_hilt

import android.app.Application
import com.example.di_hilt.mdi.containers.AppContainer
import com.example.di_hilt.mdi.containers.ApplicationContainerInterface

class MdiMyApp : Application() {
    /*    lateinit var group : Group
            private set
        override fun onCreate() {
            super.onCreate()
            // Initialize Dependencies
            val sam = Sam()
            val ram = Ram()
            val dam = Dam()

            group = Group(sam,ram,dam)*/
    // Part of Mannual Dependency Injection with Out using Containers Package

    // with Container Package
    lateinit var container: ApplicationContainerInterface
    override fun onCreate() {
        super.onCreate()
        container = AppContainer()
    }
}