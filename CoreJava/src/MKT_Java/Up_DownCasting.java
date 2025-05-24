package MKT_Java;



	// Upcasting Vs Downcasting
	 
	// Parent class
	class Parent_567{
	    String name;
	 
	    // A method which prints the
	    // signature of the parent class
	    void method()
	    {
	        System.out.println("Method from Parent");
	    }
	}
	// Child class
	class Child2 extends Parent_567 {
	    int id;
	 
	    // Overriding the parent method
	    // to print the signature of the
	    // child class
	    @Override void method()
	    {
	        System.out.println("Method from Child");
	    }
	}
	 
	// Demo class to see the difference
	// between upcasting and downcasting
	public class Up_DownCasting {
		 
	    // Driver code
	    public static void main(String[] args)
	    {
	        // Upcasting
	    	Parent_567 p = new Child2();
	        p.name = "GeeksforGeeks";
	 
	        //Printing the parentclass name
	        System.out.println(p.name);
	        //parent class method is overridden method hence this will be executed
	        p.method();
	 
	        // Trying to Downcasting Implicitly
	        // Child c = new Parent(); - > compile time error
	 
	        // Downcasting Explicitly
	        Child2 c = (Child2)p;
	        c.id = 1;
	        System.out.println(c.name);
	        System.out.println(c.id);
	        c.method();
	    }

	}


