//Указание пакета класса
package vehicles;

//Класс ElecnricCar наследует класс Car
public class ElectricCar extends Car {
    //Поля класса
    private int batteryCapacity;

    //Конструктор поумолчанию
    public ElectricCar(){
        super();
        batteryCapacity = 0;
        engineType = "Electric";
    }

    //Конструктор с заполнением всех полей класса
    public ElectricCar(String model, int license, String color, int year, String ownerName, int insuranceNumber){
        super();
        batteryCapacity = 0;
        engineType = "Electric";
    }

    //Геттеры и сеттеры
    public String GetVehicleType(){
        return "Electric Car";
    }
    public int GetBatteryCapacity(){
        return batteryCapacity;
    }

    //Метод вывода информации о всех полях класса
    public void ToString(){
        System.out.println("Model: " + GetModel() + "; License: " + GetLicense() + "; Color: " + GetColor() + "; Year:" + GetYear() + "; Owner: " + GetOwnerName() + "; Insurance Number: " + GetInsuranceNumber() + "; Battary Capacity: " + batteryCapacity );
    }
}
