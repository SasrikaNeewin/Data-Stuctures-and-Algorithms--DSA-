package lab1;

public class App {

	public static void main(String[] args) {
		
		StackX s = new StackX(10);
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		s.push('e');
		s.push('f');
		s.push('g');
		
		while(!s.isEmpty()){
			 System.out.println(s.pop());
		 }
		
		//insertion order   = a b c d e f g
		//removal order = g f e d c b a
		
		

	}

}
