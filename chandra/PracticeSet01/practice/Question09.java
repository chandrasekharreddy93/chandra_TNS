package practice;

import java.util.Scanner;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
		System.out.println("The Title of the Book is: " + title);
		System.out.println("The Author is: " + author);
	}
}
public class Question09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		String author = sc.nextLine();
		Book book = new Book(title, author);
		sc.close();
	}

}
