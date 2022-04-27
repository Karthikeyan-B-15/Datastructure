import java.util.Scanner;

class Queue {
	class Node{
		int data;
		Node next;
		
		Node(int val){
			data = val;
			next = null;
		}
	}
	
	Node front,rear; 
	
	Queue(){
		front = null;
		rear = null;
	}
	public void enqueue(int val) { //O(1)
		Node newNode = new Node(val);
		if(front==null)
			front = newNode;
		else
			rear.next = newNode	;
		rear = newNode;
		
	}
	
	public int dequeue() {
		if(front==null) //no node in Q
			throw new IndexOutOfBoundsException("Queue is Empty");
		int temp = front.data;
		front = front.next;
		if(front==null) //deleted last node and now Q is empty
			rear=null;
		return temp;
		
	}
     void display() {

        Node temp = front;

        while(temp!=null) {

            System.out.print( temp.data +" " );

            temp = temp.next; 

        }

        System.out.println("\n");

    }
}
public class QueueList {
	public static void main(String args[]) {
		Queue li=new Queue();
		Scanner inp=new Scanner(System.in);
		while(true) {
		System.out.println("1.Enqueue");
		System.out.println("2.Deque");
		int choice=inp.nextInt();
		switch(choice) {
		case 1:System.out.print("Enter your data:");
		   int val=inp.nextInt();
		   li.enqueue(val);
		   break;
		case 2:System.out.println(li.dequeue() + " dequeue from Queue");
		       break;
                case 3: li.display (); break;
		default:
			System.out.println("Wrong Choice!!!");
		}
		}
}
}
