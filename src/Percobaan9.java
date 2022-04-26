import java.security.PublicKey;

//Membuat outer class
class Outer {
    //Membuat variabel
    int Myvar = 21;
    static int staticVar = 90;

    //Membuat static nested class
    static class Nested {
        //Membuat method
        void printHello() {
            System.out.println("Hello Static Nested Class");
            System.out.println("staticVar = " +staticVar);
        }
    }
}

public class Percobaan9 {
    public static void main(String[] args) {
        //Menggunakan kedua class untuk membuat objek
        Outer.Nested staticClass = new Outer.Nested();
        staticClass.printHello();

        Outer outer = new Outer();
        System.out.println("myVar = " +outer.Myvar);
    }
}
