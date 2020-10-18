
public class StringsAndCharacters {

	public static void main(String[] args) {
		String doubleLetter = "Wellcome";
		System.out.println(removeDoubledLetters(doubleLetter));

	}
	public static String removeDoubledLetters(String line) {
		String newLine = "";
		for(int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			if(i == 0 || ch != line.charAt(i-1)) {
				newLine += ch;
			}
		}
		return newLine;
	}
}