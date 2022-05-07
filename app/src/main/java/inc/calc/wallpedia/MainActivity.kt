package inc.calc.wallpedia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView
import inc.calc.wallpedia.Adapter.CatagoryRecyclerViewAdapter

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //menubar initalaization
        val toolbar= findViewById<Toolbar>(R.id.toolbar)
        val drawerlayout= findViewById<DrawerLayout>(R.id.drawerlayout)
        val navbar= findViewById<NavigationView>(R.id.navbar)
        val RVCatagoryRv=findViewById<RecyclerView>(R.id.RVCatagoryRv)
        //Creating the list
        val CategoryObject= mutableListOf<Catagory>()
        CategoryObject.add(Catagory("Abstruct",R.drawable.abstruct))
        //CategoryObject.add(Catagory("Amold",R.drawable.Amold))
        CategoryObject.add(Catagory("Anime",R.drawable.anime))
        CategoryObject.add(Catagory("Animal",R.drawable.animal))
        //CategoryObject.add(Catagory("Cars",R.drawable.car))
        CategoryObject.add(Catagory("CityScape",R.drawable.cityscape))
        CategoryObject.add(Catagory("Minimal",R.drawable.minimal))
        //CategoryObject.add(Catagory("Love",R.drawable.love))
        //CategoryObject.add(Catagory("Photography",R.drawable.animal))
        //CategoryObject.add(Catagory("Word",R.drawable.animal))
        //Pass the value to the adapter
        RVCatagoryRv.adapter= CatagoryRecyclerViewAdapter(this,CategoryObject)
        RVCatagoryRv.layoutManager=LinearLayoutManager(this)

        val toggle:ActionBarDrawerToggle= ActionBarDrawerToggle(this,drawerlayout,toolbar,R.string.drawerOpenString,R.string.drawerCloseString)
        drawerlayout.addDrawerListener(toggle)
        toggle.syncState()

    }
}