package Percobaan3;

public class Employee implements Person{
    String firstName;
    String lastName;
    String posisi = "Programmer";

    public Employee () {
        this.firstName = FIRSTNAME;
        this.lastName =  LASTNAME;
    }

    public Employee (String firstName, String lastName, String posisi) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.posisi = posisi;
    }

    public void displayInfo () {
        System.out.println("Nama    : " +firstName+ " " +lastName);
        System.out.println("Posisis : " +posisi);
    }

    public void displayDefault () {
        System.out.println("Nama Dari Interface : " +getName());
    }
}
