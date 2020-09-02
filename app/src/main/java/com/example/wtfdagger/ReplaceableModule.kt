package com.example.wtfdagger

import com.example.wtfdagger.analytics.AnalyticsModule
import com.example.wtfdagger.feature.FeatureComponent
import dagger.Module

@Module(includes = [AnalyticsModule::class])
object ReplaceableModule
