import java.util.Scanner;
/**
 * SiakadFor05
 */
public class SiakadFor05 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidak = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input05.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            } if (nilai >= 60) {
                lulus++;
            } else {
                tidak++;
            }
            
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + lulus);
        System.out.println("Jumlah mahasiswa yang tidak lulus: " + tidak);
    }
}