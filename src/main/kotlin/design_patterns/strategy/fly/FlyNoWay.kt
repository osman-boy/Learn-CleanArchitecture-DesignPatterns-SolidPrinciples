package design_patterns.strategy.fly

class FlyNoWay : FlyBehaviour {
    override fun fly() = Unit //реализация для уток которые летать не умеют
}