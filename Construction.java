
public class Construction {

	public void Banglow(int Floors, int Rooms){
		int completiondays=(Floors*Rooms*10);
		System.out.println("Your " + Floors + " Floors Banglow's Estimated Construction Time is " + completiondays + " Days");
	}
	
	
	public void Apartment(int Floors, int Rooms){
		int completiondays=(Floors*Rooms*15);
		System.out.println( Floors + " Floors Apartment's Estimated construction Estimated Time is " + completiondays + " Days");
}
}
