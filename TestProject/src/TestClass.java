
//test comment
public class TestClass { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call the demo()
		try {
			demo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void demo() throws Exception {
		
		System.out.println("Say Hello World!");
		//Code that creates Exception
		int i = 1/0;
		System.out.println("End of execution.");
		
		
				
	}

}
