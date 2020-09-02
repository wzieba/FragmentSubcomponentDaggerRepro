package com.example.wtfdagger

import com.example.wtfdagger.feature.FeatureComponent

interface HasFeatureComponent {

    fun featureComponent(): FeatureComponent.Factory
}