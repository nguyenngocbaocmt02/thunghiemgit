package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.Aims.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	public DigitalVideoDisc(String title) {
		super(title);
	}
	public DigitalVideoDisc(String title,
			String category,float cost){
			this(title);
			this.category = category;
			this.cost=cost;
		}
	
	public DigitalVideoDisc(String title, String category, double cost) {
		super(title,category,cost);
	}
	public boolean search(String title) {
		String[] res=this.title.split(" ");
		String[] res1=title.split(" ");
		boolean q=true;
		for (int i=0;i<res1.length;i++) {
			boolean u=false;
			for(int j=0;j<res.length;j++) {
				if(res1[i].equals(res[j])) {
					u=true;
					break;
				}
			}
			if(u==false) {q=false;break;}
		}
		return q;
	}
	public static void main(String[] args) {
		DigitalVideoDisc dvd1= new DigitalVideoDisc("RTEE");
		System.out.print(dvd1.getTitle());
		System.exit(0);
	}
	public void setCategory(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setCost(float f) {
		// TODO Auto-generated method stub
		
	}
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing DVD: " + this.getTitle());
			System.out.println("DVD length: " + this.getLength());
		} else {
		throw new PlayerException("ERROR: DVD length is non-positive!");
		}
	}
	public int compareTo(DigitalVideoDisc obj) {
		if(super.cost>((Disc)obj).cost) return 1;
		else if(super.cost==((Disc)obj).cost) return 0;
		else return -1;
	}
	public String toString() {
		String result="DVD_"+this.title+"_"+this.category+"_"+Double.toString(this.cost);
		
		return result;
	}
}

