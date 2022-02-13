package design_patterns.strategy.ducks

import design_patterns.strategy.fly.FlyBehaviour
import design_patterns.strategy.fly.FlyWithWings
import design_patterns.strategy.quack.Quack
import design_patterns.strategy.quack.QuackBehaviour
import strategy.Duck

class RedheadDuck : Duck() {

    override var flyBehaviour: FlyBehaviour = FlyWithWings()

    override var quackBehaviour: QuackBehaviour = Quack()

    override fun display() = println("I'm a real " + this.javaClass.name)

}