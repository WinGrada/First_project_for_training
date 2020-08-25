package uz.wingrada.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun toast(view: View){
        val myToast = Toast.makeText(this, "Добро пожаловать в Driller", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun count(view: View){
        val countString = textCount.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        textCount.text = count.toString()
    }

    fun random(view: View){
        val randomIntent = Intent(this, SecondActivity::class.java)
        val countString = textCount.text.toString()
        val count = Integer.parseInt(countString)

        randomIntent.putExtra(SecondActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }

    fun enterToGameScene(view: View){
        val gameIntent = Intent(this, GameActivity::class.java)
        startActivity(gameIntent)
    }
}