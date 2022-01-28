package filehandling;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class writingtoafile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 System.out.println("enter the data to write");
		    Scanner sc=new Scanner(System.in);
		     String input= sc.nextLine();
		   	 FileWriter fw=new FileWriter("b.txt",true);
		   	 fw.write(input);
		   	 System.out.println("Data Written succesfully......");   	 
		   	 fw.close();
	}

}
