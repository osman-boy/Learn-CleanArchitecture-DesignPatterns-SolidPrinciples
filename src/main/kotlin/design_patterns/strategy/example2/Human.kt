package design_patterns.strategy.example2

import design_patterns.strategy.example2.dive.DiveBehavior
import design_patterns.strategy.example2.swim.SwimBehavior

/**
 * Created by osmanboy on 2/9/2022
 */
class Human(var swimBehavior: SwimBehavior , var diveBehavior: DiveBehavior) {

    fun performSwim() = swimBehavior.swim()

    fun performDive() = diveBehavior.dive()

    fun run() = println("running")

}