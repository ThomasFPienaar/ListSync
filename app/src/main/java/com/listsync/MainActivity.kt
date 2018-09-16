package com.listsync

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager

import com.listsync.ui.activity.SyncListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        list_view.layoutManager = LinearLayoutManager(this)
        list_view.adapter = SyncListAdapter()
    }
}
