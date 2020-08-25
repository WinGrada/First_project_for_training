package uz.wingrada.myapplication.game

class BreadOfEarth(private var health: Int = 100) {

    private var drillDamage = 10
    private var isDeath = false


    fun getDamage(damage: Int){
        if (damage > health) {
            health = 0
            isDeath = true
        }

        health -= damage
    }

}