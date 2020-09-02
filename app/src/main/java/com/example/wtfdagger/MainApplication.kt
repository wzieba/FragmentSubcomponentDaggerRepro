package com.example.wtfdagger

import com.example.wtfdagger.feature.FeatureComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class MainApplication : DaggerApplication(), HasFeatureComponent {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerMainComponent.factory().create(this)
    }

    override fun featureComponent(): FeatureComponent.Factory = (applicationInjector() as MainComponent).featureComponent()
}