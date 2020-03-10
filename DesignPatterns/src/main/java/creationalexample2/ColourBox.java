package creationalexample2;

import java.util.ArrayList;
import java.util.List;

public class ColourBox implements Cloneable{

	
	private String boxName;
	List<Colour>colours=new ArrayList<Colour>();
	public String getBoxName()
	{
		return boxName;
	}
	public List<Colour> getColours() {
		return colours;
	}
	public void setColours(List<Colour> colours) {
		this.colours = colours;
	}
	public void setBoxName(String boxName) {
		this.boxName = boxName;
	}
	public void loadData()
	{
		for(int i=1;i<=7;i++)
		{
			Colour c=new Colour();
			c.setCid(i);
			c.setCname("Colour"+i);
			getColours().add(c);
		}
	}
	@Override
	public String toString() {
		return "ColourBox [boxName=" + boxName + ", colours=" + colours + "]";
	}
	@Override
	protected ColourBox clone() throws CloneNotSupportedException {
		
		ColourBox Box =new ColourBox();
		for(Colour c: this.getColours())
		{
			Box.getColours().add(c);
		}
		return Box;
	}
	
}
