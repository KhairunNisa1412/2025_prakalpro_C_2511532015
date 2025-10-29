package pekan4;
import java.util.Scanner;
public class TugasAlproPekn4_2511532015 {

	public static void main(String[] args) {
		String nama;
		double beratPaket;
		int jarakPengirim;
		int jenisLayanan;
		int jenisPaket;
		
		Scanner i= new Scanner (System.in);
		System.out.print("Namma Pengirim: ");
		nama = i.nextLine();
		System.out.print("Berat Paket: ");
		beratPaket = i.nextDouble ();
		System.out.print("Jarak Pengirim: ");
		jarakPengirim = i.nextInt ();
		System.out.print("Jenis Layanan: ");
		jenisLayanan = i.nextInt ();
		System.out.print("Jenis Paket: ");
		jenisPaket = i.nextInt ();
		i.close ();
		
		System.out.println ("\n");
		System.out.println ("======= BIAYA PENGIRIMAN PAKET ======");
		System.out.println ("Nama Pengirim: "+ nama);
		System.out.println ("Berat Paket: "+ beratPaket + "Kg");
		System.out.println ("Jarak Pengirim: "+ jarakPengirim + "Km");
		
		if (jenisLayanan <1 || jenisLayanan >3) {
			System.out.println ("Data Tidak Valid");
			return;
		}
		switch (jenisLayanan) {
		case 1:
			System.out.println ("Jenis Layanan: Reguler");
			break;
		case 2:
			System.out.println ("Jenis Layanan: Express");
			break;
		case 3:
			System.out.println ("Jenis Layanan: Same Day");
			break;
		}
		
		if (jenisPaket <1 || jenisPaket >3) {
			System.out.println ("Data Tidak Valid");
			return;
		}
		switch (jenisPaket) {
		case 1: 
			System.out.println ("Jenis Paket: Dokumen");
			break;
		case 2: 
			System.out.println ("Jenis Paket: Barang Biasa");
			break;
		case 3:
			System.out.println ("Jenis Paket: Barang Elektronik");
			break;
		}
		int biayaDasar = 22500;
		int biayaJarak = 600;
		int subTotal;
		double biayaLayanan = 0.50;
		int biayaJenisPaket;
		
	}

}
