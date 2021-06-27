package hust.soict.globalict.test.disc.TestPassingParameter;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	static DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
	static DigitalVideoDisc cinderellaDVD=new DigitalVideoDisc("Cinderella");
	public static void main(String[] args) {
		jungleDVD.setCost(100);
		cinderellaDVD.setCost(2000);
		swap(jungleDVD,cinderellaDVD);
		System.out.println("jungle dvd title: "+jungleDVD.getTitle()+jungleDVD.getCost());
		System.out.println("cinderella dvd title: "+cinderellaDVD.getTitle()+cinderellaDVD.getCost());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: "+jungleDVD.getTitle());
	}
    public static void swap(DigitalVideoDisc o1, DigitalVideoDisc o2) {
    	DigitalVideoDisc tmp=o2;
    	o2=o1;
    	o1=tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title) {
    	String oldTitle =dvd.getTitle();
    	dvd.setTitle(title);
    	dvd=new DigitalVideoDisc(oldTitle);
    }
}
