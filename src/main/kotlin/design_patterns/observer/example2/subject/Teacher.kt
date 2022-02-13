package design_patterns.observer.example2.subject

import design_patterns.observer.example2.observers.Observer

/**
 * Created by osmanboy on 2/9/2022
 */

class Teacher : Subject {

    val observers = mutableListOf<Observer>()
    override var task: String = ""

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers(task: String) {
        this.task = task
        observers.map { it.getTask() }
    }
}