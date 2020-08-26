package ${packageName}.ui.fragment${dotSubpackage}

import android.view.View
import ${packageName}.databinding.${fragmentName}Binding
import ${packageName}.base.BaseFragment
import ${packageName}.ui.viewmodel${dotSubpackage}.${viewModelName}
import ${packageName}.ui.viewmodel${dotSubpackage}.provider.${providerName}


class ${fragmentName}: BaseFragment<${viewModelName}>() {

    <#if createProvider>
    override val viewModel = ${providerName}.getViewModel<${viewModelName}>(this)
    </#if>

    override fun getContentView(): View {
        return ${fragmentName}Binding.inflate(layoutInflater).let {
            it.viewModel = viewModel
            it.root
        }
    }
}