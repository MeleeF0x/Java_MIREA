package bikeproject;

public class RoadBike extends Bike implements RoadParts{
	
	private int  tyreWidth, postHeight;
	
	public RoadBike()
	{
		this("drop", "racing", "tread less", "razor", 19, 20, 22);
	}//end constructor
	
	public RoadBike(int postHeight)
	{
		this("drop", "racing", "tread less", "razor", 19, 20, postHeight);
	}//end constructor
		
	public RoadBike(String handleBars, String frame, String tyres, String seatType, int numGears,
			int tyreWidth, int postHeight) {
		super(handleBars, frame, tyres, seatType, numGears);
		this.tyreWidth = tyreWidth;
		this.postHeight = postHeight;
	}//end constructor
	
	public void printDescription()
	{
		super.printDescription();
		System.out.println("This Roadbike bike has " + this.tyreWidth + "mm tyres and a post height of " + this.postHeight + ".");
	}//end method printDescription

	//Реализация методов интерфейса
	public int getTyreWidth(){
		return tyreWidth;
	}
    public void setTyreWidth(int newValue){
		tyreWidth = newValue;
	}
    public int getPostHeight(){
		return postHeight;
	}
    public void setPostHeight(int newValue){
		postHeight = newValue;
	}
	//Конец реализации методов интефейса
}//end class RoadBike
