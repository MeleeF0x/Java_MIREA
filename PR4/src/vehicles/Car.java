//Указание пакета класса
package vehicles;

//Класс Car наследует класс Vehicle
public class Car extends Vehicle{
    //Конструктор поумолчанию
    public Car(){
        super();
        engineType = "DVS";
    }
    //Конструктор с заполнением всех полей класса
    public Car(String model, int license, String color, int year, String ownerName, int insuranceNumber){
        super();
        engineType = "DVS";
    }
    //Метод получения типа транспорта
    public String GetVehicleType(){
        return "Car";
    }
}
