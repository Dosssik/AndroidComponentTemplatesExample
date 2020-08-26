<?xml version="1.0"?>
<#import "root://activities/common/kotlin_macros.ftl" as kt>
<recipe>    
    <#assign escapedResOut="${escapeXmlAttribute(resOut)}">
    <#assign escapedSrcOut="${escapeXmlAttribute(srcOut)}">

    <instantiate from="root/res/layout/blank_fragment.xml.ftl"
                   to="${escapedResOut}/layout/${escapeXmlAttribute(layoutName)}.xml" />

    <open file="${escapedResOut}/layout/${escapeXmlAttribute(layoutName)}.xml" />

    <instantiate from="root/src/app_package/BlankFragment.kt.ftl"
                   to="${escapedSrcOut}/ui/fragment/${subpackageDir}${fragmentName}.kt" />

    <open file="${escapedSrcOut}/ui/fragment/${subpackageDir}${fragmentName}.kt" />


    <instantiate from="root/src/app_package/BlankViewModel.kt.ftl"
                   to="${escapedSrcOut}/ui/viewmodel/${subpackageDir}${viewModelName}.kt"/>

    <open file="${escapedSrcOut}/ui/viewmodel/${subpackageDir}${viewModelName}.kt" />

    <#if createProvider>
    <instantiate from="root/src/app_package/BlankViewModelProvider.kt.ftl"
                   to="${escapedSrcOut}/ui/viewmodel/${subpackageDir}provider/${providerName}.kt"/>

    <open file="${escapedSrcOut}/ui/viewmodel/${subpackageDir}provider/${providerName}.kt" />

    </#if>
</recipe>
