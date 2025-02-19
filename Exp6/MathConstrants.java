import java.util.Scanner;
public class MathConstrants{
	 final static double PI =  3.14159;
	  final public  void  displayPI() {
		  System.out.println("value of pi is : " + PI);
		 
	 }
	}
 class Circle extends MathConstrants{
		public void calculateArea(double radius ) {
			System.out.print(" Area of Circle is : " +  PI * radius);
		}
		   
		public class Main{
		  public static void main(String [] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.print(" enter the radius : ");
		  float radius = scanner.nextFloat();
		  
			  Circle c = new Circle();
			  c.displayPI();
			  c.calculateArea(radius);
			  // we cannot change the value of final keyword
		  }
			
	  }
	  

}