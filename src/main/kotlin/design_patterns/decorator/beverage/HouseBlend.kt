package design_patterns.decorator.beverage

/**
 * Created by osmanboy on 2/6/2022
 */
class HouseBlend:Beverage() {
    override val description = "House Blend"

    override fun cost() = .89
}