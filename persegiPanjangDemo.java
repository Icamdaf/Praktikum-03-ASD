import java.util.Scanner;

public class persegiPanjangDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah persegi panjang: ");
        int jumlahPersegi = sc.nextInt();
        
        persegiPanjang[] arrayOfpersegiPanjang = new persegiPanjang[jumlahPersegi];

        for (int i = 0; i < jumlahPersegi; i++) {
            System.out.println("Persegi panjang ke-" + (i + 1));
            System.out.print("Masukkan panjang: ");
            int panjang = sc.nextInt();
            System.out.print("Masukkan lebar: ");
            int lebar = sc.nextInt();
            arrayOfpersegiPanjang[i] = new persegiPanjang(panjang, lebar);
        }

        for (int i = 0; i < jumlahPersegi; i++) {
            arrayOfpersegiPanjang[i].cetakInfo();
            System.out.println("Luas: " + arrayOfpersegiPanjang[i].hitungLuas());
            System.out.println("Keliling: " + arrayOfpersegiPanjang[i].hitungKeliling());
        }
    }
}