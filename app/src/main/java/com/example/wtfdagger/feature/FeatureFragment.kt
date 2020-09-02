package com.example.wtfdagger.feature

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wtfdagger.HasFeatureComponent
import com.example.wtfdagger.R
import com.example.wtfdagger.analytics.Analytics
import javax.inject.Inject

class FeatureFragment : Fragment() {

    @Inject
    lateinit var analytics: Analytics

    override fun onAttach(context: Context) {
        (requireActivity().application as HasFeatureComponent).featureComponent().create().inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        assert(analytics.value == 112)
    }
}