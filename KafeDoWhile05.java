import java.util.Scanner;
public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        int kopi, teh, roti, totalHarga, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = input05.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = input05.nextInt();
            System.out.print("Jumlah teh: ");
            teh = input05.nextInt();
            System.out.print("Jumlah roti: ");
            roti = input05.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            input05.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
    }
}
