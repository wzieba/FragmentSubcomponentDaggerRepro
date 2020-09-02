package com.example.wtfdagger.activities

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivitiesInjectors {

    @ContributesAndroidInjector(modules = [MainActivityInjectors::class])
    internal abstract fun mainActivity(): MainActivity
}