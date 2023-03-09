class Demo{
	public static void main(String[] args){

		int x = 8;  // 1000
		int y = 10; // 1001

//		1 0 0 0
//		1 0 0 1
//	and --> 1 0 0 0 --> 8	
		System.out.println(x & y); //  8
                
//	        1 0 0 0
//		1 0 0 1
//      OR -->  1 0 0 1 --> 10		
		System.out.println(x | y); // 10
	        
//		1 0 0 0 
//              1 0 0 1
//	XOR --> 0 0 0 1 --> 1
		System.out.println(x ^ y);  // 2
		
	}
}
