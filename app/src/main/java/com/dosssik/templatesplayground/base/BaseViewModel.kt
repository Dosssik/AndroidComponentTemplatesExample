package com.dosssik.templatesplayground.base

import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

abstract class BaseViewModel: ViewModel() {

    protected val subscriptions =  CompositeDisposable()

    override fun onCleared() {
        subscriptions.clear()
    }
}