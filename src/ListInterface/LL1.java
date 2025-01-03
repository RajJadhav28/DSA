package ListInterface;

public class LL1 {
	Node head;
	private int size;
	LL1(){
		this.size=0;
	}
	class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	//add First and add Last
	
	public void addFirst(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	public void addLast(String data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node currNode=head;
		while(currNode.next!=null) {
			
			currNode=currNode.next;
			
		}
		currNode.next=newNode;
	}
	public void printlist() {
		if(head==null) {
			System.out.print("List is empty.");
			return;
		}
		Node currNode=head;
		while(currNode !=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
			
		}
		System.out.println("Null");
	}
	//delete first
	public void deleteFirst() {
		if(head==null) {
			System.out.println("This list is empty.");
			return;
		}
		size--;
		head=head.next;
	}
	public void deleteLast() {
		if(head==null) {
			System.out.println("This list is empty.");
			return;
		}
		size--;
		if(head.next==null) {
			head=null;
			return;
		}
		Node secondlast=head;
		Node lastNode=head.next;
		
		while(lastNode.next!=null) {
			lastNode=lastNode.next;
			secondlast=secondlast.next;
		}
		secondlast.next=null;
	}
	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		LL1 list=new LL1();
		list.addFirst("a");
		list.addFirst("is");
		list.printlist();
		list.addLast("List");
		list.printlist();
		list.addFirst("this");
		list.printlist();
		list.deleteFirst();
		list.printlist();
		list.deleteLast();
		list.printlist();
		System.out.println(list.getSize());
		

	}

}
