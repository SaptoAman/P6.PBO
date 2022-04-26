//Membuat outer class
class MyOuterClassDemo {
    //Membuat variabel
    private final int x = 1;

    //instansi method dari outer class
    public void doThings () {
        final String name = "Variabel Local";

        //inner class didefinisikan di dalam method dari outer class
        class MyInnerClassDemo {
            //membuat method
            public void seeOuter() {
                System.out.println("Nilai Outer Dari X = " +x);
                System.out.println("Nilai Dari Nama = " +name);
            }
        }
        //Mengakses inner class
        MyInnerClassDemo inner = new MyInnerClassDemo();
        inner.seeOuter();
    }
}

public class Percobaan6 {
    public static void main(String[] args) {
        //Membuat objek
        MyOuterClassDemo myOuter = new MyOuterClassDemo();
        myOuter.doThings();
    }
}
