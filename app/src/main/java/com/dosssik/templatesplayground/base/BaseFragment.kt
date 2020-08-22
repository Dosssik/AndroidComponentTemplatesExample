package com.dosssik.templatesplayground.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment<out T: BaseViewModel> : Fragment() {

    abstract val viewModel: T

    protected abstract fun getContentView(): View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // potential tricks with view, like content/loading/error states initialization, insets handling etc
        return getContentView()
    }
}