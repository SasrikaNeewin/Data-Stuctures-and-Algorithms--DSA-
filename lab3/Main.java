package lab3;

public class Main {

	public static void main(String[] args) {
		LinkList l = new LinkList();
		l.insertFirst("Prashani", 69.5);
		l.insertFirst("Aravinda", 78.0);
		l.insertFirst("Nipuna", 53.5);
		
		l.displayList();
		
		l.deleteLink("Aravinda");
		
		System.out.println();
		System.out.println("----deleted----");
		System.out.println();
		
		l.displayList();
		

	}

}
