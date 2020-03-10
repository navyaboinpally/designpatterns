package structuraldesignpatternUsingAdapter;

public class Homework
{
	public static void main(String [] args)
	{
		 pen p=new PenAdapter();
		Assignment w=new Assignment();
		w.setP(p);
		w.writeAssignment("done assignment1");
	}

}
