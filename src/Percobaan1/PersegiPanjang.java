package Percobaan1;

public class PersegiPanjang extends BangunDatar{
    //Membuat variabel
    private double panjang;
    private double lebar;

    //Membuat method
    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar () {
        return lebar;
    }

    public void setLebar (double lebar) {
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " +luas);
        return luas;
    }

    @Override
    public double keliling () {
        double keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang : " +keliling);
        return keliling;
    }
}
