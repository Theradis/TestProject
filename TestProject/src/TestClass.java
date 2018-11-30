
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Exception Handling Example
		try {

			
			System.out.println("Say Hello World!");
					//Code that creates Exception
					int i = 1/0;
			System.out.println("End of execution.");
			
		}
		catch(Exception exp) {
			System.out.println("This is inside a Catch Block");
			System.out.println(exp.getMessage() );
			System.out.println("Cause is : "+exp.getCause());
			exp.printStackTrace();
		}
		
	}

}
