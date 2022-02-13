## **_Паттерн Наблюдатель_**

```text
определяет отношение "один ко многим" между объектами таким образом, 
что при изменений состояний одного объекта происходит автоматическое
оповещение и обновление всех зависимых объектов.
Субъект(один) -> Наблюдатель(многие) = один ко многим
```

В нашем примере в качестве субъекта выступает [WeatherData](WeatherData.kt).

А в качестве наблюдателей выступают все классы реализующие интерфейс [Observer](observers/Observer.kt)

| QuackBehaviour                                                    |
|-------------------------------------------------------------------|
| [CurrentConditionsDisplay](observers/CurrentConditionsDisplay.kt) |
| [ForecastDisplay](observers/ForecastDisplay.kt)                   |                
| [HeatIndexDisplay](observers/HeatIndexDisplay.kt)                 |                             
| [StatisticsDisplay](observers/StatisticsDisplay.kt)               |                             

## **_Принципы проектирования_**

* Стремитесь к слабой связанности взаимодействующих объектов.

## **_Диаграмма_**

![](../../../../../../../Screenshot_20220209-180245_ReadEra.png)