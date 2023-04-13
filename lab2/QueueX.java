package lab2;

public class QueueX {
	private int [] queueArr;
	private int maxSize;
	private int rear;
	private int front;
	private int nItems;
	
	
	public QueueX(int s){
		maxSize = s;
		queueArr = new int [maxSize];
		rear = -1;
		front = 0;
		nItems = 0;	
	}
	
	public void insert(int j) {
		if(rear== maxSize -1) {
			System.out.println("The queue is full");
		}
		else {
			nItems ++;
			queueArr[++rear]=j;
		}	
	}
	
    public int remove() {
    	if (nItems == 0) {
    		System.out.println("The stack is empty");
    		return -99;
    	}
    	else {
    		nItems--;
    		return queueArr[front++];
    	}
	}
    
    public boolean isEmpty(){
    	if(nItems == 0)
    		return true;
    	else
    		return false;
    }
    
    public boolean isFull(){
    	if(rear== maxSize -1)
    		return true;
    	else
    		return false;
    }
    
    
    
    
    


}
