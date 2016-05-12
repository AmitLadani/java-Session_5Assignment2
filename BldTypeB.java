import java.util.Scanner;

public class BldTypeB extends Construction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a Floors: ");
		int Floors = sc.nextInt();
		System.out.print("How many Rooms will be there on each Floor ? - ");
		int Rooms = sc.nextInt();
					
		BldTypeB B = new BldTypeB();
	      B.Apartment(Floors, Rooms);
	}

}
