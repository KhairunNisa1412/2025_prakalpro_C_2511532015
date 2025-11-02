package pekan5_2511532015;

public class TugasAlproPekan5_2511532015 {

	public static void main(String[] args) {
	System.out.print("#");
	for (int i=1; i<=16; i++) {
		System.out.print("=");
		}
		System.out.print ("#");
		for (int spasitengah=1; spasitengah<=20; spasitengah++) {
			System.out.print(" ");
		}
		System.out.print ("#");
		for (int i=1; i<=16; i++) {
			System.out.print("=");
			}
			System.out.print ("#");
		System.out.println();
		
		//bagian atas
        for (int simbol = 1; simbol <= 4; simbol++) {
            System.out.print("|");
            for (int spasi = 0; spasi < (-2 * simbol + 8); spasi++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int i = 0; i <  4 * (simbol - 1); i++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spasi = 0; spasi < (-2 * simbol + 8); spasi++) {
                System.out.print(" ");
            }
            System.out.print("|");

            // Spasi tengah
            for (int spasitengah = 1; spasitengah<=20; spasitengah++) {
                System.out.print(" ");
            }

            //Duplikat bagian atas
            System.out.print("|");
            for (int spasi = 0; spasi < (-2 * simbol + 8); spasi++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int i = 0; i < 4 * (simbol - 1); i++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spasi = 0; spasi < (-2 * simbol + 8); spasi++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }

        //Bagian bawah
        for (int simbol = 1; simbol <= 4; simbol++) {
            System.out.print("|");
            for (int spasi = 0; spasi < (2 * simbol - 2); spasi++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int i = 0; i < 16 - (4 * simbol); i++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spasi = 0; spasi < (2 * simbol - 2); spasi++) {
                System.out.print(" ");
            }
            System.out.print("|");

            // Spasi tengah
            for (int spasitengah = 1; spasitengah<=20; spasitengah++) {
                System.out.print(" ");
            }

            //duplikat bagian bawah
            System.out.print("|");
            for (int spasi = 0; spasi < (2 * simbol - 2); spasi++) {
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int i = 0; i < 16 - (4 * simbol); i++) {
                System.out.print(".");
            }
            System.out.print("<>");
            for (int spasi = 0; spasi < (2 * simbol - 2); spasi++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.print("#");
    	for (int i=1; i<=16; i++) {
    		System.out.print("=");
    		}
    		System.out.print ("#");
    		for (int spasitengah=1; spasitengah<=20; spasitengah++) {
    			System.out.print(" ");
    		}
    		System.out.print ("#");
    		for (int i=1; i<=16; i++) {
    			System.out.print("=");
    			}
    			System.out.print ("#");
    		System.out.println();
		
	}

}
