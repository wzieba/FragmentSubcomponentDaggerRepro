package com.example.wtfdagger.activities

import com.example.wtfdagger.feature.FeatureComponent
import dagger.Module

@Module(subcomponents = [FeatureComponent::class])
object MainActivityInjectors