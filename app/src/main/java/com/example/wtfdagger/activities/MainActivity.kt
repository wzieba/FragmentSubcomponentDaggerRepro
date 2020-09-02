package com.example.wtfdagger.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wtfdagger.R
import com.example.wtfdagger.analytics.Analytics
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Any>

    @Inject
    lateinit var analytics: Analytics

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        assert(analytics.value == 112)
    }

    override fun androidInjector(): AndroidInjector<Any> = androidInjector
}