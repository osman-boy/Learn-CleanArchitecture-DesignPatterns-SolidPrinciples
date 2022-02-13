package design_patterns.strategy.ducks

import design_patterns.strategy.fly.FlyBehaviour
import design_patterns.strategy.fly.FlyNoWay
import design_patterns.strategy.quack.QuackBehaviour
import design_patterns.strategy.quack.Squeak
import strategy.Duck

class RubberDuck : Duck() {

    override var flyBehaviour: FlyBehaviour = FlyNoWay()

    override var quackBehaviour: QuackBehaviour = Squeak()

    override fun display() = println("I'm a real " + this.javaClass.name)

}