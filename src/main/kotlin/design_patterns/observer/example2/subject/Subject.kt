package design_patterns.observer.example2.subject

import design_patterns.observer.example2.observers.Observer

/**
 * Created by osmanboy on 2/9/2022
 */
interface Subject {

    var task: String

    fun registerObserver(observer: Observer)

    fun removeObserver(observer: Observer)

    fun notifyObservers(task: String)
}