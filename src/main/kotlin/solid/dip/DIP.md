######created by [osman-boy](https://github.com/osman-boy)

Принцип инверсии зависимостей
DIP(Dependency Inversion Principle)- Принцип инверсии зависимостей.
Классы верхних уровней не должны зависеть от клас-сов нижних уровней.
Оба должны зависеть от абстракций. Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
Обычно при проектировании программ можно выделить два уровня классов:
Классы нижнего уровня - реализуют базовые операции вроде работы с диском, передачи данных по сети,
подключения к базе данных и прочее.
Классы высокого уровня - содержат сложную бизнес-логику программы, которая опирается
на классы низкого уровня для осуществления более простых операций.
1.Для начала вам нужно описать интерфейс низкоуровневых операций, которые нужны классу бизнес-логики.
2. Это позволит вам убрать зависимость класса бизнес-логики от конкретного низкоуровневого класса,
   заменив её «мягкой» зависимостью от интерфейса.
3. Низкоуровневый класс, в свою очередь, станет зависимым от интерфейса, определённого бизнес-логикой.
   Принцип инверсии зависимостей часто идёт в ногу с прин-ципом открытости/закрытости.
Этот принцип гласит, что высокоуровневые модули не должны зависеть от низкоуровневых модулей.
И то, и другое должно зависеть от абстракций, а абстракции не должны зависеть от деталей.
Детали должны зависеть от абстракций.
Предположим, что нам нужно разработать мобильное приложение как для Android, так и для iOS.
Для этого нам нужен разработчик Android и разработчик iOS.
Эти классы будут иметь метод разработки мобильного приложения с использованием собственной платформы и языка программирования.

<img height="300" src="dip.png"/>



class AndroidDeveloper{
fun developMobileApp(){
println("Developing Android Application by using Kotlin")
}
}

class IosDeveloper{
fun developMobileApp(){
println("Developing iOS Application by using Swift")
}
}

fun main(){
val androidDeveloper = AndroidDeveloper()
val iosDeveloper = IosDeveloper()

    androidDeveloper.developMobileApp()
    iosDeveloper.developMobileApp()
}

Чтобы исправить проблему здесь, мы можем создать интерфейс, и классы AndroidDeveloper и IosDeveloper будут реализовывать этот интерфейс.
interface MobileDeveloper{
fun developMobileApp()
}

class AndroidDeveloper(var mobileService: MobileServices): MobileDeveloper{
override fun developMobileApp(){
println("Developing Android Application by using Kotlin. " +
"Application will work with ${mobileService.serviceName}")
}
enum class MobileServices(var serviceName: String){
HMS("Huawei Mobile Services"),
GMS("Google Mobile Services"),
BOTH("Huawei Mobile Services and Google Mobile Services")
}
}

class IosDeveloper: MobileDeveloper{
override fun developMobileApp(){
println("Developing iOS Application by using Swift")
}
}

fun main(){
val developers = arrayListOf(AndroidDeveloper(AndroidDeveloper.MobileServices.HMS), IosDeveloper())
developers.forEach { developer ->
developer.developMobileApp()
}
}
Вот и все для принципов SOLID. Это легко, когда вы понимаете эти принципы на простых примерах, а не по определению.
До следующего раза. Следите за болПринцип инверсии зависимостей
В Android, если мы следуем шаблону MVP, нам нужно сохранить ссылку на Presenter в нашем представлении. 
Теперь, если мы сохраним конкретный объект класса Presenter в View, это приведет к тесной связи.
Итак, мы создаем интерфейс, который абстрагирует реализацию presenter, 
а наш класс view сохраняет ссылку на PresenterInterface.
