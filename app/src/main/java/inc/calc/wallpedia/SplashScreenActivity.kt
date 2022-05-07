package inc.calc.wallpedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView


class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val Image=findViewById<ImageView>(R.id.IVLogo)
        val Name=findViewById<TextView>(R.id.TVLogo)
        val Top_anim= AnimationUtils.loadAnimation(this,R.anim.fadeout_top)
        val Bottom_anim= AnimationUtils.loadAnimation(this,R.anim.fadeout_bottom)
        Image.animation=Top_anim
        Name.animation=Bottom_anim
        Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
    }
}