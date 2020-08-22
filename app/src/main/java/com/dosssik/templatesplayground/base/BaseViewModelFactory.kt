package com.dosssik.templatesplayground.base

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.util.concurrent.Callable

abstract class BaseViewModelFactory : ViewModelProvider.Factory {

    abstract val creators: Map<Class<*>, Callable<out ViewModel>>

    inline fun <reified T: ViewModel> getViewModel(fragment: Fragment) : T {
        return ViewModelProvider(fragment, this).get(T::class.java)
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return creators[modelClass]?.call() as T
    }

}