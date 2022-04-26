package Percobaan1;

public class TestBangunDatar {
    public static void main(String[] args) {
        //Membuat objek persegi dan mengisi nilai properti
        Persegi persegi = new Persegi();
        persegi.setSisi(2);
        persegi.setColor("Biru");

        //Membuat objek lingkaran dan mengisi nilai properti
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(22);
        lingkaran.setColor("Merah");

        //Membuat objek persegi panjang dan mengisi nilai properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(8);
        persegiPanjang.setLebar(4);
        persegiPanjang.setColor("Kuning");

        //Membuat objek segitiga dan mengisi nilai properti
        Segitiga mSegitiga = new Segitiga();
        mSegitiga.setAlas(6);
        mSegitiga.setTinggi(4);
        mSegitiga.setColor("Hijau");

        //Menampilkan hasil
        persegi.greeting();
        persegi.luas();
        persegi.keliling();
        System.out.println();

        lingkaran.luas();
        lingkaran.keliling();
        System.out.println();

        persegiPanjang.luas();
        persegiPanjang.keliling();
        System.out.println();

        mSegitiga.luas();
        mSegitiga.keliling();
    }
}
