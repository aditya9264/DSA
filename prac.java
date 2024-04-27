public class prac {

    static int x=10;
	int y=20;
	
	{
		System.out.println(" non static block executed");
	}
	 static
	 {
	 	System.out.println("static block executed");
		
	 }
	 prac(int y)
	 {
	 	System.out.println("constructor executed");
		this.y=y;
	 }
	 void nonStaticMeth()
	 {
	 	System.out.println("non static method executed");
	 }
	 static void staticMeth()
	{
	 	System.out.println("static method executed");
	 }
	public static void main(String[] args) 
	{
		System.out.println("main start");
		System.out.println(x);
		 staticMeth();

        System.out.println("main end");
		prac e = new prac(20);
		 e.nonStaticMeth();
	}
}
