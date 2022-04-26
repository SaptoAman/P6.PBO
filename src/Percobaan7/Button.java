package Percobaan7;

public class Button {
    //Membuat variabel
    private Clickable action;

    //Membuat method
    void setClickAction (Clickable action) {
        this.action = action;
    }

    void doClick () {
        action.onClick();
    }
}
