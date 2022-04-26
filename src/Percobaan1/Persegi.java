package Percobaan1;

public class Persegi extends BangunDatar{
    //Membuat variabel
    private double sisi;

    //Membuat method
    public void setSisi (double sisi) {
        this.sisi = sisi;
    }
    public double getSisi () {
        return sisi;
    }

    @Override
    public double luas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi : " +luas);
        return luas;
    }

    @Override
    public double keliling() {
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi : " +keliling);
        return keliling;
    }
}
