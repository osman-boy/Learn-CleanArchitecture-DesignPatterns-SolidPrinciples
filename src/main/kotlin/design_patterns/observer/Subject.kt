package design_patterns.observer

import design_patterns.observer.observers.Observer


/**
 * Created by osmanboy on 2/5/2022
 */
interface Subject {

    var temperature: Float
    var humidity: Float
    var pressure: Float

    fun registerObserver(o: Observer)

    fun removeObserver(o: Observer)

    fun notifyObservers() // этот метод вызывается для оповещения наблюдателей об изменении субъекта.

}