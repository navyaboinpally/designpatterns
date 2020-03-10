package creationalexample1;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Application implements Software{


	public void spec() {
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("Learn to use ");
		
	}
	

}
