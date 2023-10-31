import java.util.Scanner;

public class LaporanPendapatan {
    public static void main(String[] args) {
      
        int[][] penjualan = new int[3][2];
        int totalPenjualan = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Masukkan jumlah penjualan barang ke-" + (i + 1) + ", jenis-" + (j + 1) + ": ");
                penjualan[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < penjualan.length; i++) {
            for (int j = 0; j < penjualan[i].length; j++) {
                totalPenjualan += penjualan[i][j];
            }
        }

        System.out.println("=== Laporan Pendapatan Harian ===");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Jenis Barang ke-" + (i + 1));
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.println("Jumlah penjualan: " + penjualan[i][j]);
            }
        }
        System.out.println("Total pendapatan: " + totalPenjualan);
    }
}
