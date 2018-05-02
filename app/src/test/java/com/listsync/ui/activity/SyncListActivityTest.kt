package com.listsync.ui.activity

import android.widget.ListView
import android.widget.TextView
import com.listsync.R
import org.junit.Assert
import org.junit.Test

import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(RobolectricTestRunner::class)
class SyncListActivityTest {

    @Test
    fun testTitleExists() {
        val activity =  Robolectric.setupActivity(SyncListActivity::class.java);
        val titleView = activity.findViewById<TextView>(R.id.screen_title);

        Assert.assertEquals("Hello World!", titleView.text )
    }

    @Test
    fun listExists() {
        val activity =  Robolectric.setupActivity(SyncListActivity::class.java);
        val listView = activity.findViewById<ListView>(R.id.list_view);

        Assert.assertNotNull(listView);
    }

}
