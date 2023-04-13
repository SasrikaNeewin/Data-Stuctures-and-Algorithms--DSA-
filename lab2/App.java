package lab2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		QueueX mainQueue = new QueueX(5);
		
		int Inputstr;
		
		for(int i=1;i<6;i++) {
			System.out.println("Enter transcaction ID :" );
			Inputstr = s.nextInt();
		    mainQueue.insert(Inputstr);
		}
		
		QueueX evenQueue = new QueueX(5);
		QueueX  oddQueue = new QueueX(5);
		
		
		int value;
		
		
		while (!mainQueue.isEmpty()) {
			value = mainQueue.remove();
			if(value % 2 == 0) {
				evenQueue.insert(value);
				
			}
			else {
				oddQueue.insert(value);
			}
		}
		
		
		System.out.println("PC1");
		
		while (!evenQueue.isEmpty()) {
			System.out.println("Transaction "+evenQueue.remove());
		}
		
		System.out.println("PC2");
		
		while (!oddQueue.isEmpty()) {
			System.out.println("Transaction " +oddQueue.remove());
		}
		
		
		
		
		
		

	}

}
