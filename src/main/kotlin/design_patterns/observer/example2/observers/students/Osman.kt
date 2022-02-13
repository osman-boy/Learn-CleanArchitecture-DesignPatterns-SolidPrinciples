package design_patterns.observer.example2.observers.students

import design_patterns.observer.example2.observers.Observer
import design_patterns.observer.example2.subject.Subject

/**
 * Created by osmanboy on 2/9/2022
 */
class Osman(val subject: Subject) : Observer {
    init {
        subject.registerObserver(this)
    }

    override fun getTask() {
        println("I am ${javaClass.simpleName}. I get ${subject.task} task")
    }
}