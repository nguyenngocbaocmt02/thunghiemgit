package hust.soict.globalict.aims.media;
import java.util.*;

import hust.soict.globalict.aims.Aims.PlayerException;
public class TestMediaCompareTo {
	public static void main(String[] args) {
		Collection collection = new java.util.ArrayList();
		DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost((float) (19.95));
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		
		DigitalVideoDisc dvd2=new DigitalVideoDisc("Star War");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost((float) 24.95);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		
		DigitalVideoDisc dvd3=new DigitalVideoDisc("Alladin a");
		dvd3.setCategory("Animation");
		dvd3.setCost((float) 18.99);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		Book book1 = new Book("Sach a");
		CompactDisc cd1=new CompactDisc("Chuyen chua ke",120);
		
		collection.add(dvd2);
		try {
			dvd2.play();
		} catch (PlayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		collection.add(dvd1);
		try {
			dvd1.play();
		} catch (PlayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		collection.add(dvd3);
		try {
			dvd3.play();
		} catch (PlayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Iterator iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The DVDs currently in the order are: ");
		while(iterator.hasNext()) {
			System.out.println((((Media) iterator.next())).getTitle());
		}
		Collections.sort((List) collection);
		iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The DVDs in sorted order are: ");
		while(iterator.hasNext()) {
			System.out.println((((Media) iterator.next())).getTitle());
		}
		System.out.println("----------------------------------");
		
		collection.add(book1);
		collection.add(cd1);
		try {
			cd1.play();
		} catch (PlayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort((List) collection);
		iterator = collection.iterator();
		System.out.println("----------------------------------");
		System.out.println("The Medias in sorted of order are: ");
		while(iterator.hasNext()) {
			System.out.println((((Media) iterator.next())).getTitle());
		}
		System.out.println("----------------------------------");
	}
}
