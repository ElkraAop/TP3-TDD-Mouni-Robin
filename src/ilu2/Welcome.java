package ilu2;
import java.util.ArrayList;

public class Welcome {

	public static String welcome(String nom) {
		StringBuilder sb = new StringBuilder();
		if(isUseless(nom)) {
			sb.append("Hello, my friend");
		}else {
			String[] tabPrenom = nom.split(", ");
			ArrayList<String> PrenomNormaux = new ArrayList<String>();
			ArrayList<String> PrenomCri = new ArrayList<String>();
			for(int i = 0; i< tabPrenom.length;i++) {
				if(tabPrenom[i].equals(tabPrenom[i].toUpperCase())) {
					PrenomCri.add(tabPrenom[i]);
				}else {
					PrenomNormaux.add(tabPrenom[i]);
				}
			}
				if(PrenomNormaux.size()>0) {
					sb.append(construireChaine(PrenomNormaux));
					if(PrenomCri.size()>0)
						sb.append(". AND ");
				}
				if(PrenomCri.size()>0) {
					sb.append(construireChaine(PrenomCri).toUpperCase());
					sb.append(" !");
				}
		}
		return sb.toString();
	}

	private static void appendMajPremierChar(String nom, StringBuilder sb) {
		
		sb.append(Character.toUpperCase(nom.charAt(0)));
		for(int i =1; i<nom.length();i++) {
			sb.append(nom.charAt(i));
		}
	}
	
	private static String construireChaine(ArrayList<String> listPrenom) {
		StringBuilder sb = new StringBuilder();
		if(listPrenom.size() >0) {
			int tailleListe = listPrenom.size();
			sb.append("Hello,");
			for(int i = 0 ; i<tailleListe-2;i++) {
				sb.append(" ");
				appendMajPremierChar(listPrenom.get(i),sb);
				sb.append(",");
			}
			if(tailleListe>1) {
				sb.append(" ");
				appendMajPremierChar(listPrenom.get(tailleListe-2),sb);
				sb.append(" and ");
				appendMajPremierChar(listPrenom.get(tailleListe-1),sb);
			}else {
				sb.append(" ");
				appendMajPremierChar(listPrenom.get(0),sb);
			}
		}
		return sb.toString();
	}
	
	private static boolean isUseless(String a) {
		return (a==null || a.isBlank()|| a.isEmpty());
	}
}
