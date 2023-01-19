package com.example.wtsup

import android.content.Intent
import android.graphics.Bitmap
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.wtsup.Adapter.wtsupAdapter
import com.example.wtsup.Fragment.CallFragment
import com.example.wtsup.Fragment.ChatFragment
import com.example.wtsup.Fragment.StatusFragment
import com.example.wtsup.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    var fagments = arrayOf(ChatFragment(),StatusFragment(),CallFragment())


    override fun onCreate(savedInstanceState: Bundle?) {
        var binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.tabs.addTab(binding.tabs.newTab().setText("Chat"))
        binding.tabs.addTab(binding.tabs.newTab().setText("Status"))
        binding.tabs.addTab(binding.tabs.newTab().setText("Call"))

        var adapter1 = wtsupAdapter(supportFragmentManager,fagments)
        binding.vpImageviewer.adapter = adapter1
        binding.tabs.setupWithViewPager(binding.vpImageviewer)

        binding.dotbutton.setOnClickListener {
          //  val popupMenu : PopupMenu = PopupMenu(this,)
            val popupMenu: PopupMenu = PopupMenu(this@MainActivity,binding.dotbutton)
            popupMenu.menuInflater.inflate(R.menu.menufile,popupMenu.menu)
            popupMenu.setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.new_group ->
                        Toast.makeText(this@MainActivity, "New group " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.new_Boardcast ->
                        Toast.makeText(this@MainActivity, "New Boardcast  " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.linked_devices ->
                        Toast.makeText(this@MainActivity, "Linked devices  " + item.title, Toast.LENGTH_SHORT).show()
                    R.id.starred_messages ->
                        Toast.makeText(this@MainActivity, "Starred messages" + item.title, Toast.LENGTH_SHORT).show()
                    R.id.Payments ->
                        Toast.makeText(this@MainActivity, "Payments" + item.title, Toast.LENGTH_SHORT).show()
                    R.id.privacy_policy ->
                        Toast.makeText(this@MainActivity, "Privacy Policy" + item.title, Toast.LENGTH_SHORT).show()
                }
                true
            })
            popupMenu.show()
        }
    }

}

private fun TabLayout.setupWithViewPager(vpImageviewer: ViewPager2) {
    TODO("Not yet implemented")
}
