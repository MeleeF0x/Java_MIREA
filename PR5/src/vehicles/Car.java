//Указание пакета класса
package vehicles;

//Класс Car наследует класс Vehicle
public class Car extends Vehicle{
    //Конструктор поумолчанию
    public Car(){
        super();
        engineType = "Combustion";
    }

    //Конструктор с заполнением всех полей класса
    public Car(String model, int license, String color, int year, String ownerName, int insuranceNumber){
        super();
        engineType = "Combustion";
    }

    //Метод получения типа транспорта
    public String GetVehicleType(){
        return "Car";
    }

    //Метод вывода информормации всех полей объекта
    public void ToString(){
        System.out.println("Model: " + GetModel() + "; License: " + GetLicense() + "; Color: " + GetColor() + "; Year:" + GetYear() + "; Owner: " + GetOwnerName() + "; Insurance Number: " + GetInsuranceNumber());
    }
}