package uz.wingrada.myapplication

import android.bluetooth.BluetoothHeadset
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)



    }

    private var health:Int = 100
    private var damage:Int = 30
    private var alive:Boolean = true

    fun getDamage() {
        if (damage > health){
            health = 0
            return
        }
        health -= damage
    }



    fun damageGround(view: View) {
        getDamage()

        if (health == 0){
            GroundView.visibility = View.GONE
        }
    }


}