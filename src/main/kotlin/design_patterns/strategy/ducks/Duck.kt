package strategy

import design_patterns.strategy.fly.FlyBehaviour
import design_patterns.strategy.quack.QuackBehaviour

/**
 * Created by Osman on 6:42 PM
 */
abstract class Duck {

    abstract var flyBehaviour: FlyBehaviour

    abstract var quackBehaviour: QuackBehaviour

    abstract fun display()

    fun performFly() = flyBehaviour.fly()

    fun performQuack() = quackBehaviour.quack()

    fun swim() = println("All duck float? even decoys")


}


