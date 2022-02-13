package design_patterns.strategy

import design_patterns.strategy.ducks.MallardDuck
import design_patterns.strategy.ducks.ModelDuck
import design_patterns.strategy.fly.FlyRockedPowered

/**
 * Created by osmanboy on 2/5/2022
 */
fun main() {
    val mallard = MallardDuck()
    mallard.performQuack()
    mallard.performFly()

    val model = ModelDuck()
    model.performFly()
    model.flyBehaviour = FlyRockedPowered()
    model.performFly()
}
