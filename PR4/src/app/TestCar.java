//Указание пакета класса
package app;

//Импортирование всех классов из пакета vehicles
import vehicles.*;

public class TestCar {
    public static void main(String[] args){
        //Создание объектов классов
        Car AE86 = new Car("Trueno", 0, "Gray", 1986, "Takumi", 0);
        ElectricCar Tesla = new ElectricCar("XYQ", 0, "White", 2077, "Elon Mask", 0);

        /*Вписываем сюда геттеры и сеттеры классов
        ...
        */

        //Вывод итоговой информации об объектах классов
        AE86.ToString();
        Tesla.ToString();
    }
}
