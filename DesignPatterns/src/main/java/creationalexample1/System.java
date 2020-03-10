package creationalexample1;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class System implements Software {

	public static Object out;


	public void spec() {
		PrintStream myOutput=new PrintStream(new FileOutputStream(FileDescriptor.out));
		myOutput.print("Most important");
	}
	
	

}
