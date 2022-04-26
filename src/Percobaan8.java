import Percobaan7.Button;
import Percobaan7.Clickable;

public class Percobaan8 {
    //Membuat variabel di dalam inner class
    static String title = "Tutorial Anonymous Class";

    public static void main(String[] args) {
        //Membuat variabel di dalam method main
        String name = "Rekayasa Perangkat Lunak";
        Button btn = new Button();

        //Membuat class anonymous untuk implementasi interface
        btn.setClickAction(new Clickable() {
            //Membuat variabel di dalam class anonymous
            String message = "Belajar Anonymous Class Di Java";
            @Override
            public void onClick() {
                System.out.println("Tombol Sudah Di Klik");
                System.out.println("Yay!");
                //Mengakses variabel
                System.out.println("Hello " +name);
                System.out.println(title);
                System.out.println(message);
            }
        });
        //Mencoba klik tombol
        btn.doClick();
    }
}
