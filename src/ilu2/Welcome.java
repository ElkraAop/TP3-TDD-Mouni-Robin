package ilu2;

public class Welcome {

	public static String welcome(String nom) {
		StringBuilder sb = new StringBuilder();
		switch(caseDetection(nom)) {
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
		case 4:
			gestionCasNomMultiples(nom, sb);
		}
		return sb.toString();
	}
	
	private static int caseDetection(String nom) {
		int resultat = 1;
		if(nom==null||nom.isBlank()||nom.isEmpty()) {
			resultat = 2;
		}else if(nom.equals(nom.toUpperCase())) {
			resultat = 3;
		}else if(nom.contains(", ")) {
			return 4;
		}
		return resultat;
	}

	private static void gestionCasNomMultiples(String nom, StringBuilder sb) {
		sb.append("Hello, ");
		sb.append(Character.toUpperCase(nom.charAt(0)));
		int i = 1;
		int prochaineModif = 0;
		while(i<nom.length()) {
			if(nom.charAt(i) == ',') {
				prochaineModif = i+2;
			}
			if(i==prochaineModif) {
				sb.append(Character.toUpperCase(nom.charAt(i)));
			}else {
				sb.append(nom.charAt(i));
			}
			i++;
			
		}
	}
}
