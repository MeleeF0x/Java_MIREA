//Указание пакета класса
package vehicles;

//Класс ElectricCar наследует класс Car
public class ElectricCar extends Car {
    //Поле класса
    private int batteryCapacity;

    //Конструктор поумолчанию
    public ElectricCar(){
        super();
        this.engineType = "Electric";
        this.batteryCapacity = 0;
    }
    //Геттеры и сеттеры
    public void SetBatteryCapacity(int batteryCapacity){
        this.batteryCapacity = batteryCapacity;
    }
    public int GetBatteryCapacity(){
        return batteryCapacity;
    }
}
