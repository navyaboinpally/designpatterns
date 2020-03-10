package structuraldesignpatternUsingAdapter;

public  class PenAdapter implements pen
{
	book pp=new  book();

	public void write(String str) 
	{
		
		pp.mark(str);
	}

}
