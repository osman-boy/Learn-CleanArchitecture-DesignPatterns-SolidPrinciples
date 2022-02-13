## **_Паттерн Стратегия_**

```text
определяет семейство алгоритмов, инкапсулирует и обеспечивает
их взаимоменяемость. Он позволяет модифицировать алгоритмы 
независимо от их использования на стороне клиента.
```

[comment]: <> (Your commenttg d text)

В нашем примере в качестве клиента выступают все наследники [Duck](ducks/Duck.kt).

| Ducks                               |
|-------------------------------------|
| [ModelDuck](ducks/ModelDuck.kt)     |
| [Redhead](ducks/Redhead.kt)         |
| [RubberDuck](ducks/RubberDuck.kt)   |                              
| [MallardDuck](ducks/MallardDuck.kt) |

А в качестве инкапсулированных алгоритмов выступают поведенческие классы реализующие эти
классы: [FlyBehaviour](fly/FlyBehaviour.kt), [QuackBehaviour.](quack/QuackBehaviour.kt)

| QuackBehaviour                  | FlyBehaviour                                |
|---------------------------------|---------------------------------------------|
| [Quack](quack/Quack.kt)         | [FlyNoWay](fly/FlyNoWay.kt)                 |
| [Squeak](quack/Squeak.kt)       | [FlyRockedPowered](fly/FlyRockedPowered.kt) |                 |
| [MuteQuack](quack/MuteQuack.kt) | [FlyWithWings](fly/FlyWithWings.kt)         |                              

## **_Принципы проектирования_**

* Выделите аспекты приложения, которые могут изменяться, и отделите их от тех, которые остаются постоянными.

[другая формулировка]: <> (Выделите переменные составляющие и инкапсулируйте их, что бы позднее
их можно было модефицировать или расширять без воздействия на постоянные составляющие.)

* Отдавайте предпочтение **_композиции_** перед наследованием.
* Программируйте на уровне **_интерфейсов_**, а не реализации.

## **_Диаграмма_**

**Инкапсуляция поведения: общая картина**

![](C:/Users/osmanboy/Downloads/ZLDDRzf04BtlhnYbb_O0Fm0X55LHRrGjFN39PR4Ni30syKSZ19K2bNff9AvL_qCbIalY173-mkm_wdWibRK38Zw0_UODVllUupoCP135GrUCf3MGFGLmXZzmXu-un2SzqrznenVw6oPw0LrtV0RrUajPaVHwhcequDK5Np0HdXyfYFmH-5ruvuxVghxyxFXn03NyfUUO02vnWtymrJU.png)