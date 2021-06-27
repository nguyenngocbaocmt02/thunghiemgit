package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Book extends Media{
	public String content;
	public List<String> contentTokens= new ArrayList();
	public TreeMap<String,Integer> wordFrequency= new TreeMap();
    Book(String title) {
		super(title);
		processContent();
	}
	Book(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
		processContent();
	}
	Book(String title, String category, String content) {
		super(title, category);
		this.content=content;
		// TODO Auto-generated constructor stub
		processContent();
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
		processContent();
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public Book(String title,
			String category,float cost){
			this(title);
			this.category = category;
			this.cost=cost;
		}
	Book(String title,
			String category,
			List<String> authors){
			super(title, category);
			this.authors = authors;
	}
	
	public Book(String titles, String categorys, double costt) {
		super(titles,categorys,costt);
	}

	private List<String > authors = new ArrayList<String>();
	
	
	public void addAuthor(String authorName) {
		if(authors.indexOf(authorName)!=-1) {
			System.out.println("The author is exist!");
		}
		else {
			authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		if(authors.indexOf(authorName)!=-1) {
			authors.remove(authorName);
		}
		else {
			System.out.println("The author isn't exist!");
		}
	}
	public void processContent() {
		String[] result = null;
		if(this.content!=null) result = this.content.split(" ");
		int x=0;
		if(result!=null) x=result.length;
		for(int i=0;i<x;i++) {
			for(int j=1+i;j<result.length;j++) {
				int q=result[i].compareTo(result[j]);
				if(q==1) {
					String tmp=result[i];
					result[i]=result[j];
					result[j]=tmp;
				}
			}
		}
		for(int i=0;i<x;i++) {
			this.contentTokens.add(result[i]);
		}
		for(int i=0;i<x;i++) {
			if(wordFrequency.containsKey(result[i])) {
				wordFrequency.put(result[i], wordFrequency.get(result[i])+1);
			}
			else {
				wordFrequency.put(result[i], 1);
			}
		}
		
		
	}
	public String toString() {
		String result=super.toString();
		result= result+"\nTitle: "+this.title.toString()+"\n"+ "Category: "+this.category+"\n"+"Content: "+this.content;
		result=result+"\n"+"The content length: "+ this.contentTokens.size()+"\n"+"The token list: "+ this.contentTokens.toString()+"\n"
				+ "The frequency of the content: "+ this.wordFrequency.toString();
		return result;
	}
	public static void main(String[] args) {
		Book tt=new Book("JJJJ","trtrw");
		tt.addAuthor("DFAD");
		tt.addAuthor("rtetr");
		tt.addAuthor("rerwe");	
		tt.removeAuthor("fdaf");
		tt.removeAuthor("DFAD");
		System.out.println(tt.authors);
	}
}
 