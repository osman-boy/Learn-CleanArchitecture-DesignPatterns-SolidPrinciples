package design_patterns.observer

import design_patterns.observer.observers.Observer

/**
 * Created by osmanboy on 2/5/2022
 */
class WeatherData : Subject {

    private val observers = mutableListOf<Observer>()
    override var temperature: Float = 0F
    override var humidity: Float = 0F
    override var pressure: Float = 0F

    override fun registerObserver(o: Observer) {
        observers.add(o)
    }

    override fun removeObserver(o: Observer) {
        observers.remove(o)
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer.update()
        }
    }

    fun setMeasurements(temp: Float , humidity: Float , pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure

        measurementsChanged()
    }

    private fun measurementsChanged() = notifyObservers()


}