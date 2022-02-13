package design_patterns.strategy.quack

class Squeak : QuackBehaviour {
    override fun quack() = println("I can squeak!") //резиновые утки пищат
}