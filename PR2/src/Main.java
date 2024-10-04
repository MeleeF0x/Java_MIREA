public class Main {
    static void main(){
        //Тест конструктора поумолчанию
        Car Defaut_Exemple = new Car();
        System.out.println("Default constructor:");
        Defaut_Exemple.To_String();

        //Тест конструктора заполняющего все поля объекта
        Car All_Exemple = new Car("Test_Model","Test_Licence","Test_Color", 1986);
        System.out.println("All elements constructor:");
        All_Exemple.To_String();

        //Тесты конструктора с заполнением поля объекта по выбору

        //Тест конструктора по выбору с заполнением поля "model"
        Car Model_Choice_Exemple = new Car("Test_Model2", "model");
        System.out.println("Model choice constructor:");
        Model_Choice_Exemple.To_String();

        //Тест конструктора по выбору с заполнением поля "licence"
        Car Licence_Choice_Exemple = new Car("Test_Licence2", "licence");
        System.out.println("Licence choice constructor:");
        Licence_Choice_Exemple.To_String();

        //Тест конструктора по выбору с заполнением поля "color"
        Car Color_Choice_Exemple = new Car("Test_Color2", "color");
        System.out.println("Color choice constructor:");
        Color_Choice_Exemple.To_String();

        //Тест конструктора по выбору с заполнением поля "year"
        Car Year_Choice_Exemple = new Car("1985", "year");
        System.out.println("Year choice constructor:");
        Year_Choice_Exemple.To_String();

        //Тест конструктора по выбору с неправильным выбором
        Car Default_Choice_Exemple = new Car("test", "test");
        System.out.println("Default choice constructor:");
        Default_Choice_Exemple.To_String();
        
        //Тест получения возраста автомобиля
        System.out.println("Car age test:");
        All_Exemple.To_Year();
    }
    
}
