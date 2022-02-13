package design_patterns.decorator.supplements

import design_patterns.decorator.beverage.Beverage
import design_patterns.decorator.beverage.CondimentBeverage

/**
 * Created by osmanboy on 2/6/2022
 */
class Mocha(beverage: Beverage) : CondimentBeverage(beverage) {

    override val description = beverage.description + ", " + javaClass.simpleName

    override fun cost() = beverage.cost() + .20
}