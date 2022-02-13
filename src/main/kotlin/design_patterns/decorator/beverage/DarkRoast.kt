package design_patterns.decorator.beverage

/**
 * Created by osmanboy on 2/6/2022
 */
class DarkRoast : Beverage() {

    override val description = "DarkRoast"

    override fun cost() = .99
}