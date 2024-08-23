package com.example.drawerlayout

import android.health.connect.datatypes.units.Length
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.drawerlayout.R.id.toolbar
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity() {

    lateinit var drawewLayout : DrawerLayout
    lateinit var navView : NavigationView
    lateinit var toolbar : Toolbar

    lateinit var toggle : ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



        drawewLayout=findViewById(R.id.main)
        navView=findViewById(R.id.navView)
        toolbar=findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)


        toggle= ActionBarDrawerToggle(this,drawewLayout,toolbar,R.string.open_drawer,R.string.close_drawer)

        drawewLayout.addDrawerListener(toggle)

        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

//        navView.setNavigationItemSelectedListener( NavigationView.OnNavigationItemSelectedListener())

        navView.setNavigationItemSelectedListener { item ->

            when (item.itemId) {
                R.id.menuHome -> {
                    // Handle menu home item selection
                    Toast.makeText(this,"Home",Toast.LENGTH_LONG)
                }
                R.id.menuNotes -> {
                    // Handle menu home item selection
                    Toast.makeText(this,"Notes",Toast.LENGTH_LONG)
                }
                R.id.menuSettings -> {
                    // Handle menu home item selection
                    Toast.makeText(this,"settings",Toast.LENGTH_LONG)
                }


            }
            true
        }
    }

    override fun onOptionsItemSelected(item : MenuItem) : Boolean {
        if (toggle.onOptionsItemSelected(item))
        {
            return true
        }
        else
            return false
    }


}