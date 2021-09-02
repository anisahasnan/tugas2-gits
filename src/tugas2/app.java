package tugas2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        System.out.print("Selamat Datang di Warung Bu Ijah!\n" +
                "Berikut list barang-barang yang dijual di warung:\n" +
                "- Beras\n" +
                "- Minyak\n" +
                "- Gula\n" +
                "- Kopi\n" +
                "Kamu mau beli apa?\n");
        Scanner scanner_barang = new Scanner(System.in);

        String barang = scanner_barang.nextLine().toLowerCase();

        if(barang.equals("beras") || barang.equals("minyak") || barang.equals("gula") || barang.equals("kopi") ){
            System.out.println("Oke, jadi kamu mau beli " + barang);

            System.out.println("Kamu bawa uang berapa? Tulis dalam angka ya (cth: 50000)");
            Scanner scanner_uang = new Scanner(System.in);

            try{
                Long uang = scanner_uang.nextLong();
                int harga = 0;
                switch (barang){
                    case "beras":
                        harga = 50000;
                        break;
                    case "minyak":
                        harga = 25000;
                        break;
                    case "gula":
                        harga = 8000;
                        break;
                    case "kopi":
                        harga = 10000;
                        break;
                }
                if(uang < harga){
                    System.out.println("Maaf, uangmu tidak cukup");
                }
                else{
                    uang -= harga;
                    System.out.println("Ini " + barang + "-nya. Terima kasih sudah berbelanja di Warung Bu Ijah");
                }
            }
            catch (Exception e){
                System.out.println("Maaf, jumlah uang yang kamu masukkan tidak dapat dibaca");
            }
        }
        else{
            System.out.println("Maaf, Warung Bu Ijah gak jual " + barang);
        }
    }
}
