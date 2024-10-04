//Указание пакета класса
package vehicles;

//Класс ElectricCar наследует класс Car и реализует интерфейс ElectricVehicle
public class ElectricCar extends Car implements ElecricVehicle{
    //Поля класса
    private int batteryCapacity;

    //Конструктор поумолчанию
    public ElectricCar(){
        super();
        batteryCapacity = 0;
        engineType = "Electric";
    }

    //Конструктор с заплнением всех полей класса
    public ElectricCar(String model, int license, String color, int year, String ownerName, int insuranceNumber){
        super();
        batteryCapacity = 0;
        engineType = "Electric";
    }

    //Метод вывода информации всех полей объекта
    public void ToString(){
        System.out.println("Model: " + GetModel() + "; License: " + GetLicense() + "; Color: " + GetColor() + "; Year:" + GetYear() + "; Owner: " + GetOwnerName() + "; Insurance Number: " + GetInsuranceNumber() + "; Battary Capacity: " + batteryCapacity );
    }

    //Реализация методоа интерфейсса ElectricVehicle
    @Override
    public int getBatteryCapacity() {
        return batteryCapacity;
    }
    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}
