package com.listsync.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import android.os.Handler
import com.listsync.R

class ShoppingListItemViewModel : BaseObservable {

    private val updateHandler = Handler()
    var switch = false
    private var updateRunnable: Runnable = object : Runnable {
        override fun run() {
            if (switch)
                title = "SuperMan!"
            else
                title = "Batman!"

            switch = !switch
            updateHandler.postDelayed(this, 5000)
            notifyChange()
        }
    }

    constructor() : super(){
        updateHandler.postDelayed(updateRunnable, 5000)

    }

//    @Bindable
//    fun getTitle() : String {
//        return "good bundle"
//
//    }


    @get:Bindable
    var title : String = "qwerty again ikjhbiub"
//    var title: String @Bindable get() = "qwerty again ikjhbiub"
}