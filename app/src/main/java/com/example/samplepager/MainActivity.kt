package com.example.samplepager

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import androidx.viewpager2.widget.ViewPager2
import com.example.samplepager.ui.main.SectionsPagerAdapter
import com.example.samplepager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sectionsPagerAdapter = SectionsPagerAdapter(layoutInflater)
        val viewPager: ViewPager2= binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = binding.tabs

        val fab: FloatingActionButton = binding.fab

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
        val tab1 = resources.getString(R.string.tab_text_1)
        val tab2 = resources.getString(R.string.tab_text_2)
        val tabLayoutMediator =
            TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
                tab.text = when (position) {
                    0 -> tab1
                    1 -> tab2
                    else -> ""
                }
            }
        tabLayoutMediator.attach()
    }
}