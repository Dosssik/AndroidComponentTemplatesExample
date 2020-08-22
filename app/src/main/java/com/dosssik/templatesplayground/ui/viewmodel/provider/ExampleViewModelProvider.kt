package com.dosssik.templatesplayground.ui.viewmodel.provider

import androidx.lifecycle.ViewModel
import com.dosssik.templatesplayground.base.BaseViewModelFactory
import java.util.concurrent.Callable
import com.dosssik.templatesplayground.ui.viewmodel.ExampleViewModel


object ExampleViewModelProvider : BaseViewModelFactory() {

    override val creators: Map<Class<*>, Callable<out ViewModel>> = mapOf(
        ExampleViewModel::class.java to Callable { ExampleViewModel() }
    )
}