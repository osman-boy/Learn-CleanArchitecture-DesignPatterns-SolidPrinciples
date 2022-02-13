package design_patterns.decorator.beverage

/**
 * Created by osmanboy on 2/6/2022
Supplements
 -
 - .10
 - .10
 */
class Espresso : Beverage() {

    override val description: String = javaClass.simpleName

    override fun cost() = 1.99

}