package design_patterns.strategy.example2.dive

/**
 * Created by osmanboy on 2/9/2022
 */
class NonDiver: DiveBehavior {
    override fun dive() =println("non-diving")
}