package doublyLinkedList;

//creating a Node so A node Contain a Value and this is a doubly Linked List so it have two
//pointers one is 'next' and another is 'prev' also the Node have a value itself
//create a constructur and set the (next and prev = null);
class Node{
    public int val;
    public Node next;
    public Node prev;
    Node(int val){
        this.val = val;
        next = prev = null;
    }
}
//creating a Linked list so initially the Linked list head and tail Both are point into 
// null that inside a constructor so every time i create a object of 'LL' i got this head and tail;
    class DoublyLinkedList{
        public Node head;
        public Node tail;
        public DoublyLinkedList() {
            head = tail = null;
        }
      // Adding a elment
        public void add(int val) {
            Node node = new Node(val);
            Node temp = head;
            if(head == null){
                head = node;
            }
            else{
                  while (temp.next != null){
                    temp = temp.next;
                    }
                    temp.next = node;
            }
            

        }

        // printing Linked List
        public void Print() {
            Node temp = head;
            if(head == null){
                System.out.print("Empty list");
            }else{
                while( temp != null){
                System.out.print(temp.val +"  ->  ");
                temp = temp.next;
             }
             System.out.println("null");
          }
        }
        //Add After a element
        public void addAfter(int checkval ,int newValue) {
            Node node = new Node(newValue);
            Node temp = head;
            if (head == null){
                System.out.println("Empty List");
            }
            if(head == tail){
                head.next = node;
            }
            else{
                while(temp != null){
                    if(temp.val == checkval){
                        node.next = temp.next;
                        temp.next = node;
                    }
                        temp = temp.next;
                }
            }
        }
        public void addBefore(int val , int value){
            Node node = new Node(value);
            if(head == null){
                head = tail = node;
            }else{
                Node temp =head;
                
                while(temp != null){
                    
                    if(temp.val ==val){
                        node.next = temp;
                        node.prev = temp.prev;
                        
                        if(temp.prev == null){
                            head = node;
                        }else{
                            temp.prev.next = node;
                        }
                        temp.prev = node;
                        break;
                    }
                        temp = temp.next;
                }
            }
        }   
    
        public void addTostart(int val) {
            Node node = new Node(val);
            if(head == null){
                add(val);
                return;
            }
            else{
                node.next = head;
                head.prev = node;
                head = node;
            }
        }
       public void addToEnd(int val)
		{
			Node node = new Node(val);

			if (head == null){
				head = tail = node;
			}
			else{
				tail.next = node;
				node.prev = tail;
				tail = node;
			}
		}
        //Remove Duplicate 
        
        public void removeDuplicate(){
            Node temp,next;
            temp = head;
            if(head == null){
                System.out.println("Empty list");
            }
            
            else{
                while(temp.next != null){
                    next = temp.next;
                    if(temp.val == next.val){
                        temp.next = next.next;
                        next.prev =null;  
                    }else{
                        temp =temp.next;
                    }
                }
            }
        
        }
		
    }





 public class Main_Doubly_Linkedlist{
        public static void main(String[] args) {
            DoublyLinkedList list = new DoublyLinkedList();
           list.addBefore(3, 0); 
           list.add(5);
           list.addTostart(36);
           list.add(4);
           list.add(3);
            
           
            list.Print();
        }
}