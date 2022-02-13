package design_patterns.strategy.ducks

import design_patterns.strategy.fly.FlyBehaviour
import design_patterns.strategy.fly.FlyNoWay
import design_patterns.strategy.quack.Quack
import design_patterns.strategy.quack.QuackBehaviour
import strategy.Duck

/**
 * Created by osmanboy on 2/5/2022
 */
class ModelDuck :Duck(){

    override var flyBehaviour: FlyBehaviour = FlyNoWay() //Утка - приманка изначально летать не умеет...

    override var quackBehaviour: QuackBehaviour = Quack()

    override fun display() = println("I'm a real " + this.javaClass.name)

}