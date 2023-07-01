public class LL1 {

    Node head;
    private int size ;

    LL1(){
       this.size = 0;
    }

    class Node{
        String data ;
        Node next;
       
            
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
        }

        //Adding  element to first and last position of the linked list 

        //Adding at first Position
        public void addFirst(String data){
               Node newnNode = new Node(data);
               if(head == null){
                head = newnNode ;
                return ; 
               }

               newnNode.next = head ;
               head = newnNode;

        }
        //Adding at last Position 
        public void addLast(String data){
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

        public void printlist(){
            if(head == null){
                System.out.println("List is Empty");
                return ;
            }
             Node currNode = head ;
               while(currNode != null){
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next  ;
}
          
          System.out.println("NULL");

        }
        //Deleting element to first and last position of the linked list 
        // delete From first 

        public void deleteFirst(){
            
            if(head == null){
                System.out.println("List is Empty");
                return ;
            }
            size--;
             head = head.next ;

        }
        public void deleteLast(){
             if(head == null){
                System.out.println("List is Empty");
                return ;
            }
            size--;
            if(head.next == null ){
                head = null;
                return ;
            }
            Node secondlast = head ;
            Node lastnode = head.next;
            while(lastnode.next != null){
                lastnode = lastnode.next;
                secondlast = secondlast.next;

            }
            secondlast.next = null;
        
        }
        public int getsize(){
            return size ;
        }
        public static void main(String[] args) {
            LL1 list  =  new LL1();
            list.addFirst("a ");
             list.addFirst("is");
             list.printlist();

             list.addLast("linked");
             list.addLast("list");
             list.printlist();

             list.addFirst("This");
             list.printlist();

             list.deleteFirst();
             list.printlist();

             list.deleteLast();
             list.printlist();

             System.out.println(list.getsize());

             list.addFirst("This");
             list.printlist();
             System.out.println(list.getsize());
             list.addLast("list");
             list.printlist();
             System.out.println(list.getsize());

        }
    }

