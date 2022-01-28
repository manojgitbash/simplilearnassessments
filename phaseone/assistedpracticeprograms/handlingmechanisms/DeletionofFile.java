package handlingmechanisms;
import java.io.IOException; 
import java.nio.file.*; 
public class DeletionofFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        { 
            Files.deleteIfExists(Paths.get("f:/testFile1.txt")); 
        } 
        catch(NoSuchFileException e) 
        { 
            System.out.println("No such file/directory exists"); 
        } 
        catch(DirectoryNotEmptyException e) 
        { 
            System.out.println("Directory is not empty."); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Invalid permissions."); 
        } 

        System.out.println("Deletion successful."); 
    } 

}
