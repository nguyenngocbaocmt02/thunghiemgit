package hust.soict.globalict.aims.order.Order;
import java.util.ArrayList;
import hust.soict.globalict.aims.media.Media;
import java.util.List;

import javax.naming.LimitExceededException;

import hust.soict.globalict.aims.Aims.PlayerException;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.MyDate.MyDate;
public class Order {
	
	public static final int MAX_NUMBERS_ORDERS=10;
	public static final int MAX_LIMITTED_ODERS=5;
	public static int nOrders=0;
	public double freetoll=0.0;
	public ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	public MyDate dateOrdered=new MyDate();
	public Order() throws LimitExceededException {
		if (Order.nOrders < MAX_LIMITTED_ODERS) {
		// TODO Set initial values for object attributes
		} else {
		throw new LimitExceededException("ERROR: The number of orders has reached its limit!");
		}
	}
	public MyDate getDateOrdered() {
		return dateOrdered;
	}
	public void setDateOrdered(MyDate dateOrdered) {
		this.dateOrdered = dateOrdered;
	}
	
	public int qtyOrdered() {
		return this.itemsOrdered.size();
	}
	public void addMedia(Media media) {
		if(this.qtyOrdered()==MAX_NUMBERS_ORDERS) {
			System.out.print("The number of discs is maximum! Can't add anymore\n");
		}
		else if(this.itemsOrdered.indexOf(media)>=0) {
			System.out.print(media.getTitle()+" is currently ordered by yourself\n");
		}
		else {
			this.itemsOrdered.add(media);
			System.out.print("Success to add "+media.getTitle()+"\n");
		}
	}
	public void removeMedia(Media  media) {
		if(this.itemsOrdered.isEmpty()) {
			System.out.print("There is nothing in your order to remove!\n");
		}
		else if(this.itemsOrdered.remove(media)) {
			System.out.print("Success to remove!\n");
		}
		else {
			System.out.print(media.getTitle()+" isn't in your order!\n");
		}
	}
	public void removeMedia(int id) {
		id=id;
		if(this.itemsOrdered.isEmpty()) {
			System.out.print("There is nothing in your order to remove!\n");
		}
		else if(id<=this.itemsOrdered.size()-1) {
			this.itemsOrdered.remove(id);
			System.out.print("Success to remove!\n");
		}
		else {
			System.out.print("The IdD "+" isn't in your order!\n");
		}
	}
	 public double totalCost() {
		 double cost=0;
		 for (int i=0;i<this.itemsOrdered.size();i++) {
			 cost=cost+itemsOrdered.get(i).getCost();
		 }
		 return cost-this.freetoll;
	 }
	 public void print() {
		 this.getALuckyItem();
		 System.out.print("***********************Order***********************\nDate: ");
		 this.dateOrdered.print();
		 for (int i=0;i<this.itemsOrdered.size();i++) {
			
			System.out.println((i+1)+". DVD -["+this.itemsOrdered.get(i).getTitle()+"] -["+this.itemsOrdered.get(i).getCategory()+"]: "+this.itemsOrdered.get(i).getCost()+"$");		
		 }
		 System.out.println("Free toll: "+this.freetoll);
		 System.out.println("Total cost: "+this.totalCost());
		 System.out.println("***************************************************");
	 }
	 public Media getALuckyItem() {
		 if(this.itemsOrdered.size()>=7&&this.totalCost()>322) {
		 int x=(int) Math.floor(Math.random()*this.itemsOrdered.size());
		 this.freetoll+=this.itemsOrdered.get(x).getCost();
		 if(this.freetoll>100) this.freetoll=100;
		 return this.itemsOrdered.get(x);
		 }
		 else {
			 System.out.println("You must buy 7 items and the cost is more than 322$ to get a free toll");
			 return null;
		 }
	 }
	
	public static void main(String[] args) throws PlayerException, LimitExceededException {
		Order anOrder=  new Order();
		Order anOrder2=  new Order();
		Order anOrder3=   new Order();
		Order anOrder4=   new Order();
		Order anOrder5=  new Order();
		Order anOrder1=  new Order();
		anOrder2.setDateOrdered(new MyDate(4,5,2020));
		anOrder3.setDateOrdered(new MyDate(3,5,2020));
		anOrder4.setDateOrdered(new MyDate(5,5,2020));
		anOrder5.setDateOrdered(new MyDate(9,5,2020));
		DigitalVideoDisc dvd1=new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost((float) (19.95));
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addMedia(dvd1);
		
		DigitalVideoDisc dvd2=new DigitalVideoDisc("Star War");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost((float) 24.95);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addMedia(dvd2);
		
		DigitalVideoDisc dvd3=new DigitalVideoDisc("Alladin");
		dvd3.setCategory("Animation");
		dvd3.setCost((float) 18.99);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addMedia(dvd2);
		anOrder.addMedia(dvd3);
		System.out.print("The total cost is: ");
		System.out.print(anOrder.totalCost()+"\n");
		
		DigitalVideoDisc dvd4=new DigitalVideoDisc("PiPi");
		dvd4.setCategory("Animation");
		dvd4.setCost(100);
		dvd4.setDirector("John Musker");
		dvd4.setLength(100);
		anOrder.print();
		anOrder.removeMedia(dvd4);
        anOrder.addMedia(dvd4);
        anOrder.print();
        anOrder2.addMedia(dvd4);
        anOrder2.addMedia(dvd2);
        anOrder2.print();
        System.exit(0);
	}
	
}
