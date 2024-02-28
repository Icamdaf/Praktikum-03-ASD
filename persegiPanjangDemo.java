/**
 * persegiPanjangDemo
 */
public class persegiPanjangDemo {
    public int panjang;
    public int lebar;
    public static void main(String[] args) {
        persegiPanjang[] arrayOfpersegiPanjang = new persegiPanjang[3];

        arrayOfpersegiPanjang[0] = new persegiPanjang();
        arrayOfpersegiPanjang[0].panjang = 110;
        arrayOfpersegiPanjang[0].lebar = 30;

        arrayOfpersegiPanjang[1] = new persegiPanjang();
        arrayOfpersegiPanjang[1].panjang = 80;
        arrayOfpersegiPanjang[1].lebar = 40;

        arrayOfpersegiPanjang[2] = new persegiPanjang();
        arrayOfpersegiPanjang[2].panjang = 100;
        arrayOfpersegiPanjang[2].lebar = 20;

        System.out.println("persegi panjang ke 1, panjang =" +arrayOfpersegiPanjang[0].panjang + ",lebar =" +arrayOfpersegiPanjang[0].lebar);
        System.out.println("persegi panjang ke 2, panjang =" +arrayOfpersegiPanjang[1].panjang + ",lebar =" +arrayOfpersegiPanjang[1].lebar); 
        System.out.println("persegi panjang ke 3, panjang =" +arrayOfpersegiPanjang[2].panjang + ",lebar =" +arrayOfpersegiPanjang[2].lebar);

    }
}