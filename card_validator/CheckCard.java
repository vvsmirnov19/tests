public class CheckCard {
	
	public static boolean check (String string) {
		int strl = string.length();
		if (strl < 1 | strl > 20) return false;
		int a = Character.getNumericValue(string.charAt(0));
		if (a < 2 | a > 7) return false;
		String new_string = "";
		for (int i = 0; i < strl; i++) {
		new_string += string.charAt(strl-1-i);
		}
		int summ = 0;
		int nstrl = new_string.length();
		for (int j = 0; j < nstrl; j++) {
			int b = Character.getNumericValue(new_string.charAt(j))*2;
			if (j % 2 != 0) {
				if (b > 9) summ += b - 9;
				else summ += b;
			}
			else summ += Character.getNumericValue(new_string.charAt(j));
		}
		if (summ % 10 == 0) return true;
		else return false;
	}
}

