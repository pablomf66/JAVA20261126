package fp.dam.java;

import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	
	static ArrayList<String> m1(String cadena) {
		char repe;
		char aux1;
		char aux2;
		for (int i=0; i<cadena.length(); i++) {
			aux1 = cadena.charAt(i);
			for(int j=0; j<cadena.length(); j++) {
				aux2 = cadena.charAt(j+1);
				if (aux1 == aux2) {
					
				}
			}
		}
		return null;
		
	}
	
	static ArrayList<String> m2(String cadena) {
		Pattern p = Pattern.compile("(.)\1");
		Matcher m = p.matcher(cadena);
		
		ArrayList<String> subcadenas = new ArrayList<>();
		
		while(m.find()) {
			subcadenas.add(m.group());
		}
		
		return subcadenas;
		
	}
	
	static int m3a(int[][] matriz) {
		int suma = 0;
		if (matriz.length <= 3) 
			return 5;
		else {
			for (int i = 0; i < 2 ; i++) {  // primera matriz
				suma += matriz[i][0];
				for (int j = 0; j < 2; i++) {
					suma += matriz[2][j];
				}
			}
		} return suma;
	}
	
	static Object m3b (int opcion) {
		Random r = new Random();
		int [][] t_final = null;
		
		switch (opcion) {
		case 1: 
			int[][] tablero8 = new int [10][10];
			break;
		case 2: 
			int[][] tablero16 = new int [16][16];	
			break;
		case 3:
			int[][] tablero30 = new int [16][30];
			break;
		default:
			return null;
		}
		return t_final;
		
		
	}
}
