###### created by [osman-boy](https://github.com/osman-boy)

# **DRY(Don't repeat yourself)**

_Don’t Repeat Yourself / Не повторяйтесь_

Эта концепция была впервые сформулирована в книге Энди Ханта и Дэйва Томаса «Программист-прагматик».
Дублирование кода – пустая трата времени и ресурсов. Вам придется поддерживать одну и ту же логику и
тестировать код сразу в двух местах, причем если вы измените код в одном месте, его нужно будет
изменить и в другом. Повторное использование кода – всегда разумное решение Не повторяй себя.
Признаки того что бы нарушаем принцип DRY:
Магические значения(числа или строки). То есть Повторяющаяся логика в нескольких местах.
Повторяющаяся логика if-else или несколько операторов switch(when)разбросанных по всему коду.

![](dry.jpg)

Расмотрим пример, в этом случае мы получаем ответ от устройства, затем мы сравниваем результат число
с 188, в будущем может произойти дублирование этого магического числа в классе, в котором оно
используется, и вообще что значит 188? Что бы понять значение этого числа, нам надо запустить код
или даже почитать документацию(если она имеется конечно):
Плохо:

```kotlin
val response = GetDeviceResponse()
if (response == 188) {
    //Делаем что-то
}
```

Хорошо:

```kotlin
const val NO_CONNECTION = 188
val response = GetDeviceResponse()
if (response == NO_CONNECTION) {
    //Делаем что-то
}
```

Теперь понятно что означает 188, нет связи с устройством. И если где-нибудь еще в коде понадобится
значение NO_CONNECTION, мы можем использовать без дублирования 188.

Расмотрим аналогичную ситуацию:

```kotlin
class MagicValues {

    fun acceptCard() {
        val d = Device()
        d.sendCommand(1)
        d.sendCommand(2)
        d.sendCommand(9)
    }

    fun dispenseCard() {
        val d = Device()
        d.sendCommand(1)
        d.sendCommand(3)
        d.sendCommand(9)
    }

}
```

Здесь как мы видим магические числа начали распространяться. Что бы понять происходящее здесь совсем
не возможно. А дублирование может сломать работу программы. Например, если нужно изменить одно из
этих значений (магических чисел), то нам придется изменить это везде, где они были использованы.
Опять же, решение:

```kotlin
class NoMagic {

    fun acceptCard() {
        val d = Device()
        d.sendCommand(INITIALIZE)
        d.sendCommand(2)
        d.sendCommand(TERMINATE)
    }

    fun dispenseCard() {
        val d = Device()
        d.sendCommand(INITIALIZE)
        d.sendCommand(3)
        d.sendCommand(TERMINATE)
    }

    companion object {
        private const val INITIALIZE = 1
        private const val TERMINATE = 9
    }

}
```

Заметьте, что мы вынесли в константы только повторяющийся магические значения(1 и 9). Мы решили
проблему дублирования. Но то же самое следовало бы сделать и для других магических значений. Но
что-то еще в этом коде не так? Мы решили проблему с магическими значениями. Что еще можно улучшить?
Здесь мы имеем дело с продублированной логикой. Решение:

```kotlin
class NoDuplicateLogic {

    fun acceptCard() {
        executeCommand(2)
    }

    fun dispenseCard() {
        executeCommand(3)
    }

    private fun executeCommand(command: Int) {
        val d = Device()
        d.sendCommand(INITIALIZE)
        d.sendCommand(command)
        d.sendCommand(TERMINATE)
    }

    companion object {
        private const val INITIALIZE = 1
        private const val TERMINATE = 9
    }

}
```

В этом коде выше появился приватный метод, который вырезал дублирующий код в себя.




