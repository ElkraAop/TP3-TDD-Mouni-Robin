package ilu2;

public class Welcome {

	public Welcome() {

	}
	public String welcome(String nom) {
		StringBuilder sb = new StringBuilder();
		sb.append("Hello, ");
		sb.append(Character.toUpperCase(nom.charAt(0)));
		for(int i =1; i<nom.length();i++) {
			sb.append(nom.charAt(i));
		}
		return sb.toString();
	}
}
