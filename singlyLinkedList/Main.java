

package singlyLinkedList;
class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
        next = null;
    }
}

class singlyLinkedList {
    public Node head;
    public Node tail;

    singlyLinkedList() {
        head = tail = null;
    }
        // Adding the Element in last position
   public void addEnd(int val)
	{
		Node node = new Node(val);
		
		if (tail == null)
		{
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
		}
	}


    // print all elements in the linked list
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("empty list");
        } else {
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;

            }
            System.out.println("end");
        }

    }
    //Add A element
    public void add(int val){
        Node node = new Node(val);
        Node temp = head;
        if(head == null){
            head = node;
        }
       
        else{
            while(temp.next != null){
            
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    // adding in first position
    public void addFirst(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }


    public void addBefore(int val, int value) {
        Node node = new Node(value);
        Node temp = head;
        if (head == null) {
            System.out.println("empty list use addfisrt addLAst methode");
        }

        while (temp != null) {
            if (temp.next.val == val) {
                node.next = temp.next;
                temp.next = node;
                break;
            }
            temp = temp.next;
        }
    }
    public void addAfter(int val, int value) {
        Node node = new Node(value);
        Node temp = head;
        if (head == null) {
            System.out.println("empty list use addfisrt addLAst methode");
        }

        while (temp != null) {
            if (temp.val == val) {
                node.next = temp.next;
                temp.next = node;
                break;
            }
            temp = temp.next;
        }
    }
    //Delete a node with value specified
    public void deleteValue(int val) {
        Node temp = head;
        if(head == null){
            System.out.println("Empty list");
        }
        if(head.val == val){
            head = head.next;
            return;
        }
        else{
            while(temp != null){
                if(temp.next.val == val){
                    temp.next = temp.next.next;
                    break;
                }
                temp = temp.next;
            }
        }  
    }
    //Convert array into linked list
        public void covertArray(int []arr ,singlyLinkedList list) {
            
            for( int i : arr){
                list.add(i);
            }
            print();
        }

        // Print In Reverse Oreder
        public void printInRevers(Node data) {
            
            if(data.next != null){
                printInRevers(data.next);
            }
            System.out.print(data.val+" -> ");
        }
        //Deleting Duplicate Elements
        public void removeDuplicate(){
            Node temp = head,next;
            
        if(head == null){
            return;
           }
           while(temp.next != null){

                next = temp.next;

                if(temp.val == next.val){
                    temp.next = next.next;
                    next.next = null;
                }else{
                    temp = temp.next;
                }
           }
        }
        public boolean contain(int val) {
            Node temp;
            temp = head;
            while(temp != null){
                if(temp.val == val){
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

// main class contain main Function
public class Main {
    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        list.addEnd(45);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(4);
        list.add(4);
       list.removeDuplicate();
         list.print();
        //use this object and access all function
        //add
        //removeFirst
        //removelast
        //addFirst
        //addLAst
        //addBefore
        //addAfter
        //contain
        //removeDuplicate
        //print
        //printInReverse
        //covertArray

       
    }
}