package ListInterface;

import ListInterface.LL.Node;

public class ReverseLL {
	Node head;
	private int size;
	ReverseLL(){
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
			System.out.println("List is empty.");
			return;
		}
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+"->");
			currNode=currNode.next;
		}
		System.out.println("Null");
	}
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
			System.out.println("This is empty list.");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		size--;
		Node secondlast=head;
		Node lastNode=head.next;// if head.next=null-> that means last node is also null it will arise a problem
		while(lastNode.next!=null) {//null.next will give error
			lastNode=lastNode.next;
			secondlast=secondlast.next;
		}
		secondlast.next=null;
	}
	public int getSize() {
		return size;
	}
	public void reverseIterate() {
		if(head==null || head.next==null) {
			return;
		}
		
		Node prevNode=head;
		Node currNode=head.next;
		while(currNode!=null) {
			Node nextNode=currNode.next;
			currNode.next=prevNode;
			
			//update
			prevNode=currNode;
			currNode=nextNode;
		}
		head.next=null;
		head=prevNode;
	}
	public Node reverseRecursive(Node node) {
		if(node==null || node.next==null) {
			return node;
		}
		Node newHead=reverseRecursive(node.next);
		node.next.next=node;
		node.next=null;
		return newHead;
	}
	public static void main(String[] args) {
		ReverseLL list=new ReverseLL();
		//list.addFirst("a");
//		list.addFirst("is");
//		list.printlist();
//		list.addLast("list");
//		list.addFirst("This");
//		list.printlist();
//		list.deleteFirst();
//		list.printlist();
//		list.deleteLast();
//		list.printlist();
//		list.addFirst("list");
//		list.addFirst("This");
		System.out.println(list.getSize());
//		list.reverseIterate();
//		list.printlist();
		list.head=list.reverseRecursive(list.head);
		list.printlist();
	}

}
