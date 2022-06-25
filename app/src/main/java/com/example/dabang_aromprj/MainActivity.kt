package com.example.dabang_aromprj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.dabang_aromprj.Board.BoardFragment
import com.example.dabang_aromprj.Book.BookFragment
import com.example.dabang_aromprj.Category.CategoryFragment
import com.example.dabang_aromprj.Home.HomeFragment
import com.example.dabang_aromprj.Myinfo.MyinfoFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView.setOnNavigationItemSelectedListener(this)
        bottomNavigationView.selectedItemId = R.id.item1


    }
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.item1 -> {
                supportFragmentManager.beginTransaction().replace(R.id.main_container,HomeFragment()).commit()
                return true
            }
            R.id.item2 -> {
                supportFragmentManager.beginTransaction().replace(R.id.main_container,CategoryFragment()).commit()
                return true
            }
            R.id.item3 -> {
                supportFragmentManager.beginTransaction().replace(R.id.main_container,BoardFragment()).commit()
                return true
            }
            R.id.item4 -> {
                supportFragmentManager.beginTransaction().replace(R.id.main_container,BookFragment()).commit()
                return true
            }
            R.id.item5 -> {
                supportFragmentManager.beginTransaction().replace(R.id.main_container,MyinfoFragment()).commit()
                return true
            }
        }
        return false
    }
}