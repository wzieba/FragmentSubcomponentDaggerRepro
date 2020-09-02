package com.example.wtfdagger.analytics

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
object AnalyticsModule {

    var counter = 0

    @Provides
    @Singleton
    internal fun provideSomething(): Analytics {
        println("Providing singleton")
        counter++

        if (counter > 1) throw IllegalStateException()

        return Analytics()
    }

}