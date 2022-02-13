package design_patterns.observer

import design_patterns.observer.observers.CurrentConditionsDisplay
import design_patterns.observer.observers.ForecastDisplay
import design_patterns.observer.observers.StatisticsDisplay

/**
 * Created by osmanboy on 2/5/2022
 */
fun main() {
    val weatherData = WeatherData()
    val currentDisplay = CurrentConditionsDisplay(weatherData)
    val statisticsDisplay = StatisticsDisplay(weatherData)
    val forecastDisplay = ForecastDisplay(weatherData)

    weatherData.setMeasurements(80f,65f,30.4f)
    weatherData.setMeasurements(82f,70f,29.2f)
    weatherData.setMeasurements(78f,90f,29.2f)


}