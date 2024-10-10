    import java.util.Scanner;
    public class Tugas205 {
        public static void main(String[] args) {
            Scanner input05 = new Scanner(System.in);

            int jenis, durasi = 0, total = 0;

            
            do {
                System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
                jenis = input05.nextInt();
                if (jenis == 1 || jenis == 2) {
                    System.out.print("Masukkan jumlah durasi(jam): ");
                    durasi = input05.nextInt();
                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                    total += durasi * 3000;
                } 
                else if (jenis == 2) {
                    total += durasi * 2000;
                }
                }
                } 
            } while (jenis != 0);
            System.out.println("Total tarif parkir: " + total);
        }
    }