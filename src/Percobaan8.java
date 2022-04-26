import Percobaan7.Button;
import Percobaan7.Clickable;

public class Percobaan8{
    static String title = "Tutorial Anonymous Class";

    public static void main(String[] args) {
        String name = "Rekayasa Perangkat Lunak";
        Button btn = new Button();

        btn.setClickAction(new Clickable() {
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
        btn.doClick();
    }
}
