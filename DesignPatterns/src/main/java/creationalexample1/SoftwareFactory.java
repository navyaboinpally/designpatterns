package creationalexample1;


public class SoftwareFactory {

	public Software getInstance(String s)
	{
		if(s.equals("Learn Java"))
			return new System();
		else if(s.equals("Learn to use"))
			return new Application();
		else
			return new ProgrammingLanguages();
	}
}
