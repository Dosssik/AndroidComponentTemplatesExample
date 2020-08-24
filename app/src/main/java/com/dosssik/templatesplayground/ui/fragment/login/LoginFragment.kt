package com.dosssik.templatesplayground.ui.fragment.login

import android.view.View
import com.dosssik.templatesplayground.databinding.LoginFragmentBinding
import com.dosssik.templatesplayground.base.BaseFragment
import com.dosssik.templatesplayground.ui.viewmodel.login.LoginViewModel
import com.dosssik.templatesplayground.ui.viewmodel.login.provider.LoginViewModelProvider


class LoginFragment : BaseFragment<LoginViewModel>() {

    override val viewModel = LoginViewModelProvider.getViewModel<LoginViewModel>(this)

    override fun getContentView(): View {
        return LoginFragmentBinding.inflate(layoutInflater).let {
            it.viewModel = viewModel
            it.root
        }
    }
}