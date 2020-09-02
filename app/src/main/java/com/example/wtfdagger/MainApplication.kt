package com.example.wtfdagger

import com.example.wtfdagger.feature.FeatureComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApplication : DaggerApplication(), HasFeatureComponent {

    lateinit var component: MainComponent

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        component = DaggerMainComponent.factory().create(this)
        return component
    }

    override fun featureComponent(): FeatureComponent.Factory = component.featureComponent()
}