package hust.soict.globalict.aims.media;

public abstract class Media extends Object implements Comparable<Media>{
	protected int id;
	protected String title;
	protected String category;
	protected float cost;
	public Media(String title, String category,double costt) {
		this.title=title;
		this.category=category;
		this.cost=(float) costt;
	}
	public Media(String title){
		this.title = title;
	}
	public Media(String title,
		String category){
		this(title);
		this.category = category;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return this.title;
	}
	public String getCategory() {
		return this.category;
	}
	public float getCost() {
		return this.cost;
	}
	public boolean equals(Object o) {
		int t=this.title.compareTo(((Media) o).title);
		if(t==0 ) return true;
		else return false;
		
	}
	public void setId(int i) {
		
	}
	@Override
	public int compareTo(Media obj) {
		return this.title.compareTo(((Media) obj).title);
	}


}
