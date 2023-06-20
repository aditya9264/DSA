public class sumofdigitrecursion {
    public static void main(String[] args) {
       
       System.out.println(sum(5761));
       System.out.println(prod(505)); 

    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return (n%10) + sum(n/10);
    }

static int prod(int n){
    if(n%10==n){
        return n;
    }
    return (n%10) * prod(n/10);
}
}
        
