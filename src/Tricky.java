/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 1. Your predicted output 

/* Done with main. 

This is message1.
This is message2.

Done with message2. */

 public class Tricky {
	    public static void main(String[] args) {
	        message1();
	        message2();
	        System.out.println("Done with main.");
	    }
	    
	    public static void message1() {
	        System.out.println("This is message1.");
	    }
	    
	    public static void message2() {
	        System.out.println("This is message2.");
	        message1();
	        System.out.println("Done with message 2.");
	    }
	}

// 3. Were you correct? Explain any differences
 
 /* My prediction was not right. I had my ordering completely wrong.
  	Now that i see the answer i see what i did wrong. */

