package fr.diginamic.dates;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;



public class TestDates {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cr�ez une instance de la classe java.util.Date � la date du jour en utilisant un deses constructeurs
		Date today = new Date();
		System.out.println(today);
		
		//Affichez l�instance ainsi cr��e au format suivant : jour/mois/ann�e
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/y");
		System.out.println(dateFormat.format(today));
		
		//Cr�ez une instance de la classe Date � la date du 19 mai 2016 � 23h59 et 30secondes
		Date dixNeufMai = new Date(116, 4, 19, 23, 59, 30);
		System.out.println(dixNeufMai);
		
		//Affichez l�instance ainsi cr��e au format suivant : ann�e/mois/jour heure:minute:seconde
		SimpleDateFormat dateDixNeufMai = new SimpleDateFormat("y/MM/dd hh:mm:ss");
		System.out.println(dateDixNeufMai.format(dixNeufMai));
		
		//Cr�ez une instance de Date contenant la date/heure syst�me et affichez-la au m�me format que ci-dessus. ?
		
		System.out.println("-------------------------------------------------");
		
		//Utilisez la classe java.util.Calendar pour cr�er une instance de Date � la date du 
		//19 mai 2016 � 23h59 et 30 secondes et affichez la au format suivant :
		// jour/mois/ann�e
		
		Calendar calDixNeufMai = Calendar.getInstance();
		calDixNeufMai.set(2020, 4, 19, 23, 59, 30);
		Date date19 = calDixNeufMai.getTime();
		
		SimpleDateFormat formationGundham = new SimpleDateFormat("dd/MM/y");
		String calendar19 = formationGundham.format(date19);

		System.out.println(calendar19);

		//Utilisez la classe java.util.Calendar pour cr�er une instance de Date � la date du jour.
		Calendar calendarToday = Calendar.getInstance();
		Date dateToday = calendarToday.getTime();
		System.out.println(dateToday);
		
		//Affichez l�instance ainsi cr��e au format suivant : ann�e/mois/jour heure:minute:seconde
		SimpleDateFormat formationGundham2 = new SimpleDateFormat("y/MM/dd hh:mm:ss");
		String calendarToday2 = formationGundham2.format(dateToday);
		System.out.println(calendarToday2);
		
		// Affichez la m�me instance avec le nom des jours et des mois en fran�ais, russe, chinois et allemand.
		
		SimpleDateFormat formationFR = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.FRANCE);
		String calendarFR = formationFR.format(dateToday);
		System.out.println(calendarFR);
		
		Locale locale = new Locale("ru", "RU");
		SimpleDateFormat formationRU = new SimpleDateFormat("EEEEE dd MMMMM yyyy", locale);
		String calendarRU = formationRU.format(dateToday);
		System.out.println(calendarRU);
		
		SimpleDateFormat formationCH = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.CHINESE);
		String calendarCH = formationCH.format(dateToday);
		System.out.println(calendarCH);
		
		SimpleDateFormat formationDE = new SimpleDateFormat("EEEEE dd MMMMM yyyy", Locale.GERMAN);
		String calendarDE = formationDE.format(dateToday);
		System.out.println(calendarDE);
		
	}

}
