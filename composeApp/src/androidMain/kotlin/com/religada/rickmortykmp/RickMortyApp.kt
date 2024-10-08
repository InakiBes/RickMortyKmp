package com.religada.rickmortykmp

import android.app.Application
import com.religada.rickmortykmp.di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class RickMortyApp :Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidLogger()
            androidContext(this@RickMortyApp)
        }
    }

}