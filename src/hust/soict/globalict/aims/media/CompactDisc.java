package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.Aims.PlayerException;

public class CompactDisc extends Disc implements Playable {
    private String article;
    private List<Track> track = new ArrayList<Track>();
	public CompactDisc(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String title, int t) {
		super(title,t);
	}
	public CompactDisc(String titles, String categorys, double costt) {
		super(titles,categorys,costt);
	}
	public String getArticle() {
		return this.article;
	}
    public void addTrack(Track obj) {
    	if(this.track.indexOf(obj)==-1) {
    		System.out.println("Succesful to add track");
    		this.track.add(obj);
    	}
    	else {
    		System.out.println("This track current in your order!");
    	}
    }
    public void removeTrack(Track obj) {
    	if(this.track.indexOf(obj)==-1) {
    		System.out.println("This track isn't in your order!");
    	}
    	else {
    		this.track.remove(this.track.indexOf(obj));
    		System.out.println("Success to remove!");
    	}
    }
    public int getLength() {
    	int sum=0;
    	for(int i=0;i<this.track.size();i++) {
    		sum+=this.track.get(i).getLength();
    	}
    	return sum;
    }
    public void play() throws PlayerException{
    	if(this.getLength() > 0) {
    	// TODO Play all tracks in the CD as you have implemented
    	java.util.Iterator iter = track.iterator();
    	Track nextTrack;
    	while(iter.hasNext()) {
    	nextTrack = (Track) iter.next();
    	try {
    	nextTrack.play();
    	}catch(PlayerException e) {
    	throw e;
    	}
    	}
    	}else {
    	throw new PlayerException("ERROR: CD length is non-positive!");
    	}
    }
    public int compareTo(CompactDisc obj) {
		if(this.track.size()>((CompactDisc)obj).track.size()) return 1;
		else if(this.track.size()>((CompactDisc)obj).track.size()) return -1;
		else if(super.length>((Disc)obj).length) return 1;
		else if(super.length==((Disc)obj).length) return 0;
		else return -1;
	}
	public String toString() {
		String result="CD_"+this.title+"_"+this.category+"_"+Double.toString(this.cost);
		
		return result;
	}
}
