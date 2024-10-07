package bikeproject;

public class Bike implements BikeParts{

	private String handleBars, frame, tyres, seatType;
	private int NumGears;
	
	public Bike(){	
	}//end constructor
	
	public Bike(String handleBars, String frame, String tyres, String seatType, int numGears) {
		this.handleBars = handleBars;
		this.frame = frame;
		this.tyres = tyres;
		this.seatType = seatType;
		NumGears = numGears;
	}//end constructor

	protected void printDescription()
	{
		System.out.println("\n" + manufacturingCompany + "\n" 
				          + "This bike has " + this.handleBars + " handlebars on a " 
				          + this.frame + " frame with " + this.NumGears + " gears."  
				          + "\nIt has a " + this.seatType + " seat with " + this.tyres + " tyres.");
	}//end method printDescription

	//Реализация методов интерфейса
	public String getHandleBars(){
		return handleBars;
	}
    public void setHandleBars(String newValue){
		handleBars = newValue;
	}
    public String getFrame(){
		return frame;
	}
    public void setFrame(String newValue){
		frame = newValue;
	}
    public String getTyres(){
		return tyres;
	}
    public void setTyres(String newValue){
		tyres = newValue;
	}
    public String getSeatType(){
		return seatType;
	}
    public void setSeatType(String newValue){
		seatType = newValue;
	}
    public int getNumGears(){
		return NumGears;
	}
    public void setNumGears(int newValue){
		NumGears = newValue;
	}
	//Конеу релизации методов интерфейса
}//end class Bike
	
	

