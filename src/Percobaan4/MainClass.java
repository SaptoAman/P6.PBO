package Percobaan4;

public class MainClass implements FirstInterface, SecondInterface {
    @Override
    public void printHello () {
        System.out.println("Nilai Konstantan NUMBER di FirstInterface = " +FirstInterface.NUMBER);
        System.out.println("Nilai Konstanta NUMBER di SecondInterface = " +SecondInterface.NUMBER);
    }

    @Override
    public int doubleNumberA () {
        return FirstInterface.NUMBER * 2;
    }

    @Override
    public int doubleNumberB () {
        return SecondInterface.NUMBER * 2;
    }
}
