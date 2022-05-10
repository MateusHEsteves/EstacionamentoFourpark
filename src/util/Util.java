package util;

import java.security.PublicKey;
import java.util.Scanner;

public class Util {
	
	public static Scanner util = new Scanner(System.in);
	
	public static String leiString(String mensagem) {
		
		System.out.println(mensagem);
		
		String oQueEuquero = util.nextLine();
		
		return oQueEuquero;
		
		
		
	}
	

}
