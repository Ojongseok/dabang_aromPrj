package com.example.dabang_aromprj.Home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.aromprj_1.WeekPopularAdapter
import com.example.dabang_aromprj.R
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
   override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewPager()
        home_recyclerview_weekpopular.adapter = WeekPopularAdapter()
        home_recyclerview_weekpopular.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)

        home_searchbar.setOnClickListener {
            startActivity(Intent(context,SearchActivity::class.java))
        }
    }


    fun viewPager() {
        home_viewpager_promotion.adapter=PagerAdapter(requireActivity())
        home_viewpager_promotion.orientation= ViewPager2.ORIENTATION_HORIZONTAL
        home_viewpager_promotion.offscreenPageLimit=3
        home_viewpager_promotion_indicator.setViewPager2(home_viewpager_promotion)

    }
    inner class PagerAdapter: FragmentStateAdapter {
        constructor(activity: FragmentActivity):super(activity)
        override fun getItemCount() = 3

        override fun createFragment(position: Int): Fragment {
            when(position){
                0-> return Promotion1()
                1-> return Promotion2()
                2-> return Promotion3()

                else -> return Promotion1()
            }
        }
    }
}