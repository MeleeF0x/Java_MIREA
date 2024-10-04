//Указание пакета класса
package app;

//Импортирование пакета vehicles
import vehicles.*;

public class TestCar {
    //Метода main
    public static void main(String[] args){
        //Создание объектов классов
        Car AE86 = new Car("Trueno", 0, "Gray", 1986, "Takumi", 0);
        ElectricCar Tesla = new ElectricCar("XYQ", 0, "White", 2077, "V", 0);

        /*Вписываем сюда геттеры и сеттеры классов
        ...
        */

        //Изменение года выпуска и владельца
        AE86.SetYear(1985);
        AE86.SetOwnerName("ME");
        Tesla.SetYear(2055);
        Tesla.SetOwnerName("Jhonny");
        System.out.println("AE86 year: " + AE86.GetYear() + "; AE86 Owner: " + AE86.GetOwnerName());
        System.out.println("Tesla year: " + Tesla.GetYear() + "; Tesla Owner: " + Tesla.GetOwnerName());

        //Измнение страхового номера
        AE86.SetInsuranceNumber(888);
        Tesla.SetInsuranceNumber(777);
        System.out.println("AE86 Insurance Number: " + AE86.GetInsuranceNumber());
        System.out.println("Tesla Insurance Number: " + Tesla.GetInsuranceNumber());

        //Вывод показателя батареи
        System.out.println("Tesla Battary Capacity: " + Tesla.getBatteryCapacity());
        
        //Вывод информации об автомобилях
        System.out.println("AE86:");
        AE86.ToString();
        System.out.println("Tesla:");
        Tesla.ToString();
    }
}
