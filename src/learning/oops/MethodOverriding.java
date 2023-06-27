package learning.oops;


class Bank
{
	 int getRateOfInterest() {
		 return 0;
	 }
}
class Hdfc extends Bank
{
	int getRateOfInterest() {
		return 10;
	}
}
class Icici extends Bank
{
	int getRateOfInterest() {
		return 20;
	}
}
class Axis extends Bank
{
	int getRateOfInterest() {
		return 30;
	}	
}	
		
public class MethodOverriding {

	public static void main(String[] args) {

		Hdfc hdfcObj = new Hdfc();
		System.out.println(hdfcObj.getRateOfInterest());
		
		Icici iciObj = new Icici();
		System.out.println(iciObj.getRateOfInterest());
		
		Axis axisObj = new Axis();
		System.out.println(axisObj.getRateOfInterest());
	}

}
