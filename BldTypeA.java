import java.util.Scanner;

public class BldTypeA extends Construction{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter a Floors: ");
		int Floors = sc.nextInt();
		System.out.print("How many Rooms will be there on each Floor ? - ");
		int Rooms = sc.nextInt();
					
		BldTypeA A = new BldTypeA();
	      A.Banglow(Floors, Rooms);
	}

}
