package OppsConcept;

public class Activity2_4_Java{
	

	public static void main(String[] args) {
		
		try {
			Activity2_4_Java.exceptionTest("Will print to console");
			Activity2_4_Java.exceptionTest(null);
			Activity2_4_Java.exceptionTest("Won't execute");
		} catch (CustomException e) {
			System.out.println("Inside catch block:"+e.getMessage());
			//e.printStackTrace();
		}

	}
	
	static void exceptionTest(String str) throws CustomException{
		if(str==null) {
			throw new CustomException("String value is null");
		} else {
			System.out.println(str);
		}
	}
	

}


