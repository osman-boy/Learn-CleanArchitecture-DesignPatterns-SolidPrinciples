package design_patterns.strategy.fly

class FlyWithWings : FlyBehaviour {
    override fun fly() = println("i can fly!") //реализация для всех летающих уток
}