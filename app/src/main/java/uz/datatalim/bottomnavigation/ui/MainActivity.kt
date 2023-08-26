package uz.datatalim.bottomnavigation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import uz.datatalim.bottomnavigation.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {

        val navHost=supportFragmentManager.findFragmentById(R.id.frNavBottom) as NavHostFragment
        val navController=navHost.navController
        val bNavFragment:BottomNavigationView=findViewById(R.id.bnBottomNavigation)
        bNavFragment.setupWithNavController(navController)

    }
}