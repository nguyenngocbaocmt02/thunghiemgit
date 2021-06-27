package hust.soict.globalict.aims.utils.MyDate;

import java.util.Scanner;
import java.util.Calendar;
public class MyDate {
   public int day;
   public int month;
   public int year;
   public Scanner keyboard=new Scanner(System.in);
   public int getDay() {
	   return day;
   }
   public void setDay(int day) {
	   this.day = day;
   }
   public int getMonth() {
	   return month;
   }
   public void setMonth(int month) {
	   this.month = month;
   }
   public int getYear() {
	   return year;
   }
   public void setYear(int year) {
	   this.year = year;
   }
   public MyDate() {
	   Calendar cal = Calendar.getInstance();
	   this.day=cal.get(Calendar.DAY_OF_MONTH);
	   this.month=cal.get(Calendar.MONTH);
	   this.year=cal.get(Calendar.YEAR);
	   
   }
   public MyDate(int a, int b, int c) {
	   day=a;
	   month=b;
	   year=c;
   }
   public MyDate(String s) {
	   String[] date=s.split(" ");
	   date[0]=date[0].toLowerCase();
	   if(date[0].equals("january") ) this.month=1; 
	   if(date[0].equals("february") ) this.month=2; 
	   if(date[0].equals("march") ) this.month=3; 
	   if(date[0].equals("april") ) this.month=4; 
	   if(date[0].equals("may") ) this.month=5; 
	   if(date[0].equals("june") ) this.month=6; 
	   if(date[0].equals("july") ) this.month=7; 
	   if(date[0].equals("august") ) this.month=8; 
	   if(date[0].equals("september") ) this.month=9; 
	   if(date[0].equals("october") ) this.month=10; 
	   if(date[0].equals("november") ) this.month=11; 
	   if(date[0].equals("december") ) this.month=12; 
	   this.year=Integer.parseInt(date[2]);
	   String srr= new String();
	   for (int i=0;i<date[1].length();i++) {
		   if( (int)date[1].charAt(i)<=(int)'9' && (int)date[1].charAt(i) >=(int)'0') {
			   srr=srr+date[1].charAt(i);
		   }
		   else break;
	   }
	   this.day=Integer.parseInt(srr);
   }
   public MyDate(String day, String month, String year) {
	   month=month.toLowerCase();
	   if(month.equals("january") ) this.month=1; 
	   if(month.equals("february") ) this.month=2; 
	   if(month.equals("march") ) this.month=3; 
	   if(month.equals("april") ) this.month=4; 
	   if(month.equals("may") ) this.month=5; 
	   if(month.equals("june") ) this.month=6; 
	   if(month.equals("july") ) this.month=7; 
	   if(month.equals("august") ) this.month=8; 
	   if(month.equals("september") ) this.month=9; 
	   if(month.equals("october") ) this.month=10; 
	   if(month.equals("november") ) this.month=11; 
	   if(month.equals("december") ) this.month=12; 

	   if(day.equals("first") ) this.day=1; 
	   if(day.equals("second") ) this.day=2; 
	   if(day.equals("third") ) this.day=3; 
	   if(day.equals("forth") ) this.day=4; 
	   if(day.equals("fifth") ) this.day=5; 
	   if(day.equals("sixth") ) this.day=6; 
	   if(day.equals("seventh") ) this.day=7; 
	   if(day.equals("eighth") ) this.day=8; 
	   if(day.equals("ninth") ) this.day=9; 
	   if(day.equals("tenth") ) this.day=10; 
	   if(day.equals("eleventh") ) this.day=11; 
	   if(day.equals("twelfth") ) this.day=12; 
	   if(day.equals("thirteenth") ) this.day=13; 
	   if(day.equals("forteenth") ) this.day=14; 
	   if(day.equals("fifteenth") ) this.day=15; 
	   if(day.equals("sixteenth") ) this.day=16; 
	   if(day.equals("seventeenth") ) this.day=17; 
	   if(day.equals("eighteenth") ) this.day=18; 
	   if(day.equals("nineteenth") ) this.day=19; 
	   if(day.equals("twentieth") ) this.day=20; 
	   if(day.equals("twenty first") ) this.day=21; 
	   if(day.equals("twenty second") ) this.day=22; 
	   if(day.equals("twenty third") ) this.day=23; 
	   if(day.equals("twenty forth") ) this.day=24; 
	   if(day.equals("twenty fifth") ) this.day=25; 
	   if(day.equals("twenty sixth") ) this.day=26; 
	   if(day.equals("twenty seventh") ) this.day=27; 
	   if(day.equals("twenty eighth") ) this.day=28; 
	   if(day.equals("twenty ninth") ) this.day=29; 
	   if(day.equals("thirtieth") ) this.day=30; 
	   if(day.equals("fifty first") ) this.day=31; 
	   
       String[] yea=year.split(" ");
      String first=yea[0];
      String second = "";
      int firstNum=0,secondNum=0,num=1;
      if(Character.toString(yea[0].charAt(yea[0].length()-1)).equals("y")) {
    	  if ((!Character.toString(yea[1].charAt(yea[1].length()-1)).equals("y"))&&!((Character.toString(yea[1].charAt(yea[1].length()-1)).equals("n")&&Character.toString(yea[1].charAt(yea[1].length()-2)).equals("e")&&Character.toString(yea[1].charAt(yea[1].length()-3)).equals("e")))){
    		  first=first+" "+yea[1];
    		  num++;
    	  }
      }
      if(num<=yea.length-1) { second=second+yea[num];num++;}
      if(num<=yea.length-1) { second=second+yea[num];num++;}
      if(num<=yea.length-1) { second=second+yea[num];num++;}
      first=first.toLowerCase();
      second=second.toLowerCase();
   if(first.equals("one") ) firstNum=1; 
   if(first.equals("two") ) firstNum=2; 
   if(first.equals("three") ) firstNum=3; 
   if(first.equals("four") ) firstNum=4; 
   if(first.equals("five") ) firstNum=5; 
   if(first.equals("six") ) firstNum=6; 
   if(first.equals("seven") ) firstNum=7; 
   if(first.equals("eight") ) firstNum=8; 
   if(first.equals("nine") ) firstNum=9; 
   if(first.equals("ten") ) firstNum=10; 
   if(first.equals("eleven") ) firstNum=11; 
   if(first.equals("twelve") ) firstNum=12; 
   if(first.equals("thirteen") ) firstNum=13; 
   if(first.equals("forteen") ) firstNum=14; 
   if(first.equals("fifteen") ) firstNum=15; 
   if(first.equals("sixteen") ) firstNum=16; 
   if(first.equals("seventeen") ) firstNum=17; 
   if(first.equals("eighteen") ) firstNum=18; 
   if(first.equals("nineteen") ) firstNum=19; 
   if(first.equals("twenty") ) firstNum=20; 
   if(first.equals("twenty one") ) firstNum=21; 
   if(first.equals("twenty two") ) firstNum=22; 
   if(first.equals("twenty three") ) firstNum=23; 
   if(first.equals("twenty four") ) firstNum=24; 
   if(first.equals("twenty five") ) firstNum=25; 
   if(first.equals("twenty six") ) firstNum=26; 
   if(first.equals("twenty seven") ) firstNum=27; 
   if(first.equals("twenty eight") ) firstNum=28; 
   if(first.equals("twenty nine") ) firstNum=29; 
   if(first.equals("thirty") ) firstNum=30; 
   if(first.equals("thirty one") ) firstNum=31; 
   if(first.equals("thirty two") ) firstNum=32; 
   if(first.equals("thirty three") ) firstNum=33; 
   if(first.equals("thirty four") ) firstNum=34; 
   if(first.equals("thirty five") ) firstNum=35; 
   if(first.equals("thirty six") ) firstNum=36; 
   if(first.equals("thirty seven") ) firstNum=37; 
   if(first.equals("thirty eight") ) firstNum=38; 
   if(first.equals("thirty nine") ) firstNum=39; 
      if(first.equals("forty") ) firstNum=40; 
   if(first.equals("forty one") ) firstNum=41; 
   if(first.equals("forty two") ) firstNum=42; 
   if(first.equals("forty three") ) firstNum=43; 
   if(first.equals("forty four") ) firstNum=44; 
   if(first.equals("forty five") ) firstNum=45; 
   if(first.equals("forty six") ) firstNum=46; 
   if(first.equals("forty seven") ) firstNum=47; 
   if(first.equals("forty eight") ) firstNum=48; 
   if(first.equals("forty nine") ) firstNum=49; 
     if(first.equals("fifty") ) firstNum=50; 
   if(first.equals("fifty one") ) firstNum=51; 
   if(first.equals("fifty two") ) firstNum=52; 
   if(first.equals("fifty three") ) firstNum=53; 
   if(first.equals("fifty four") ) firstNum=54; 
   if(first.equals("fifty five") ) firstNum=55; 
   if(first.equals("fifty six") ) firstNum=56; 
   if(first.equals("fifty seven") ) firstNum=57; 
   if(first.equals("fifty eight") ) firstNum=58; 
   if(first.equals("fifty nine") ) firstNum=59; 
      if(first.equals("sixty") ) firstNum=60; 
   if(first.equals("sixty one") ) firstNum=61; 
   if(first.equals("sixty two") ) firstNum=62; 
   if(first.equals("sixty three") ) firstNum=63; 
   if(first.equals("sixty four") ) firstNum=64; 
   if(first.equals("sixty five") ) firstNum=65; 
   if(first.equals("sixty six") ) firstNum=66; 
   if(first.equals("sixty seven") ) firstNum=67; 
   if(first.equals("sixty eight") ) firstNum=68; 
   if(first.equals("sixty nine") ) firstNum=69; 
      if(first.equals("seventy") ) firstNum=70; 
   if(first.equals("seventy one") ) firstNum=71; 
   if(first.equals("seventy two") ) firstNum=72; 
   if(first.equals("seventy three") ) firstNum=73; 
   if(first.equals("seventy four") ) firstNum=74; 
   if(first.equals("seventy five") ) firstNum=75; 
   if(first.equals("seventy six") ) firstNum=76; 
   if(first.equals("seventy seven") ) firstNum=77; 
   if(first.equals("seventy eight") ) firstNum=78; 
   if(first.equals("seventy nine") ) firstNum=79;
     if(first.equals("eighty") ) firstNum=80;  
   if(first.equals("eighty one") ) firstNum=81; 
   if(first.equals("eighty two") ) firstNum=82; 
   if(first.equals("eighty three") ) firstNum=83; 
   if(first.equals("eighty four") ) firstNum=84; 
   if(first.equals("eighty five") ) firstNum=85; 
   if(first.equals("eighty six") ) firstNum=86; 
   if(first.equals("eighty seven") ) firstNum=87; 
   if(first.equals("eighty eight") ) firstNum=88; 
   if(first.equals("eighty nine") ) firstNum=89;
      if(first.equals("fifty nine") ) firstNum=90;  
   if(first.equals("ninety one") ) firstNum=91; 
   if(first.equals("ninety two") ) firstNum=92; 
   if(first.equals("ninety three") ) firstNum=93; 
   if(first.equals("ninety four") ) firstNum=94; 
   if(first.equals("ninety five") ) firstNum=95; 
   if(first.equals("ninety six") ) firstNum=96; 
   if(first.equals("ninety seven") ) firstNum=97; 
   if(first.equals("ninety eight") ) firstNum=98; 
	   if(first.equals("ninety nine") ) firstNum=99; 

	   if(second.equals("one") ) secondNum=1; 
	   if(second.equals("two") ) secondNum=2; 
	   if(second.equals("three") ) secondNum=3; 
	   if(second.equals("four") ) secondNum=4; 
	   if(second.equals("five") ) secondNum=5; 
	   if(second.equals("six") ) secondNum=6; 
	   if(second.equals("seven") ) secondNum=7; 
	   if(second.equals("eight") ) secondNum=8; 
	   if(second.equals("nine") ) secondNum=9; 
	   if(second.equals("ten") ) secondNum=10; 
	   if(second.equals("eleven") ) secondNum=11; 
	   if(second.equals("twelve") ) secondNum=12; 
	   if(second.equals("thirteen") ) secondNum=13; 
	   if(second.equals("forteen") ) secondNum=14; 
	   if(second.equals("fifteen") ) secondNum=15; 
	   if(second.equals("sixteen") ) secondNum=16; 
	   if(second.equals("seventeen") ) secondNum=17; 
	   if(second.equals("eighteen") ) secondNum=18; 
	   if(second.equals("nineteen") ) secondNum=19; 
	   if(second.equals("twenty") ) secondNum=20; 
	   if(second.equals("twenty one") ) secondNum=21; 
	   if(second.equals("twenty two") ) secondNum=22; 
	   if(second.equals("twenty three") ) secondNum=23; 
	   if(second.equals("twenty four") ) secondNum=24; 
	   if(second.equals("twenty five") ) secondNum=25; 
	   if(second.equals("twenty six") ) secondNum=26; 
	   if(second.equals("twenty seven") ) secondNum=27; 
	   if(second.equals("twenty eight") ) secondNum=28; 
	   if(second.equals("twenty nine") ) secondNum=29; 
	   if(second.equals("thirty") ) secondNum=30; 
	   if(second.equals("thirty one") ) secondNum=31; 
	   if(second.equals("thirty two") ) secondNum=32; 
	   if(second.equals("thirty three") ) secondNum=33; 
	   if(second.equals("thirty four") ) secondNum=34; 
	   if(second.equals("thirty five") ) secondNum=35; 
	   if(second.equals("thirty six") ) secondNum=36; 
	   if(second.equals("thirty seven") ) secondNum=37; 
	   if(second.equals("thirty eight") ) secondNum=38; 
	   if(second.equals("thirty nine") ) secondNum=39; 
          if(second.equals("forty") ) secondNum=40; 
	   if(second.equals("forty one") ) secondNum=41; 
	   if(second.equals("forty two") ) secondNum=42; 
	   if(second.equals("forty three") ) secondNum=43; 
	   if(second.equals("forty four") ) secondNum=44; 
	   if(second.equals("forty five") ) secondNum=45; 
	   if(second.equals("forty six") ) secondNum=46; 
	   if(second.equals("forty seven") ) secondNum=47; 
	   if(second.equals("forty eight") ) secondNum=48; 
	   if(second.equals("forty nine") ) secondNum=49; 
         if(second.equals("fifty") ) secondNum=50; 
	   if(second.equals("fifty one") ) secondNum=51; 
	   if(second.equals("fifty two") ) secondNum=52; 
	   if(second.equals("fifty three") ) secondNum=53; 
	   if(second.equals("fifty four") ) secondNum=54; 
	   if(second.equals("fifty five") ) secondNum=55; 
	   if(second.equals("fifty six") ) secondNum=56; 
	   if(second.equals("fifty seven") ) secondNum=57; 
	   if(second.equals("fifty eight") ) secondNum=58; 
	   if(second.equals("fifty nine") ) secondNum=59; 
          if(second.equals("sixty") ) secondNum=60; 
	   if(second.equals("sixty one") ) secondNum=61; 
	   if(second.equals("sixty two") ) secondNum=62; 
	   if(second.equals("sixty three") ) secondNum=63; 
	   if(second.equals("sixty four") ) secondNum=64; 
	   if(second.equals("sixty five") ) secondNum=65; 
	   if(second.equals("sixty six") ) secondNum=66; 
	   if(second.equals("sixty seven") ) secondNum=67; 
	   if(second.equals("sixty eight") ) secondNum=68; 
	   if(second.equals("sixty nine") ) secondNum=69; 
          if(second.equals("seventy") ) secondNum=70; 
	   if(second.equals("seventy one") ) secondNum=71; 
	   if(second.equals("seventy two") ) secondNum=72; 
	   if(second.equals("seventy three") ) secondNum=73; 
	   if(second.equals("seventy four") ) secondNum=74; 
	   if(second.equals("seventy five") ) secondNum=75; 
	   if(second.equals("seventy six") ) secondNum=76; 
	   if(second.equals("seventy seven") ) secondNum=77; 
	   if(second.equals("seventy eight") ) secondNum=78; 
	   if(second.equals("seventy nine") ) secondNum=79;
         if(second.equals("eighty") ) secondNum=80;  
	   if(second.equals("eighty one") ) secondNum=81; 
	   if(second.equals("eighty two") ) secondNum=82; 
	   if(second.equals("eighty three") ) secondNum=83; 
	   if(second.equals("eighty four") ) secondNum=84; 
	   if(second.equals("eighty five") ) secondNum=85; 
	   if(second.equals("eighty six") ) secondNum=86; 
	   if(second.equals("eighty seven") ) secondNum=87; 
	   if(second.equals("eighty eight") ) secondNum=88; 
	   if(second.equals("eighty nine") ) secondNum=89;
          if(second.equals("fifty nine") ) secondNum=90;  
	   if(second.equals("ninety one") ) secondNum=91; 
	   if(second.equals("ninety two") ) secondNum=92; 
	   if(second.equals("ninety three") ) secondNum=93; 
	   if(second.equals("ninety four") ) secondNum=94; 
	   if(second.equals("ninety five") ) secondNum=95; 
	   if(second.equals("ninety six") ) secondNum=96; 
	   if(second.equals("ninety seven") ) secondNum=97; 
	   if(second.equals("ninety eight") ) secondNum=98; 
	   if(second.equals("ninety nine") ) secondNum=99; 

	  this.year=firstNum*100+secondNum;
   }
   public void accept() {
	   System.out.print("Nhap vao ngay thang e.g.February 18th 2019:");
	   String s=keyboard.nextLine();
	   MyDate t=new MyDate(s);
	   this.day= t.day;
	   this.month=t.month;
	   this.year=t.year;
   }
   public void print1() {
	   String s="";
	   if(this.month==1) s="January";
	   if(this.month==2) s="February";
	   if(this.month==3) s="March";
	   if(this.month==4) s="April";
	   if(this.month==5) s="May";
	   if(this.month==6) s="June";
	   if(this.month==7) s="July";
	   if(this.month==8) s="August";
	   if(this.month==9) s="September";
	   if(this.month==10) s="October";
	   if(this.month==11) s="November";
	   if(this.month==12) s="December";
	   String t="th";
	   if(this.day%10==1) t="st";
	   if(this.day%10==2) t="nd";
	   if(this.day%10==3) t="rd";
	   System.out.print(s+" "+day+t+" "+year);
   }
   public void print(String q) {
	   if(q.equals("yyyy-MM-dd")) System.out.println(this.year+"-"+this.month+"-"+this.day);
	   if(q.equals("d/M/yyyy")) System.out.println(this.day+"/"+this.month+"/"+this.year);
	   if(q.equals("mm-dd-yyyy")) System.out.println(this.month+"-"+this.day+"-"+this.year);
	   if(q.equals("dd-MMM-yyyy")) {
		   String s="";
		   if(this.month==1) s="Jan";
		   if(this.month==2) s="Feb";
		   if(this.month==3) s="Mar";
		   if(this.month==4) s="Apr";
		   if(this.month==5) s="May";
		   if(this.month==6) s="Jun";
		   if(this.month==7) s="Jul";
		   if(this.month==8) s="Aug";
		   if(this.month==9) s="Sep";
		   if(this.month==10) s="Oct";
		   if(this.month==11) s="Nov";
		   if(this.month==12) s="Dec";
		   System.out.println(this.day+"-"+s+"-"+this.year);
	   }
	   if(q.equals("MMM d yyyy")) {
		   String s="";
		   if(this.month==1) s="Jan";
		   if(this.month==2) s="Feb";
		   if(this.month==3) s="Mar";
		   if(this.month==4) s="Apr";
		   if(this.month==5) s="May";
		   if(this.month==6) s="Jun";
		   if(this.month==7) s="Jul";
		   if(this.month==8) s="Aug";
		   if(this.month==9) s="Sep";
		   if(this.month==10) s="Oct";
		   if(this.month==11) s="Nov";
		   if(this.month==12) s="Dec";
		   System.out.println(s+" "+this.day+" "+this.year);
	   }
   }
   public void print() {
	   System.out.println("Day: "+this.day+"   Month: "+this.month+"   Year: "+this.year);
   }
   public static void main(String[] args) {
	   MyDate day1=new MyDate("second","September", "twenty nineteen");
	   day1.print();
	   day1.print1();
	   day1.print("yyyy-MM-dd");
	   day1.print("d/M/yyyy");
	   day1.print("dd-MMM-yyyy");
	   day1.print("MMM d yyyy");
	   day1.print("mm-dd-yyyy");
	   System.exit(0);
   }
   
}
