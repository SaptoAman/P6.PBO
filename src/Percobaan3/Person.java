package Percobaan3;

public interface Person extends Named {
    String FIRSTNAME = "Budi";
    String LASTNAME  = "Gunawan";

    @Override
    public default String getName () {
        return FIRSTNAME+ " " +LASTNAME;
    }
}
