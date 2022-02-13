package design_patterns.observer.observers

import design_patterns.observer.Subject

/**
 * Created by osmanboy on 2/5/2022
 */
class CurrentConditionsDisplay(private val weatherData: Subject) : Observer , DisplayElement {
    init {
        weatherData.registerObserver(this);
    }

    private var temperature: Float = 0F
    private var humidity: Float = 0F

    override fun update() {
        this.temperature = weatherData.temperature;
        this.humidity = weatherData.humidity;
        display();
    }

    override fun display() {
        println("Текущие условия: $temperature градусов по Фаренгейту и влажность  $humidity%.")
    }
}