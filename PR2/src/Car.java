public class Car {
    //Поля класса Car
    private final int now_year = 2024;
    private String model;
    private String licence;
    private String color;
    private int year;

    //Конструктор поумолчанию
    Car(){
        this("default model", "default licence","default color", 0);
    }

    //Конструктор с заплнением всех полей объекта
    Car(String model, String licence, String color, int year){
        this.model = model;
        this.licence = licence;
        this.color = color;
        this.year = year;
    }

    //Конструктор с заполнением поля объекта по выбору
    Car(String par, String choice){
        switch(choice){
            case "model":
                this.model = par;
                break;
            case "licence":
                this.licence = par;
                break;
            case "color":
                this.color = par;
                break;
            case "year":
                this.year = Integer.parseInt(par);
                break;
            default:
                System.out.println("choice error");
        }
    }

    //Вывод всех полей обекта
    void To_String(){
        System.out.println("Model: " + model);
        System.out.println("Licence: " + licence);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    //Получение возраста автомобиля
    void To_Year(){
        System.out.println("Car age: " + (this.now_year - this.year));
    }

    //Геттеры и Сеттеры
    String getModel(){
        return model;
    }
    void setModel(String model){
        this.model = model;
    }
    String getLicence(){
        return licence;
    }
    void setLicence(String licence){
        this.licence = licence;
    }
    String getColor(){
        return color;
    }
    void setColor(String color){
        this.color = color;
    }
    int getYear(){
        return year;
    }
    void setYear(int year){
        this.year = year;
    }
}
