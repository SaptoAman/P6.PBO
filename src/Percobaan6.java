class MyOuterClassDemo {
    private final int x = 1;

    public void doThings () {
        final String name = "Variabel Local";

        class MyInnerClassDemo {
            public void seeOuter() {
                System.out.println("Nilai Outer Dari X = " +x);
                System.out.println("Nilai Dari Nama = " +name);
            }
        }
        MyInnerClassDemo inner = new MyInnerClassDemo();
        inner.seeOuter();
    }
}

public class Percobaan6{
    public static void main(String[] args) {
        MyOuterClassDemo myOuter = new MyOuterClassDemo();
        myOuter.doThings();
    }
}
