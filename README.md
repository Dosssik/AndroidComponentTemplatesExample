## Example project for [this presentaton](https://speakerdeck.com/dosssik/custom-templates-in-android-studio) about Android Studio Templates.

The idea is to demonstrate the abilities of custom component templates in Android Studio. 

In this project, there are some [base classes](https://github.com/Dosssik/AndroidComponentTemplatesExample/tree/master/app/src/main/java/com/dosssik/templatesplayground/base) for the presentation layer. The implementation does not really matter here, the only important thing is how the [custom template](https://github.com/Dosssik/AndroidComponentTemplatesExample/tree/master/templates/FragmentDatabindingViewModelAndProvider) for Android Studio can serve some needs of the average project where we have base classes and third-party solutions.
____
### How to use

To make the [custom template](https://github.com/Dosssik/AndroidComponentTemplatesExample/tree/master/templates/FragmentDatabindingViewModelAndProvider) available in Android Studio you have to: 

- put template files to **ANDROID_STUDIO_DIR\plugins\android\lib\templates**

- restart Android Studio
____
### Template structure

- **template.xml** - metadata of the template
- **recipe.xml.ftl** - instructions for the FreeMarker
- **globals.xml.ftl** - global variables
- **cool_cat.jpg** - thumbnail with the cool cat to show as a preview in Android Studio
- **root/res/layout/blank_fragment.xml.ftl** - template for the fragment layout 
- **root/src/app_package/BlankFragment.kt.ftl** - template for the fragment class 
- **root/src/app_package/BlankViewModel.kt.ftl** - template for the view model class
- **root/src/app_package/BlankViewModelProvider.kt.ftl** - template for the view model provider class
____
##### Have fun! 🤙🏽
