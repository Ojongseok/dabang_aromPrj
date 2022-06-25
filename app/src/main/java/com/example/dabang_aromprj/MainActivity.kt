package com.example.dabang_aromprj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dabang_aromprj.Board.BoardFragment
import com.example.dabang_aromprj.Book.BookFragment
import com.example.dabang_aromprj.Category.CategoryFragment
import com.example.dabang_aromprj.Home.HomeFragment
import com.example.dabang_aromprj.Myinfo.MyinfoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        supportFragmentManager.beginTransaction().replace(R.id.main_container,HomeFragment()).commit()
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.item1 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_container,HomeFragment()).commit()
                }
                R.id.item2 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_container,CategoryFragment()).commit()
                }
                R.id.item3 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_container,BoardFragment()).commit()
                }
                R.id.item4 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_container,BookFragment()).commit()
                }
                R.id.item5 -> {
                    supportFragmentManager.beginTransaction().replace(R.id.main_container,MyinfoFragment()).commit()
                }
            }
            return@setOnNavigationItemSelectedListener true
        }
    }
}