//Файл с методом main

//Указание пакет файла
package app;

//Импортировние необходимых классов из пакета vehicles
import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    //Метод main
    static void main(){
        //Создание объектов классов
        Car AE86 = new Car();
        ElectricCar Tesla = new ElectricCar();

        //Вывод информации об объекте класса Car
        System.out.println("Car:");
        System.out.println("Owner name: " + AE86.GetOwner() + " Ins Number: " + AE86.GetInsuranceNumber() + " Engine: " + AE86.GetEngineType());

        //Вывод информации об объекте класса ElectricCar
        System.out.println("Electric car:");
        System.out.println("Engine: " + Tesla.GetEngineType() + " Battary: " + Tesla.GetBatteryCapacity());
    }
}
