package lab3;

public class App {

	public static void main(String[] args) {
		Link Nipuna = new Link("Nipuna",53.5);
		Link Aravinda = new Link("Aravinda ",78.0);
		Link Prashani = new Link("Prashani",69.5);
		
		Nipuna.next= Aravinda;	
		Aravinda.next =Prashani;
		Prashani.next=null;
		
		Nipuna.displayDetails();
		Nipuna.next.displayDetails();
		Nipuna.next.next.displayDetails();
		
		
		

	}

}
