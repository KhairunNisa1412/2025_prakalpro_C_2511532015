package pekan3;
import java.util.Scanner;
public class UpahKaryawan {

	public static void main(String[] args) {
		String nama;
		char golongan;
		int jamKerja;
		int upahperJam = 0;
		int upahDasar;
		int bonus = 0;
		int totalUpah;
		Scanner keyboard = new Scanner (System.in);
		System.out.print ("Nama Karyawan: ");
		nama = keyboard.nextLine();
		System.out.print("Golongan: ");
		golongan = keyboard.next().charAt (0);
		System.out.print("Jumlah Jam Kerja: ");
		jamKerja = keyboard.nextInt ();
		keyboard.close ();
		
		if (golongan == 'A') {
			upahperJam = 1000;
		} else if (golongan == 'B') {
			upahperJam = 2000;
		} else if (golongan == 'C') {
			upahperJam = 3000;
		} else if (golongan == 'D') {
			upahperJam = 4000;
		}
		upahDasar = jamKerja * upahperJam;
		 
		if (jamKerja > 60 ) {
			bonus = (jamKerja - 60) * 5000;
		}
		totalUpah = upahDasar + bonus;

		System.out.println ("== Upah Mingguan Karyawan ==");
		System.out.println ("Nama Karyawan: " + nama);
		System.out.println ("Total upah: Rp" + totalUpah);
	}

}
