//Membuat OuterClass
class OuterCLass {
    //Membuat Variabel
    int x = 10;
    private final int myAdd = 12;

    //Membuat innerClass
    class InnerClass {
        int y = 5 + myAdd;
    }
}

public class Percobaan5 {
    public static void main(String[] args) {
        //Membuat objek
        OuterCLass myOuter = new OuterCLass();
        OuterCLass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
