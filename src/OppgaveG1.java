import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.*;
import java.lang.Math;
import java.util.*;
public class OppgaveG1 {
	public static void main(String[]args) {
		int a,b,c;
		a = 5;
		b = 7;
		c = a+b;
		/*
		a = Integer.parseInt(showInputDialog("a"));
		b = Integer.parseInt(showInputDialog("b"));
		
		if( a != 0 && b != 0)
			System.out.println(a/b);
		else
			System.out.println("Deling på null!");
			
		for(int i = 0; i  < 5 ; i++)
		{
			System.out.println(showInputDialog("hei"));
		}
		*/
		
		/*
		double vol = 0;
		double r = Float.parseFloat(showInputDialog("radius"));
		vol = (Math.pow(r, 3) * Math.PI * 4)/3;
		System.out.println(vol);
		*/
		
		/*
		String usr = "brukar";
		String passwd  = "passord";
		boolean passordRett = usr.equals(showInputDialog("Brukarnamn"));
		if(passwd.equals(showInputDialog("Passord")) && passordRett)
			System.out.println("riktig");
		else {
			System.out.println("feil");
		}
		*/
		int lonn = 1200000;
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
		System.out.println(totalSkatt);
		for(int i = 0; i < 5; i++);
			//karakter(Integer.parseInt(showInputDialog("Karakter")));
			
		tal();
		
		}
	
	public static void karakter(int karakterPoeng) {
		
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
	public static int[] tal() {
		int tmp = 0;
		int[] alle = {0,0,0};
		for(int i = 0; i <=2; i++)
		{
			alle[i] = Integer.parseInt(showInputDialog(i));
		}
		if (alle[0] > alle[1])
		{
			tmp = alle[1];
			alle[1] = alle[0];
			alle[0] = tmp;
		}
	
		return alle;
	}
	
}
