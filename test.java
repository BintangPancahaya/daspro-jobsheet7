import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, durasi, total = 0;
        final int tarifMobil = 3000;
        final int tarifMotor = 2000;
        final int tarifMaksimal = 12500;

        do {
            // Meminta input jenis kendaraan
            System.out.print("Masukkan jenis kendaraan (1 Mobil, 2 Motor, 0 Keluar): ");
            jenis = input.nextInt();

            // Jika jenis kendaraan 1 (Mobil) atau 2 (Motor), lanjutkan
            if (jenis == 1 || jenis == 2) {
                // Meminta input durasi parkir
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = input.nextInt();

                // Jika durasi lebih dari 5 jam, tarif flat Rp 12.500
                if (durasi > 5) {
                    total += tarifMaksimal;
                } else {
                    // Jika jenis mobil (1), tarif Rp 3.000 per jam
                    if (jenis == 1) {
                        total += durasi * tarifMobil;
                    }
                    // Jika jenis motor (2), tarif Rp 2.000 per jam
                    else if (jenis == 2) {
                        total += durasi * tarifMotor;
                    }
                }
            }

        } while (jenis != 0); // Berhenti jika input jenis kendaraan adalah 0 (keluar)

        // Output total pembayaran parkir
        System.out.println("Total yang harus dibayar: Rp " + total);
    }
}