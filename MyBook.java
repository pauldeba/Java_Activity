package OppsConcept;

public class MyBook extends Book{
	
	public void setMethod(String arg) {
		title = arg;		
	}

	public static void main(String[] args) {
		//initializing title of book
		String title = "ABC Book Publication";
		//create object of MyBook Class
		MyBook newNovel = new MyBook();
		//set title of book
		newNovel.setMethod(title);
		// print title of book
		System.out.println("The Title is: "+newNovel.getMethod());
		
	}

}
