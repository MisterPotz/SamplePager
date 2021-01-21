package com.example.samplepager.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentPagerAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.samplepager.R

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter @JvmOverloads constructor(
    val layoutInflater: LayoutInflater
) : RecyclerView.Adapter<SectionsPagerAdapter.SectionHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SectionHolder {
        return SectionHolder(layoutInflater.inflate(R.layout.item_section_fragment, parent, false))
    }

    override fun onBindViewHolder(holder: SectionHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 2
    }

    inner class SectionHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}