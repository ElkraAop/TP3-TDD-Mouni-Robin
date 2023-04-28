package ilu2;

public class Welcome {

	public static String welcome(String nom) {
		StringBuilder sb = new StringBuilder();
		switch(caseDetection(nom)) {
		case 1:
			sb.append("Hello, ");
			appendMajPremierChar(nom, sb);
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
		}else if(nom.split(",").length>1) {
			return 4;
		}
		return resultat;
	}

	private static void gestionCasNomMultiples(String nom, StringBuilder sb) {
		String[] tabString = nom.split(", ");
		StringBuilder maj = new StringBuilder();
		sb.append("Hello, ");
		for(int i = 0;i<tabString.length;i++) {
			if(tabString[i]!=tabString[i].toUpperCase()) {
				appendMajPremierChar(tabString[i], sb);
				if(i<tabString.length-1) {
					sb.append(", ");
				}
			}else {
				if(maj.isEmpty()) {
					maj.append(". AND HELLO ");
				}else {
					maj.append(", ");
				}
				maj.append(tabString[i]);
			}	
		}
		if(!maj.isEmpty()) {
			if((tabString[tabString.length-1].equals(tabString[tabString.length-1].toUpperCase()))) {
				sb.deleteCharAt(sb.length()-1);
				sb.deleteCharAt(sb.length()-1);
			}
			sb.append(maj.toString());
			sb.append(" !");
		}
	}
	private static void appendMajPremierChar(String nom, StringBuilder sb) {
		sb.append(Character.toUpperCase(nom.charAt(0)));
		for(int i =1; i<nom.length();i++) {
			sb.append(nom.charAt(i));
		}
	}
}
