import java.util.Scanner;

import javax.naming.LimitExceededException;

import hust.soict.globalict.aims.order.Order.*;
import hust.soict.globalict.aims.media.*;
import hust.soict.globalict.aims.utils.MyDate.*;
public class Aims {
	public static void showMenu() {
		System.out.println("Order Management Application: ");
		System.out.println("--------------------------------");
		System.out.println("1. Create new order");
		System.out.println("2. Add item to the order");
		System.out.println("3. Delete item by id");
		System.out.println("4. Display the items list of order");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
	}
	public static void main(String[] args) {
		Scanner keyboard= new Scanner(System.in);
		Order currentOrder = null;
		Order anOrder = null;
		try {
			currentOrder = new Order();
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		do {
			showMenu();
			System.out.println("Enter your command: ");
			int x= keyboard.nextInt();
			if(x==0) break;
			if(x==1) {
				
				try {
					anOrder = new Order();
				} catch (LimitExceededException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				currentOrder=anOrder;
			}
			if(x==2) {
				String title,category;
				int type;
				float cost;
				System.out.println("Nhap loai media(DVD=1 hoac Book=2): ");
				type=keyboard.nextInt();
				System.out.println("Nhap title: ");
				title=keyboard.next();
				System.out.println("Nhap category: ");
				category=keyboard.next();
				System.out.println("Nhap cost: ");
				cost=keyboard.nextFloat();
				System.out.println(type);
				if(type==1) {
					currentOrder.addMedia(new DigitalVideoDisc(title,category,cost));
					continue;
				}
				else if(type==2) {
					currentOrder.addMedia(new Book(title,category,cost));
					continue;
				}
				else {
					System.out.println("Nhap sai cu phap");
				}
			}
			if(x==3) {
				currentOrder.print();
				System.out.println("Nhap Id vat pham muon xoa: ");
				int ID=keyboard.nextInt();
				currentOrder.removeMedia(ID);
			}
			if(x==4) {
				currentOrder.print();
			}
		} while(true);
		System.exit(0);
	}
	
}
