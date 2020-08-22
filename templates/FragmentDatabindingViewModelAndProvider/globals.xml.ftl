<?xml version="1.0"?>
<globals>
    <#include "root://activities/common/common_globals.xml.ftl" />
    <global id="dotSubpackage" value="<#if useSubPackage>.${subPackage}<#else></#if>"/>
    <global id="subpackageDir" value="<#if useSubPackage>${subPackage}/<#else></#if>"/>

</globals>
