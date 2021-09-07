import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.*;
import java.lang.Math;
import java.util.*;

public class OppgVeke36 {
	public static void main(String[] args) {
		int faktor = getInt("faktoriell");
		long res = faktoriell(faktor);
		System.out.println("Faktoriell av : " + faktor + " er : " + res);
		
		lonnsKalkulator(getInt("skriv in løn "));
		karakter(getInt("skriv in karakterpoeng"));
		
	}
	
	private static int[] oddeTalMellom() {
		int[] outp = {};
		int nedre = getInt("nedre");
		int ovre = getInt("ovre");
		if(ovre < nedre);
		return outp;
	}
	
	private static int getInt(String namn)
	{
		return Integer.parseInt(showInputDialog(namn));
	}
			
	/*
	 * Oppgåve O1 - Trinnskattkalkulator
	 */
	private static void lonnsKalkulator(int lonn) {
		
		int trinnNull = Math.min(lonn, 184800);
		int trinnEin = 0;
		int trinnTo = 0;
		int trinnTre = 0;
		int trinnFire = 0;
		
		lonn -= 184800;
		if(lonn > 0)
			trinnEin = Math.min(lonn, (260100-184800));
		lonn -= 75300;
		if(lonn > 0)
			trinnTo = Math.min(lonn, (651250-260100));
		lonn -= (651250-260100);
		if(lonn > 0)
			trinnTre = lonn;
		lonn -= (1021550-651250);
		
		trinnFire = Math.max(lonn, 0);
		
		System.out.print("trinn null : ");System.out.println(trinnNull);
		System.out.print("trinn ein  : ");System.out.println(trinnEin);
		System.out.print("trinn to   : ");System.out.println(trinnTo);
		System.out.print("trinn tre  : ");System.out.println(trinnTre);
		System.out.print("trinn fire : ");System.out.println(trinnFire);
		
		double totalSkatt = trinnEin * 0.0093 + 
							trinnTo * 0.0241 + 
							trinnTre * 0.1152 + 
							trinnFire * 0.1152;
		System.out.println("Total skatt er " + totalSkatt);
	}
	
	/*
	 *  Oppgåve O2 - Karakterskala
	 */
	
	private static void karakter(int karakterPoeng) {
		
		while(karakterPoeng < 0 || karakterPoeng > 100)
		{
			System.out.println("Feil i karakterpoeng");
			karakterPoeng = Integer.parseInt(showInputDialog("Ugyldig karakter, skriv in ny"));
		}
		char bokstavKarakter = 'G';
		
		if(karakterPoeng < 39)
			bokstavKarakter = 'F';
		else if( karakterPoeng < 49) {
			bokstavKarakter = 'E';
		}else if(karakterPoeng < 59) {
			bokstavKarakter = 'D';
		}else if( karakterPoeng < 79) {
			bokstavKarakter = 'C';
		}else if( karakterPoeng < 89) {
			bokstavKarakter = 'B';
		}else {
			bokstavKarakter = 'A';
		}
		System.out.print(karakterPoeng);
		System.out.print(" poeng gjer karakteren :");
		System.out.println(bokstavKarakter);
		
	}
	
	/*
	 * Oppgåve O3 - Faktoriell
	 */
	private static long faktoriell(int n)
	{
		if(n == 1)
			return 1;
		if (n > 1);
			return n * faktoriell(n-1);
	}
}
