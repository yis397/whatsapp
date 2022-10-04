package com.example.whatsapp.ui.components

import android.content.Context
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import androidx.fragment.app.*
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.whatsapp.R
import com.example.whatsapp.ui.view.HomeFragment
import com.example.whatsapp.ui.view.SettingFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2
)
class TabPageAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return when(position)
        {
            0-> HomeFragment()
            1-> SettingFragment()
            else->HomeFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}