import java.util.Scanner;


public class CartesianCoordinateSystem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double coordX = input.nextDouble();
		double coordY = input.nextDouble();
		
		if (coordX > 0 && coordY > 0) {;
			System.out.println("1");
		}
		else if (coordX < 0 && coordY < 0) {
		    System.out.println("3");	
		}
		else if (coordX > 0 && coordY < 0) {
			System.out.println("4");
		}
		else if (coordX < 0 && coordY > 0) {
			System.out.println("2");
		}
		else if (coordX == 0 && coordY == 0) {
			System.out.println("0");
		}
		else if(coordX == 0){
			System.out.println("5");
		}
		else if(coordY == 0){
			System.out.println("6");
		}
		else{
			System.out.println("4");
		}
	}

}
