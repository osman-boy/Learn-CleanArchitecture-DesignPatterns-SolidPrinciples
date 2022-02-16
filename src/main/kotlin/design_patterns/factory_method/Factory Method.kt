package design_patterns.factory_method

/**
 * Created by osmanboy on 2/16/2022
 */

// продукты
interface Vehicle {
    fun drive()
}

class Car : Vehicle {
    override fun drive() = print("drive a car")
}

class Truck : Vehicle {
    override fun drive() =print("drive a truck")
}

class Bus : Vehicle {
    override fun drive() =print("drive a bus")
}



// фабрики
interface VehicleFactory {
    fun produce(): Vehicle
}

class CarFactory : VehicleFactory {

    override fun produce(): Vehicle {
        print("car is created")
        return Car()
    }
}

class TruckFactory : VehicleFactory {

    override fun produce(): Vehicle {
        print("truck is created")
        return Truck()
    }
}

class BusFactory : VehicleFactory {

    override fun produce(): Vehicle {
        print("bus is created")
        return Bus()
    }
}


val carFactory = CarFactory()
val car = carFactory.produce()

val truckFactory = TruckFactory()
val truck = truckFactory.produce()

val busFactory = BusFactory()
val bus = busFactory.produce()