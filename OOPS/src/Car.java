
class CarApplication{
	int speed;
	String model;
	String color;
	
	public String carState(int Speed) {
		if(Speed>80) {
			return "Car Over-speeding";
		}else if(Speed>0 && Speed<80){
			return "Car is moving";
		}else {
			return "Car is Stopped.";
		}
	}
}
class Car {
	public static void main(String[] args) {
		CarApplication car1 = new CarApplication();
		CarApplication car2 = new CarApplication();
		
		car1.speed = 50;
		car2.speed = 95;
		
		System.out.println(car1.carState(car1.speed));
	}
}