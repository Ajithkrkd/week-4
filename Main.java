

class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
        next = null;
    }
}

class LinkedList {
    public Node head;
    public Node tail;

    LinkedList() {
        head = tail = null;
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

    // Adding the Element in last position
   public void addEnd(int val)
	{
		Node node = new Node(val);
		
		if (head == null)
		{
			head = tail = node;
		} else {
			tail.next = node;
			tail = node;
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
        public void covertArray(int []arr ,LinkedList list) {
            
            for( int i : arr){
                list.add(i);
            }
            print();
        }
    
    }

// main class contain main Function
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("\n\n");
        int [] arr = new int[] {1,2,100,4,5,6};
        list.covertArray(arr, list);


         System.out.println("\n\n");
       
    }
}