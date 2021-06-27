package hust.soict.globalict.aims.media;

public class Disc extends Media{
    public int length;
    public String director;
    public double cost=0;
	Disc(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category, double cost) {
		super(title, category);
		this.cost=cost;
		// TODO Auto-generated constructor stub
	}
	Disc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	Disc(String title, int length) {
		super(title);
		this.length=length;
		// TODO Auto-generated constructor stub
	}
	public void setLength(int length) {
		this.length=length;
	}
	public void setDirector (String director) {
		this.director=director;
	}
	public int getLength() {
		return this.length;
	}
	public String getDirector() {
		return this.director;
	}
	

}
