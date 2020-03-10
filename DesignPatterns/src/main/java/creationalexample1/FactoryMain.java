package creationalexample1;
import java.util.Scanner;

import creationalexample1.Application;
import creationalexample1.ProgrammingLanguages;
import creationalexample1.Software;
import creationalexample1.SoftwareFactory;
import creationalexample1.System;

public class FactoryMain {

	public static void main(String args[])
	{
		
		SoftwareFactory sf=new SoftwareFactory();
		Software obj =sf.getInstance("Learn Java");
		obj.spec();
		
	}

}
