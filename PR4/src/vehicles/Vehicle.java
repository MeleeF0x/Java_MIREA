package vehicles;

public class Vehicle {
    //Поля класса
    private String model;
    private int license;
    private String color;
    private int year;
    private String ownerName;
    private int insuranceNumber;
    protected String engineType;

    //Конструктор поумолчанию
    public Vehicle(){

    }

    //Конструктор с заполнением всех полей класса
    public Vehicle(String model, int license, String color, int year, String ownerName, int insuranceNumber){
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
    }

    //Гетры и сетеры
    public String GetModel(){
        return model;
    }
    public void SetModel(String model){
        this.model = model;
    }
    public int GetLicense(){
        return license;
    }
    public void SetLicense(int license){
        this.license = license;
    }
    public String GetColor(){
        return color;
    }
    public void SetColor(String color){
        this.color = color;
    }
    public int GetYear(){
        return year;
    }
    public void SetYear(int year){
        this.year = year;
    }
    public String GetOwnerName(){
        return ownerName;
    }
    public void SetOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public int GetInsuranceNumber(){
        return insuranceNumber;
    }
    public void SetInsuranceNumber(int insuranceNumber){
        this.insuranceNumber = insuranceNumber;
    }
    public String GetEngineType(){
        return engineType;
    }
    public void SetEngineType(String engineType){
        this.engineType = engineType;
    }

    //Метод вывода информации о полях класса
    public void ToString(){
        System.out.println("Model: " + model + "; License: " + license + "; Color: " + color + "; Year:" + year + "; Owner: " + ownerName + "Insurance Number: " + insuranceNumber);
    }
}
