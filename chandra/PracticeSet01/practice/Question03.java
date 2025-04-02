package practice;

public class Question03 {

	public static void main(String[] args) {
		long sum = 0;
		int i = 1;
		while(i <= 100) {
			if(i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("The sum of all even numbers from 1 to 100 are: " + sum);

	}

}
