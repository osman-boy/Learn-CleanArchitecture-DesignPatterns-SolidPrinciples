package design_patterns.decorator.supplements

import design_patterns.decorator.beverage.Beverage
import design_patterns.decorator.beverage.CondimentBeverage

/**
 * Created by osmanboy on 2/6/2022
 */
class Soy(beverage: Beverage) : CondimentBeverage(beverage) {
    override val description = beverage.description + ", " + javaClass.simpleName

    override fun cost() = beverage.cost() + .15
}
//    val beverage: Beverage = Espresso()
//    println(beverage.description + " $" + String.format("%.2f" , beverage.cost()))
//
//
//    val darkRoast: Beverage = DarkRoast() // .99
//    val mocha = Mocha(darkRoast) // .99 + .20 = 1.19
//    val whip = Whip(mocha) // 1.19 + .10
//    println(whip.description + " $" + String.format("%.2f" , whip.cost()))
//
//
//    val beverage2 = Whip(Mocha(DarkRoast()))
//    println(beverage2.description + " $" + String.format("%.2f" , beverage2.cost()))
//
//
//    var beverage3: Beverage = HouseBlend()
//    beverage3 = Soy(beverage3)
//    beverage3 = Mocha(beverage3)
//    beverage3 = Whip(beverage3)
//    println(beverage3.description + " $" + String.format("%.2f" , beverage3.cost()))