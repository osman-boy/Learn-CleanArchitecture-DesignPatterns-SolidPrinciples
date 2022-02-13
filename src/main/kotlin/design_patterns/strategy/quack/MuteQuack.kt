package design_patterns.strategy.quack

class MuteQuack : QuackBehaviour {
    override fun quack() = println("<<Silence>>")//утки которые не издают звуков
}