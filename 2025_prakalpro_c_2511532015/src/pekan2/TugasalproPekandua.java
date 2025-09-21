package pekan2;

public class TugasalproPekandua {

	public static void main(String[] args) {
		//Input Data
		int jumlahPertemuan = 8;
		int jumlahHadir = 5;
		char simbol = '%';
						
		//Hitung Persentase
		float hasilPersentase = ((float) jumlahHadir/jumlahPertemuan)*100;
						
		//Penentuan Status (Minimal 75% untuk memenuhi syarat mengikuti ujian)
		boolean statusPemenuhan = hasilPersentase >= 75; 
						
		//Penampilan hasi
		System.out.println ("Jumlah Pertemuan: "+ jumlahPertemuan);
		System.out.println ("Jumlah Hadir: "+ jumlahHadir);
		System.out.println ("Persentase Kehadiran: "+ hasilPersentase + simbol);
		System.out.println ("Status: "+ (statusPemenuhan? "Memenuhi" : "Tidak memenuhi"));

	}

}
