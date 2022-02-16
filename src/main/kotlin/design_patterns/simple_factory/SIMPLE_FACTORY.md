######created by [osman-boy](https://github.com/osman-boy)

##Simple Factory(Простая Фабрика) 
###### не паттерн
Допустим у нас есть два типа машин HugeCar(грузовые) и FastCar(быстрая машина).

```kotlin
class HugeCar {
    fun drive() = println("driving a huge car")
}

class FastCar {
    fun drive() = println("driving a fast car")
}

fun main() {
    val hugeCar = HugeCar()
    hugeCar.drive()

    val fastCar = FastCar()
    fastCar.drive()
}
```

Все бы вроде хорошо, и мы создали кучу таких обьектов(автомобилей) по всему проекту. Но в один
прекрасный день, мы решили что в конструктор передадим например водителья автомобилья. И вот, тут
проблема, мы должны переделать создания этих объектов по всему проекту. Вот тут на помощь приходит "
Простая фабрика":

```kotlin
interface Car {
    fun drive()
}

class HugeCar : Car {
    override fun drive() = println("driving a huge car")
}

class FastCar : Car {
    override fun drive() = println("driving a fast car")
}


// Если у нас измениться структура конкретных наследников Car, то единственное место где мы будем
// обязаны внести изменения, это наша фабрика.
class SimpleCarFactory {

    companion object {
        // В зависимости от типа, мы создаём конкретный класс.
        fun produceCar(type: CarType) = when (type) {
            CarType.HUGE -> HugeCar()
            CarType.FAST -> FastCar()
        }
    }

    enum class CarType { HUGE , FAST , }
}


fun main() {
    // создание объектов с помощью фабрики.
    val hugeCar = SimpleCarFactory.produceCar(CarType.HUGE)
    hugeCar.drive()

    val fastCar = SimpleCarFactory.produceCar(CarType.FAST)
    fastCar.drive()
}
```

Теперь рассмотрим случае когда нам захотелось изменить структуру автомобилей:
```kotlin

// изменилась структура
class FastCar(val carSpeed:Int) : Car() {
    override fun drive() = println("driving a fast car")
}


class SimpleCarFactory {

    companion object {
        fun produceCar(type: CarType) = when (type) {
            CarType.HUGE -> HugeCar()
            // Изменения были внесены только сюда
            CarType.FAST -> FastCar(200)
        }
    }

}

```
Конечно реализация выше неправильная, то есть что если мы захотим передать каждый не одну и ту
же скорость, а разную, для каждого объекта.
И именно по этому и существует [Factory Method]()