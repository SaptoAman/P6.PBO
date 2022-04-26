package Percobaan7;

public class TestButton {
    public static void main(String[] args) {
        //Membuat objek
        Button btn = new Button();

        //Membuat class anonymous untuk implementasi interface
        btn.setClickAction(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol Sudah Diklik");
                System.out.println("Ya");
            }
        });

        //Mencoba klik tombol
        btn.doClick();
    }
}
