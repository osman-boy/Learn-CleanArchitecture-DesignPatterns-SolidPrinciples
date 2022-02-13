package design_patterns.decorator

import design_patterns.decorator.beverage.Beverage
import design_patterns.decorator.beverage.DarkRoast
import design_patterns.decorator.supplements.Mocha
import design_patterns.decorator.supplements.Whip


fun main() {

    var espresso: Beverage = DarkRoast()
    espresso = Mocha(espresso)
    espresso = Mocha(espresso)
    espresso = Whip(espresso)
    println("${espresso.description} : ${(espresso.cost())}$")

}