package design_patterns.observer.observers

import design_patterns.observer.WeatherData

class ForecastDisplay(private val weatherData: WeatherData) : Observer , DisplayElement {
    private var currentPressure = 29.92f
    private var lastPressure = 0f

    init {
        weatherData.registerObserver(this)
    }

    override fun update() {
        lastPressure = currentPressure
        currentPressure = weatherData.pressure
        display()
    }

    override fun display() {
        print("Прогноз:")
        if (currentPressure > lastPressure) {
            println("Улучшение погоды в пути!")
        } else if (currentPressure == lastPressure) {
            println("Больше того же")
        } else if (currentPressure < lastPressure) {
            println("Остерегайтесь прохладной дождливой погоды")
        }
    }
}