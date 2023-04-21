package ilu2;

public class Welcome {

	public static String welcome(String nom) {
		StringBuilder sb = new StringBuilder();
		switch(CaseDetection(nom)) {
		case 1:
			sb.append("Hello, ");
			sb.append(Character.toUpperCase(nom.charAt(0)));
			for(int i =1; i<nom.length();i++) {
				sb.append(nom.charAt(i));
			}
			break;
		case 2 :
			sb.append("Hello, my friend");
			break;
		case 3 :
			sb.append("HELLO, ");
			sb.append(nom);
			break;
		}
		return sb.toString();
	}
	private static int CaseDetection(String nom) {
		int resultat = 1;
		if(nom==null||nom.isBlank()||nom.isEmpty()) {
			resultat = 2;
		}else if(nom.equals(nom.toUpperCase())) {
			resultat = 3;
		}
		return resultat;
	}
}
