package pekan4;
import java.util.Scanner; 
public class tugasAlproPekan4_2511532015 {

	public static void main(String[] args) {
		String nama;
		int jumlahTiket;
		int hari;
		int waktuTayang;
		int jenisStudio;
		Scanner i= new Scanner (System.in);
		System.out.print("Nama Pembeli: ");
		nama = i.nextLine();
		System.out.print("Jumlah Tiket: ");
		jumlahTiket = i.nextInt ();
		System.out.print("Hari: ");
		hari = i.nextInt ();
		System.out.print("Waktu Tayang: ");
		waktuTayang = i.nextInt ();
		System.out.print("Jenis Studio: ");
		jenisStudio = i.nextInt ();
		i.close ();
		
		System.out.println ("\n");
		System.out.println ("======= PEMBELIAN TIKET BIOSKOP ======");
		System.out.println ("Nama            : "+ nama);
		System.out.println ("Jumlah Tiket    : "+ jumlahTiket);
		
		 if (hari < 1 || hari > 3) {
			 System.out.println ("Input Tidak Valid");
			 return;
		        }
		
		switch (hari) {
		case 1:
			System.out.println ("Hari            : Senin-Kamis");
;			break;
		case 2:
			System.out.println ("Hari            : Jumat");
			break;
		case 3:
			System.out.println ("Hari            : Sabtu-Minggu");
			break;
		}
		
		 if (waktuTayang < 1 || waktuTayang > 3) {
			 System.out.println ("Input Tidak Valid");
			 return;
		        }
		 
		switch (waktuTayang) {
		case 1:
			System.out.println ("Waktu Tayang    : Pagi 10.00-12.00");
			break;
		case 2:
			System.out.println ("Waktu Tayang    : Siang 12.00-17.00");
			break;
		case 3:
			System.out.println ("Waktu Tayang    : Malam 17.00-22.00");
			break;
		}
		 if (jenisStudio < 1 || jenisStudio > 3) {
			 System.out.println ("Input Tidak Valid");
			 return;
		        }
		
		switch (jenisStudio) {
		case 1:
			System.out.println ("Jenis Studio    : Regular");
			break;
		case 2:
			System.out.println ("Jenis Studio    : Deluxe");
			break;
		case 3:
			System.out.println ("Jenis Studio    : Premium");
			break;
		}
		
		int hargaDasar = 50000;
		double biayaHari = 0.30;
		double biayaWaktu = 0.20;
		double diskon = 0.20;
		
		//Hitung harga per tiket
		double hargaperTiket = hargaDasar + ((biayaHari + biayaWaktu) * hargaDasar);
		double subTotal = hargaperTiket * jumlahTiket;
		double diskonNominal = subTotal * diskon;
		double totalBayar = subTotal - diskonNominal;
		
		System.out.println ("\n");
		System.out.println ("-------------------------");
		System.out.println ("Harga Dasar        : Rp" + hargaDasar);
		System.out.println ("Biaya Hari         : "+ "+" +(int)(biayaHari*100) + "%");
		System.out.println ("Biaya Waktu        : "+ "+" +(int)(biayaWaktu*100) + "%");
		System.out.println ("Harga Per Tiket    : Rp" + Math.round(hargaperTiket));
		System.out.println ("Subtotal           : Rp" + Math.round( subTotal));
		System.out.println ("Diskon             : Rp" + Math.round(diskonNominal));
		System.out.println ("-------------------------");
		System.out.println ("TOTAL BAYAR        : Rp" + Math.round(totalBayar));
		
		
	}

}
