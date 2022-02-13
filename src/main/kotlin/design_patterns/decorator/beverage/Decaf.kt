package design_patterns.decorator.beverage

/**
 * Created by osmanboy on 2/6/2022
 */
class Decaf : Beverage() {

    override val description = javaClass.name

    override fun cost() =1.05

}