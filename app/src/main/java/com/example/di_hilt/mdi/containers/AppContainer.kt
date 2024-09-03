package com.example.di_hilt.mdi.containers


import com.example.di_hilt.mdi.Dam
import com.example.di_hilt.mdi.Group
import com.example.di_hilt.mdi.Ram
import com.example.di_hilt.mdi.Sam

interface ApplicationContainerInterface{
            val sam : Sam
            val ram : Ram
            val dam : Dam
            val group : Group
}
class AppContainer : ApplicationContainerInterface{
    override val sam: Sam
        get() = Sam()
    override val ram: Ram
        get() = Ram()
    override val dam: Dam
        get() = Dam()
    override val group: Group
        get() = Group(sam,ram,dam)


}