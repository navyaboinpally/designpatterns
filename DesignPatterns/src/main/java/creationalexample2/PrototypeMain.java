package creationalexample2;

public class PrototypeMain {

	public static void main(String [] args) throws CloneNotSupportedException
	{
		ColourBox cb=new ColourBox();
		cb.setBoxName("Rainbow");
		cb.loadData();
		
		ColourBox cb1=(ColourBox)cb.clone();
		cb.getColours().remove(2);
		cb1.setBoxName("Markers");
		
		System.out.println(cb);
		System.out.println(cb1);
	}
}
