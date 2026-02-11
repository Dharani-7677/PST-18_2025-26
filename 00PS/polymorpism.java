package PST;

	public class polymorpism{

	    public static void main(String[] args) {
	 
	    
		      A objA = new A();
		      
		      B objB = new B();
		      objB.CSE();
		      
	    }
	}
	class A {
	    	 
	    	 static void CSE() {
	    		 
	    System.out.println("hii");
	    	 }
	}
	class B extends A {
	    	  
		static void IT() {
	    		 System.out.println("hloooo");
	    	  
	    }
	}

