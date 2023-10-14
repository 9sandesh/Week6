package fall2023;
class vehicle
{
	String manufacturer;
}
class SUV extends vehicle
{
	int passengercount;
}
class sedan extends vehicle
{
	String model;
}
public class sportvehicle {


 public static void main(String[]args) {
		SUV z= new SUV();
		z.manufacturer="Toyota";
		z.passengercount=5;
		System.out.println("SUV Details");
		System.out.println("---------");
		System.out.println("The manufacturer is " + z.manufacturer);
		System.out.println("Total passenger is  " + z.passengercount);
	}

}