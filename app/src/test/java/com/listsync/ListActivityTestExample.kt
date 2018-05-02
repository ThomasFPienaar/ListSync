package com.listsync

import android.app.ListActivity
import android.view.View

import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric.setupActivity
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class ListActivityTestExample {

    @Test
    fun clickingLogin_shouldStartLoginActivity() {
        val activity = setupActivity(ListActivity::class.java)
        activity.findViewById<View>(R.id.always).performClick()

    }
}
