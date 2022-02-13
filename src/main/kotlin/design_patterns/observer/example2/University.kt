package design_patterns.observer.example2

import design_patterns.observer.example2.observers.students.Anna
import design_patterns.observer.example2.observers.students.Marsel
import design_patterns.observer.example2.observers.students.Nikita
import design_patterns.observer.example2.observers.students.Osman
import design_patterns.observer.example2.subject.Teacher

/**
 * Created by osmanboy on 2/10/2022
 */

fun main() {

    val teacher = Teacher()
    val osman = Osman(teacher)
    val marsel = Marsel(teacher)
    val anna = Anna(teacher)
    val nikita = Nikita(teacher)
    teacher.notifyObservers("Lesson1")
}