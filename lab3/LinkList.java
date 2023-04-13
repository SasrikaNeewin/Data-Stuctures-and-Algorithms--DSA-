package lab3;

public class LinkList {
	private Link first;
	
	public LinkList(){
		first = null;
	}
	
	public boolean isEmpty() {
		return(first == null);
	}
	
	public void insertFirst(String name,double avg) {
		Link newLink = new Link(name,avg);
		newLink.next = first;
		first= newLink;
	}
	
	public void deleteFirst(){
		Link temp = first;
		first = first.next;
	}
	public void displayList() {
		Link cur = first;
		while(cur != null) {
			cur.displayDetails();
			cur = cur.next;
		}
	}
	
	public Link deleteLink(String name) {
		Link cur = first;
		Link previous = first;
		while(cur == null) {
			return null;
		}
		while (!cur.name.equals(name)) {
			previous = cur;
			cur = cur.next;
			if(cur == null) {
				return null;
			}
		}
		if(cur == first) {
			first = first.next;
		}else {
			previous.next = cur.next;	
		}
		return cur;
		
	}
	

}
