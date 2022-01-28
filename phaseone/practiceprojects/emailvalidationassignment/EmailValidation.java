package emailvalidationassignment;
import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		          Scanner sc = new Scanner(System.in); 
		          System.out.print("Enter  email_ID: ");  
		          String e = sc.nextLine();  
		          sc.close();
		          ArrayList<String> arr=new ArrayList<String>();   
			      arr.add("manoj@gmail.com");
			      arr.add("kumar@gmail.com");
			      arr.add("reddy@gmail.com");
			      arr.add("ganesh@gmail.com");
			      arr.add("priya@gmail.com");
			      if (arr.contains(e)){
			    	System.out.println("Valid Email_ID");
			       }
			      else {
			    		System.out.println("Unvalid Email_ID");
			       }
	}
}

