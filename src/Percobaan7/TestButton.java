package Percobaan7;

public class TestButton {
    public static void main(String[] args) {
        Button btn = new Button();

        btn.setClickAction(new Clickable() {
            @Override
            public void onClick() {
                System.out.println("Tombol Sudah Diklik");
                System.out.println("Ya");
            }
        });

        btn.doClick();
    }
}
