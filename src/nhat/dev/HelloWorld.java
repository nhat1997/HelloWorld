package nhat.dev;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello world");
		  double a = 10;
		  double b = 8;
		  double c = 3;
		  double delta;
		  double x1, x2;
		  delta = (b*b) - (4*a*c);
		  if (delta < 0) {
			   System.out.println("Phuong Trinh Vo Nghiem");
		  }
		  if (delta > 0) {
			  x1 = (-b+Math.sqrt(delta)) / (2*a);
			  x2 = (-b-Math.sqrt(delta)) / (2*a);
			  System.out.println("x1 = " + x1);
			  System.out.println("x2 = " + x2);
		  }
		  if (delta == 0) {
			  x1 = -b / (2*a);
			  System.out.println("Phuong Trinh Co Nghiem Kep x = " + x1);
		  }
	}
}
