package creationalexample2;

public class Colour {

	private int cid;
	private String cname;
	public int getCid()
	{
		return cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String toString() {
		return "Colour [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
