package design_patterns.strategy.example2.swim

/**
 * Created by osmanboy on 2/9/2022
 */
class NonSwimmer : SwimBehavior {
    override fun swim() = println("non-swimming")
}