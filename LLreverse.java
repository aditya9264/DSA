import org.w3c.dom.Node;

public class LLreverse {
    
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
       
    public void reverseiterate(){

        if(head == null || head.next == null ){
            return;
        }
     Node prevNode = head ;
     Node currNode = head.next;
     while(currNode != null){
        Node nextNode = currNode.next;
        currNode.next  = prevNode;

        //update the nodes 
        prevNode = currNode;
        currNode = nextNode;
     }
     head.next = null;
     head = prevNode;  
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
        LLreverse list = new LLreverse();
        list.addLast(1);
        list.addLast(3);
        list.addLast(2);
        list.addLast(4);
        list.addLast(5);
        list.printlist();
       // System.out.println(list);
        list.reverseiterate();
        list.printlist();



        
    }
}


