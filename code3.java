// Relation operaters { <,>,<=,>=,!=,== }

class Demo{
	public static void main(String[] args){

		int  x = 10;
		int  y = 20;     
		// <<<<  T = 1, F = 0  >>>>>

		System.out.println(x < y);  // -T
		System.out.println(x > y);  // -F
		System.out.println(x <= y); // -T
		System.out.println(x >= y); // -F
		System.out.println(x == y); // -F
		System.out.println(x != y); // -T
		System.out.println(x);      // - 10
	}
}

