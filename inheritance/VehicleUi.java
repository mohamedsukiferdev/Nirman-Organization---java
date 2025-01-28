package inheritance;

public class VehicleUi {
	public static void main(String[]args) {		
		
//		single
		Car C = new Car();
		C.startEngine();
		C.drive();
		
		
//		multilevel
		
		ElectricCar Ec = new ElectricCar();
		Ec.chargeBattery();
		Ec.startEngine();
		C.drive();
		
//		hierarchical
		
		Bike B = new Bike();
		B.startEngine();
		B.kickStart();
		C.drive();
		C.startEngine();
		
	}

}
