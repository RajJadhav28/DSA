package ListInterface;

public class LL {
	 class Node{
	        String data;
	        Node next;

	        Node(String data){
	            this.data=data;
	            this.next=null;
	        }
	    }
	     Node head;
	        //add- first, last
	        public void addFirst(String data){
	            Node newNode=new Node(data);
	            if(head == null){
	                head=newNode;
	                return;
	            }
	            newNode.next=head;
	            head=newNode;
	        }
	        public void addLast(String data){
	            Node newNode=new Node(data);
	            if(head == null){
	                head=newNode;
	                return;
	            }
	            Node currNode=head;
	            while(currNode.next !=null){
	                currNode=currNode.next;
	            }
	            currNode.next=newNode;
	        }
	        // Print the linked list
	        public void printList(){
	            if(head==null){
	                System.out.println("list is empty.");
	            }
	            Node currNode=head;
	            while(currNode !=null){
	                System.out.println(currNode.data+"->");
	                currNode=currNode.next;
	            }
	            System.out.println("NULL");
	            
	        }

	    
	    public static void main(String[] args) {
	        LL list=new LL();
	        list.addFirst("a");
	        list.addFirst("is");
	        list.printList();
	    }

}
