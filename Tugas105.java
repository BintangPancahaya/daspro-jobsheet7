import java.util.Scanner;
public class Tugas105 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        double totalHarga = 0, hargaTiket = 50000;
        int i = 0, hari, tiket = 0;

        System.out.print("Masukkan jumlah hari: ");
        hari = input05.nextInt();

        while (i < hari) {
            System.out.print("Masukkan jumlah tiket yang dipesan hari ke-" + (i + 1) + ": ");
            tiket = input05.nextInt();

            if (tiket < 0) {
                System.out.println("Tiket yang dimasukkan salah (negatif), Masukkan tiket lagi!");
                continue;
            } if (tiket > 4 && tiket < 10) {
                totalHarga = hargaTiket - (hargaTiket * 0.1);
            } else if (tiket > 10) {
                totalHarga = hargaTiket - (hargaTiket * 0.15);
            } else {
                totalHarga = hargaTiket;
            }
            System.out.println("Total tiket yang terjual: " + tiket);
            System.out.println("Total harga tiket: " + totalHarga);
            i++;
        } input05.close();
    }
}
