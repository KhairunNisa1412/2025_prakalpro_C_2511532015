package pekan3;
import java.util.Scanner ;
public class hitungvolume {

	public static void main(String[] args) {
		System.out.println ("== Volume Limas Segitiga ==");
		int a;
		int t;
		int ts;
		double hasil;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Masukkan alas segitiga: ");
		a = keyboard.nextInt ();
		System.out.print("Masukkan tinggi segitiga: ");
		ts = keyboard.nextInt ();
		System.out.print("Masukkan tinggi limas: ");
		t = keyboard.nextInt ();
		keyboard.close();
		
		double L_Alas = 1.0/2.0 * a * ts; //hitung luas alas
		hasil = 1.0/3.0 * L_Alas * t; 
		System.out.println ("Volume limas segitiga: "+ hasil);

		

	}

}
