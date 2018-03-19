/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 4. Your pseudocode algorithm for how to break down the figure


public class StarFigures {
	public static void main(String[] args) {
		Drawlines();
		DrawX();
		System.out.println();
		System.out.println();
		Drawlines();
		DrawX();
		Drawlines();
		System.out.println();
		System.out.println();
		DrawAsterick();
		Drawlines();
		DrawX();
	}
	
	
	public static void Drawlines() {
		System.out.println("*****");
		System.out.println("*****");
	}
	
	public static void DrawX() {
		System.out.println(" * *");
		System.out.println("  *");
		System.out.println(" * *");
	}

	public static void DrawAsterick() {
		System.out.println("  *");
		System.out.println("  *");
		System.out.println("  *");
		}
		
	}


