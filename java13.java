// Logical Operators --> && --> Logical and --> returns true if both satatement are true.
//                       || --> logical OR --> returns true if one of the statement is true.
//                       ! --> Logical not --> reverse the result, returns false if the result is true.


class Demo{
	public static void main(String[] args){

		int x = 5;
		int y = 7;

		boolean ans1 = x < y && y < x;
		boolean ans2 = x > y && y > x;
		boolean ans3 = x < y && y > x;
		boolean ans4 = x > y && y < x;

		System.out.println(ans1);  // false
		System.out.println(ans2);  // false
		System.out.println(ans3);  // true
		System.out.println(ans4);  // false


		boolean ans5 = x < y || y < x;
		boolean ans6 = x > y || y > x;
		boolean ans7 = x < y || y > x;
		boolean ans8 = x > y || y < x;

		System.out.println(ans5);  // true
		System.out.println(ans6);  // true
		System.out.println(ans7);  // true
		System.out.println(ans8);  // false
	}

}
