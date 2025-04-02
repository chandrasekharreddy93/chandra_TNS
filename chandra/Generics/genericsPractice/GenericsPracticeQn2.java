package genericsPractice;

import java.util.Arrays;
import java.util.List;

class printElements{
	public static <T> void printArray(List<T> array) {
		for(T item : array) {
			System.out.println(item);
		}
	}
}
public class GenericsPracticeQn2 {

	public static void main(String[] args) {
		List<String> strArr = Arrays.asList("Hello", "World");
		printElements.printArray(strArr);
	}

}
