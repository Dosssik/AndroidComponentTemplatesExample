package com.dosssik.templatesplayground.ui.viewmodel.login.provider

import androidx.lifecycle.ViewModel
import com.dosssik.templatesplayground.base.BaseViewModelFactory
import java.util.concurrent.Callable
import com.dosssik.templatesplayground.ui.viewmodel.login.LoginViewModel

object LoginViewModelProvider : BaseViewModelFactory() {

    override val creators: Map<Class<*>, Callable<out ViewModel>> = mapOf(
        LoginViewModel::class.java to Callable { LoginViewModel() }
    )
}