package design_patterns.observer.observers

import design_patterns.observer.WeatherData

class StatisticsDisplay(val weatherData: WeatherData) : Observer , DisplayElement {
    private var maxTemp = 0.0f
    private var minTemp = 200f
    private var tempSum = 0.0f
    private var numReadings = 0

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        tempSum += weatherData.temperature
        numReadings++
        if (weatherData.temperature > maxTemp) {
            maxTemp = weatherData.temperature
        }
        if (weatherData.temperature < minTemp) {
            minTemp = weatherData.temperature
        }
        display()
    }

    override fun display() {
        println("Средняя/Максимальная/Минимальная температура =  ${tempSum / numReadings}/$maxTemp/$minTemp")
    }
}