//Указание пакета класса
package vehicles;

public class Car {
    //Поля класса
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    //Конструктор поумолчанию
    public Car(){
        ownerName = "None";
        insuranceNumber = 0;
        engineType = "DVS";
    }

    //Геттеры и сеттеры
    public String GetOwner(){
        return ownerName;
    }
    public void SetOwner(String name){
        ownerName = name;
    }
    public int GetInsuranceNumber(){
        return insuranceNumber;
    }
    public void SetInsuranceNumber(int number){
        insuranceNumber = number;
    }
    public String GetEngineType(){
        return engineType;
    }
}
