import java.util.ArrayList;

public class Fib {
	public static ArrayList fibGen (int n) {
		ArrayList<Integer> fiblist = new ArrayList<>();
		fiblist.add(0);
		if (n == 0) return fiblist;
		else {
			fiblist.add(1);
			while (fiblist.get(fiblist.size()-1) <= n-fiblist.get(fiblist.size()-2)) {
				int val = fiblist.get(fiblist.size()-1) + fiblist.get(fiblist.size()-2);
				fiblist.add(val);
				}
			return fiblist;
			}
		}
	public static void main (String[] args) {
		System.out.println(fibGen(100));
	}
}

