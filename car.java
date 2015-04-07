
public class car {
	private String color;
	private int horsepower;
	private double enginesize;
	private int make;
	
	public car() {
		this.color = "white";
		this.horsepower = 300;
		this.enginesize = 3.0;
		this.make = 2015;
	}
	
	public car(String color, int horsepower, double enginesize, int make) {
		this.color = color;
		this.horsepower = horsepower;
		this.enginesize = enginesize;
		this.make = make; 
	}
	
	public String setColor(){
		return color;
	}
	public void getColor(String color){
		this.color = color;
	}
	
	public double setHorsepower(){
		return horsepower;
	}
	public void gethorsepower(int horsepower){
		this.horsepower = horsepower;
	}
	
	public double setEnginesize() {
		return enginesize;
	}
	public void getenginesize(double enginesize) {
		this.enginesize = enginesize;
	}
	
	public double setMake() {
		return make;
	}
	public void getmake(int make) {
		this.make = make;
	}
	
	public  String toString() {
		return " Car color is: " + this.color 
			+ "\n There are " + this.horsepower + " horse power"
			+ "\n This car have " + this.enginesize + " engine"
			+ "\n The car model is " + this.make;
	}

}
