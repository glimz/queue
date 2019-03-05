

//Linked List Implementation
public class Queue<E> implements IQueue<E>{
	
	
	/* LinkedQueue.java */
	//class LinkedQueue <Item> implements Queue <Item>
	//{
	  private Node front, rear; //begin and end nodes
	  private int size; // number of items
	 
	  //nested class to define node
	  private class Node{ 
	    private int item;
	    Node next;
	  }
	 
	  //Zero argument constructor
	  public Queue()
	  {
	    front = null;
		rear = null;
	    size = 0;
	  }
	 
	  public boolean isEmpty()
	  {
	    return (size == 0);
	  }
	 
	  //Remove item from the beginning of the list.
	 
	  @Override
	  public int dequeue(){
	    int measurement = front.item;
	    front = front.next;
	    if (isEmpty()) 
	    {
	      rear = null;
	    }
	    size--;
	    return measurement;
	  }
	 
	  //Add item to the end of the list.
	  @Override
	  public void enqueue(int measurement)
	  {
	    Node oldRear = rear;
	    rear = new Node();
	    rear.item = measurement;
	    rear.next = null;
	    if (isEmpty()) 
	    {
	      front = rear;
	    }
	    else 
	    {
	      oldRear.next = rear;
	    }
	    size++;
	  }
	 
	  public int size(){
	    return size;
	  }
	
	  /*public int result() {
		  
		  
		  int total;
		  return 0;
	  }
*/
	
/*
 private int front;
    private int rear;
    int measurement;
    E[] queue;
    
	@Override
	public void enqueue(int measurement) {
		// TODO Auto-generated method stub
		 this.measurement = measurement;
	        queue = (E[]) new Object[measurement];
	        front = -1;
	        rear = -1;
		
		
	}
	 public boolean isempty() {
	        return (front == -1 && rear == -1);
	    }

	@Override
	public void enqueue(E value) {
        if ((rear + 1) % this.measurement == front) {
            throw new IllegalStateException("Queue is full");

        } else if (isempty()) {
            front++;
            rear++;
            queue[rear] = value;

        } else {
            rear=(rear + 1) % this.measurement;
            queue[rear] = value;

        }
    }

    public int dequeue() {
        E value = null;
        if (isempty()) {
            throw new IllegalStateException("Queue is empty, cant dequeue");
        } else if (front == rear) {
            value = queue[front];
            front = -1;
            rear = -1;

        } else {
            value = queue[front];
            front 
            = (front + 1) % this.measurement;

        }
        return (int) value;

    }

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return queue.length;
	}
*/

}
