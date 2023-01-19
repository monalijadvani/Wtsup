package com.example.wtsup.Adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class wtsupAdapter(manager: FragmentManager, fagments: Array<Fragment>) : FragmentPagerAdapter(manager) {
     var   fagments : Array<Fragment> = fagments
    override fun getCount(): Int {
            return fagments.size
    }

    override fun getItem(position: Int): Fragment {
            return fagments.get(position)
    }

    override fun getPageTitle(position: Int): CharSequence? {
            when(position){
                 0 -> return "Chats"
                 1 -> return "Status"
                 2 -> return "Call"
                else  -> return "Chats"
            }

    }
}