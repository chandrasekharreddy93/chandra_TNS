package genericsPractice;

import java.util.Arrays;
import java.util.List;

class MaxElement{
	public static <T extends Comparable<T>> T findMax(List<T> array) {
		T max = array.get(0);
		for(int i = 1; i < array.size(); i++) {
			if(array.get(i).compareTo(max) > 0) {
				max = array.get(i);
			}
		}
		return max;
	}
}
public class GenericsPracticeQn1 {

	public static void main(String[] args) {
		List<String> strArr = Arrays.asList("apple", "banana", "grape");
		System.out.println(MaxElement.findMax(strArr));
		
		List<Integer> intArr = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(MaxElement.findMax(intArr));
		
		List<Double> dobArr = Arrays.asList(3.14, 2.71, 1.61);
		System.out.println(MaxElement.findMax(dobArr));
	}

}
