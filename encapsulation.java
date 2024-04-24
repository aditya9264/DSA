public class encapsulation {
    public static void main(String[] args) {
        class Customer {
            private int custId;
            private String custName;
            private String custEmail;

            public int getCustId(){
                return this.custId ;
           
            }
            public int setCustId(int custId){
                return this.custId = custId;
            }
        }
        Customer c1 = new Customer();
        c1.setCustId(123);
        System.out.println(c1.getCustId());
        
    }
}
