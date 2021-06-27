package hust.soict.globalict.aims.Aims;

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
		try {
			currentOrder = new Order();
		} catch (LimitExceededException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread qq=new Thread(new MemoryDaemon(),"My Daemon Thread");
		qq.setDaemon(true);
		qq.start();
		do {
			showMenu();
			System.out.println("Enter your command: ");
			int x= keyboard.nextInt();
			if(x==0) break;
			if(x==1) {
				Order anOrder = null;
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
				System.out.println("Nhap loai media(DigitalVideoDisc= 1 hoac Book= 2 hoac CompactDisc= 3): ");
				type=keyboard.nextInt();
				System.out.println("Nhap title: ");
				title=keyboard.next();
				System.out.println("Nhap category: ");
				category=keyboard.next();
				if(type==1) {
					System.out.println("Nhap cost: ");
					cost=keyboard.nextFloat();
					System.out.println(type);
					DigitalVideoDisc x1=new DigitalVideoDisc(title,category,cost);
					currentOrder.addMedia(x1);
					System.out.println("Do you want to play ?(Yes=1  No=0): ");
					int choose=keyboard.nextInt();
					if(choose==0) continue;
					else
						try {
							x1.play();
						} catch (PlayerException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					continue;
				}
				else if(type==2) {
					System.out.println("Nhap cost: ");
					cost=keyboard.nextFloat();
					System.out.println(type);
					currentOrder.addMedia(new Book(title,category,cost));
					continue;
				}
				else if(type==3) {
					CompactDisc x1=new CompactDisc(title,category);
					currentOrder.addMedia(new CompactDisc(title,category));
					System.out.println("Do you want to play ?(Yes=1  No=0): ");
					int choose=keyboard.nextInt();
					if(choose==0) continue;
					else
						try {
							x1.play();
						} catch (PlayerException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
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
