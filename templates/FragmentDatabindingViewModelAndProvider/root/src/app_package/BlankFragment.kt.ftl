package ${packageName}.ui.fragment${dotSubpackage}

import android.view.View
import ${packageName}.databinding.${fragmentClass}Binding
import ${packageName}.base.BaseFragment
import ${packageName}.ui.viewmodel${dotSubpackage}.${viewModelName}
import ${packageName}.ui.viewmodel${dotSubpackage}.provider.${providerName}


class ${fragmentClass}: BaseFragment<${viewModelName}>() {

    <#if createProvider>
    override val viewModel = ${providerName}.getViewModel<${viewModelName}>(this)
    </#if>

    override fun getContentView(): View {
        return ${fragmentClass}Binding.inflate(layoutInflater).let {
            it.viewModel = viewModel
            it.root
        }
    }
}