package practice;

import java.util.Scanner;

class Mobile {
	
    public void createContact(String name, long phone1){
        System.out.println(name);
        System.out.println(phone1);
    }
    
    public void createContact(String name, long phone1, long phone2){
        System.out.println(name);
        System.out.println(phone1);
        System.out.println(phone2);
    }
}


public class Question07 {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 2) {
        	String name = sc.next();
            long phone1 = sc.nextLong();
        	mobile.createContact(name, phone1);
        }else if(n == 3){
        	String name = sc.next();
            long phone1 = sc.nextLong();
            long phone2 = sc.nextLong();
        	mobile.createContact(name, phone1, phone2);
        }else {
        	System.out.println("Invalid number of parameters");
        }
        sc.close();
	}

}
