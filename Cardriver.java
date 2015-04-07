
public class Cardriver {
	public static void main(String[] args) {
		
		car car = new car();
		System.out.println(" Default car" + "\n" + car.toString());
		
		car car1 = new car("black", 200 , 2.5, 2003);
		System.out.println("\n Honda Civic Si" + "\n" + car1.toString());
		
		car car2 = new car("yellow", 560, 8.0, 2015);
		System.out.println("\n Lamborghini Huracan" + "\n" + car2.toString());
		
	}

}
