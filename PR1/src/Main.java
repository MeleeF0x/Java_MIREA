import java.util.Scanner;

public class Main {
    public  static void main(){
        //Объявление и инициализация переменных
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;

        //Создание сканера
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во юаней:");

        //Считывание количества юаней
        yuan = scan.nextInt();

        //Перевод юаней в рубли
        roubles =  ROUBLES_PER_YUAN * yuan;
        
        //Определение вывода взависимости от изнальнго количества юаней
        if(yuan < 0){
            System.out.println("Неверный ввод");
        }
        else if(yuan > 4  || yuan == 0){
            System.out.println(yuan + " китайских юаней = " + roubles + " рублей");
        }
        else if(yuan == 1 ){
            System.out.println(yuan + " китайский юань = " + roubles + " рублей");
        }
        else if(yuan < 5 ){
            System.out.println(yuan + " китайских юаня = " + roubles + " рублей");
        }
        scan.close();
    }    
}