package com.example.wtfdagger.feature

import dagger.Subcomponent

@Subcomponent
@FragmentScope
interface FeatureComponent {

    fun inject(featureFragment: FeatureFragment)

    @Subcomponent.Factory
    interface Factory {

        fun create(): FeatureComponent
    }
}
