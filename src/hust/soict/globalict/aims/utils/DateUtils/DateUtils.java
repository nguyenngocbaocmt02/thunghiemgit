package hust.soict.globalict.aims.utils.DateUtils;
import java.util.ArrayList;
import java.util.List;

import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.utils.MyDate.MyDate;
public class DateUtils {
     public static boolean compareDate (MyDate x, MyDate y) {
    	if(x.year>y.year) return true;
    	if(x.year<y.year) return false;
    	if(x.year==y.year) {
    		if(x.month>y.month) return true;
        	if(x.month<y.month) return false;
        	if(x.month==y.month) {
        		if(x.day>y.day) return true;
            	if(x.day<y.day) return false;
            	if(x.day==y.day) return true;
        	}
    	}
    	return true;
     }
     public static MyDate[] sort(MyDate[] x) {
    	 for(int i=0;i<x.length;i++) {
    		 for (int j=i+1;j<x.length;j++) {
    		 if(compareDate(x[i],x[j])) {
    			 int z=x[i].day;
    			 x[i].day=x[j].day;
    			 x[j].day=z;
    			 z=x[i].month;
    			 x[i].month=x[j].month;
    			 x[j].month=z;
    			 z=x[i].year;
    			 x[i].year=x[j].year;
    			 x[j].year=z;
    		 }
    		 }
    	 }
    	 return x;
    		 
     }
     public static void main(String[] args) {
    	 MyDate x1=new MyDate(3,4,1000);
    	 MyDate x2=new MyDate(1,4,1000);
    	 MyDate x3=new MyDate();
    	 MyDate[] ta= {x1,x2,x3};
    	 ta=DateUtils.sort(ta);
    	 for(int i=0;i<3;i++) ta[i].print();
    	 
     }

}
