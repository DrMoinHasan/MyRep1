class Bike{
	protected String brand;
	protected int year;
	protected double mileage;
}

class BikeDemo{
	public static void main(String str[]){
		Bike b1 = new Bike();
		b1.brand = "Yamaha";
		b1.year = 2024;
		b1.mileage = 40.0;

		System.out.println("Brand: "+b1.brand);
		System.out.println("Year: "+b1.year);
		System.out.println("Mileage: "+b1.mileage);
	}
}
