import org.w3c.dom.Node;

public class LLrevrecu {
     Node head;

       public class Node{
        int data ;
        Node next;
       
            
        Node(int data){
            this.data = data;
            this.next = null;
        }
        }
         public void addLast(int data){
                Node newnNode = new Node(data);
               if(head == null){
                head = newnNode ;
                return ; 
               }

               Node currNode = head ;
               while(currNode.next != null){
                currNode = currNode.next  ;
            }
           currNode.next = newnNode ;  
        
        }
       public Node reverserecursion(Node head){
        if(head == null || head.next == null){
            return head;
        }
          Node newHead = reverserecursion(head.next);
          head.next.next = head;
          head.next = null;
          
          return newHead;
       }
        public void printlist(){
             Node currNode = head ;
               while(currNode != null){
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next  ;
}
          
          System.out.println("NULL");

        }
    public static void main(String[] args) {
        LLrevrecu list = new LLrevrecu();
        list.addLast(1);
        list.addLast(3);
        list.addLast(2);
        list.addLast(4);
        list.addLast(5);
        list.printlist();
       list.head = list.reverserecursion(list.head);
        list.printlist();

    }
}
