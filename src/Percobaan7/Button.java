package Percobaan7;

public class Button {
    private Clickable action;

    public void setClickAction(Clickable action) {
        this.action = action;
    }

    public void doClick() {
        action.onClick();
    }
}
