package com.example.wtfdagger

import com.example.wtfdagger.activities.ActivitiesInjectors
import com.example.wtfdagger.feature.FeatureComponent
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivitiesInjectors::class,
        ReplaceableModule::class,
    ]
)
interface MainComponent : AndroidInjector<MainApplication> {

    fun featureComponent(): FeatureComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance app: MainApplication
        ): MainComponent
    }
}