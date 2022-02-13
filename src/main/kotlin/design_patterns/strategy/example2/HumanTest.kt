package design_patterns.strategy.example2

import design_patterns.strategy.example2.dive.NonDiver
import design_patterns.strategy.example2.swim.ProfessionalSwimmer

/**
 * Created by osmanboy on 2/9/2022
 */
fun main() {
    
    val human1 = Human(ProfessionalSwimmer() , NonDiver())
    human1.performDive()
    human1.performSwim()

}