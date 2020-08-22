package ${packageName}.ui.viewmodel${dotSubpackage}.provider

import androidx.lifecycle.ViewModel
import ${packageName}.base.BaseViewModelFactory
import java.util.concurrent.Callable
import ${packageName}.ui.viewmodel${dotSubpackage}.${viewModelName}


object ${providerName}: BaseViewModelFactory() {

    override val creators: Map<Class<*>, Callable<out ViewModel>> = mapOf(
        ${viewModelName}::class.java to Callable { ${viewModelName}() }
    )
}