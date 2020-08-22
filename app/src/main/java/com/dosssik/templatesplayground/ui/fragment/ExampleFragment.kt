package com.dosssik.templatesplayground.ui.fragment

import android.view.View
import com.dosssik.templatesplayground.databinding.ExampleFragmentBinding
import com.dosssik.templatesplayground.base.BaseFragment
import com.dosssik.templatesplayground.ui.viewmodel.ExampleViewModel
import com.dosssik.templatesplayground.ui.viewmodel.provider.ExampleViewModelProvider


class ExampleFragment : BaseFragment<ExampleViewModel>() {

    override val viewModel = ExampleViewModelProvider.getViewModel<ExampleViewModel>(this)

    override fun getContentView(): View {
        return ExampleFragmentBinding.inflate(layoutInflater).let {
            it.viewModel = viewModel
            it.root
        }
    }
}