package Day27;

//// No devide by zero (Arithmatic Exception)
// public class p1 {
  
// 	public static void main(String[] args) {

// 		System.out.println(4 / 2); // OFC
// 		System.out.println(4 / 4);

// 		try {
// 			System.out.println(2 / 0);
// 		} 
        
//         catch (ArithmeticException e) {
// 			System.out.println(" /  by zero -->  this is not possible ");
// 		}


// 	}
// }


/////Class not found excetption

// public class p1 {
  
// 	public static void main(String[] args) {
//         try {
// 			Class.forName("");
// 		} catch (ClassNotFoundException e) {
// 			System.out.println("this is Example of Compile Time Exception");
// 		}

// 	}
// }



// public class p1 {
  
// 	public static void main(String[] args) {
// 		try {
// 			System.out.println(3/0);
// 		} catch(Exception e){
// 			System.out.println("this is not Allowed / by 0");
// 		}finally {
// 			System.out.println("this is finally block ");
// 		}

// 	}
// }




public class p1 {
  
	public static void main(String[] args) {
		try {
			System.out.println(3 / 0);
			Class.forName("");
		} catch (ArithmeticException e) {
			System.out.println("this is not Allowed / by 0");
		} catch (ClassNotFoundException e) {
			System.out.println("this class in not found");
		}

	}
}


