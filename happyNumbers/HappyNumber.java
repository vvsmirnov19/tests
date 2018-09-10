import java.util.ArrayList;

public class HappyNumber {
	
	public static int summation (int number) {
		int summ = 0;
		while (number != 0) {
			summ += Math.pow(number % 10, 2);
			number /= 10;
		}
		return summ;
	}
	
	public static boolean happy (int number) {
		ArrayList<Integer> array = new ArrayList<>();
		while (number != 1) {
			if (array.contains(number)) return false;
			array.add(number);
			number = summation(number);
			}
		return true; 
	}
}

