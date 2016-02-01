package DniNie;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MainDniNie {

	public static void main(String[] args) {
		
		//--------------------------------TEST DNI---------------------------------
		
		String regexDni = "\\b\\d{8}[A-Z&&[^IÑOU]]\\b";
		Pattern pDni = Pattern.compile(regexDni);
		
		//---------------------------TEST DNI CORRECTO-----------------------------
		
		String[] testDniCorrecto = {
				"78484464T","72376173A","01817200Q","95882054E","63587725Q",
				"26861694V","21616083Q","26868974Y","40135330P","89044648X"};
		
		System.out.println("\n ***** Casos Test DNI PASS ***** \n");
		
		for(String dni : testDniCorrecto){
			Dni objetoDni = new Dni(dni);
			Matcher mDni = pDni.matcher(dni);
			if (mDni.find()){
				System.out.println("DNI --> " + objetoDni.getDni() + " correcto");
			}else{
				System.out.println("DNI --> " + objetoDni.getDni() + " incorrecto");
			}
		}
		
		//-------------------------TEST DNI INCORRECTO-----------------------------
		
		int numeroCasos = 10;
		String caso;
		
		ArrayList<String> testDniIncorrecto = new ArrayList<>();
		
		for(int i = 1; i <= numeroCasos; i++){
			caso = "";
			for(int j = 1; j < 9; j++){
				Integer caracterAscii = ThreadLocalRandom.current().nextInt(48, 59); // 59 excluido
				caso = caso + String.valueOf( Character.toChars(caracterAscii) );
			}
			Integer caracterAscii = ThreadLocalRandom.current().nextInt(65, 91);
			caso = caso + String.valueOf( Character.toChars(caracterAscii) );
			testDniIncorrecto.add(caso);
		}
		
		System.out.println("\n ***** Casos Test DNI NOT PASS ***** \n");
		
		for(String dni : testDniIncorrecto){
			Dni objetoDni = new Dni(dni);
			Matcher mDni = pDni.matcher(dni);
			if (mDni.find() && objetoDni.checkCIF()){
				System.out.println("DNI --> " + objetoDni.getDni() + " correcto");
			}else{
				System.out.println("DNI --> " + objetoDni.getDni() + " incorrecto");
			}
		}
		
		//--------------------------------TEST NIE---------------------------------
		
		String regexNie = "\\b[XYZ]\\d{7}[A-Z&&[^IÑOU]]\\b";
		Pattern pNie = Pattern.compile(regexNie);
		
		//---------------------------TEST NIE CORRECTO-----------------------------
		
		String[] testNieCorrecto = {
				"X5175704Z","Z4222927V","Z4892867J","Y8321205A","Z2074580P",
				"X8491040S","X1669100J","Z7461867M","Z6906586J","Z5324421H"};
				
		System.out.println("\n ***** Casos Test NIE PASS ***** \n");
				
		for(String nie : testNieCorrecto){
			Nie objetoNie = new Nie(nie);
			Matcher mNie = pNie.matcher(nie);
			if (mNie.find()){
				System.out.println("NIE --> " + objetoNie.getNie() + " correcto");
			}else{
				System.out.println("NIE --> " + objetoNie.getNie() + " incorrecto");
			}
		}
		
		//---------------------------TEST NIE INCORRECTO-----------------------------
		
		ArrayList<String> testNieIncorrecto = new ArrayList<>();
		
		for(int i = 1; i <= numeroCasos; i++){
			caso = "";
			Integer firstCaracterAscii = ThreadLocalRandom.current().nextInt(65, 91);
			caso = caso + String.valueOf( Character.toChars(firstCaracterAscii) );
			for(int j = 1; j < 8; j++){
				Integer caracterAscii = ThreadLocalRandom.current().nextInt(48, 59);
				caso = caso + String.valueOf( Character.toChars(caracterAscii) );
			}
			Integer caracterAscii = ThreadLocalRandom.current().nextInt(65, 91);
			caso = caso + String.valueOf( Character.toChars(caracterAscii) );
			testNieIncorrecto.add(caso);
		}
		
		System.out.println("\n ***** Casos Test NIE NOT PASS ***** \n");
		
		for(String nie : testNieIncorrecto){
			Nie objetoNie = new Nie(nie);
			Matcher mNie = pNie.matcher(nie);
			if (mNie.find() && objetoNie.checkCIF()){
				System.out.println("NIE --> " + objetoNie.getNie() + " correcto");
			}else{
				System.out.println("NIE --> " + objetoNie.getNie() + " incorrecto");
			}
		}
	}

}