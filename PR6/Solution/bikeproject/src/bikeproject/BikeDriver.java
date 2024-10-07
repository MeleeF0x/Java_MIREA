package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		//Создание тестовых объектов
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();
		
		//Изменение высоты столба для bike1
		bike1.setPostHeight(20);

		//Вывд информации о тестовых объектах
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike4.printDescription();
	}//end method main

}//end class BikeDriver
