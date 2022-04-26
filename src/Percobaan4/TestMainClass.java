package Percobaan4;

public class TestMainClass {
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.printHello();
        System.out.println("Nilai Dobel Dari NUMBER Pada FirstInterface = " +mainClass.doubleNumberA());
        System.out.println("Nilai Dobel Dari NUMBER Pada SecondInterface = " +mainClass.doubleNumberB());
    }
}
