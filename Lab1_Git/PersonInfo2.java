public class PersonInfo2 {

    public static String firstName = "Elie";
    public static String lastName = "Arja";
    public static int studentNo = 60782;
    public static String description = "J'aime le soccer. Real Madrid are the best";

    public static void displayFr() {
        String out = SIConstants.GREETING_FR;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_FR + studentNo + '.';
        out += SIConstants.DESCRIPTION_FR + description + '.';
        out += SIConstants.EOL;

        System.out.println(out);
    }


    public static void displayEn() {
        String out = SIConstants.GREETING_EN;
        out += " " + firstName + " " + lastName + '.';
        out += SIConstants.STUDENT_NUMBER_EN + studentNo + '.';
        out += SIConstants.DESCRIPTION_EN + description + '.';
        out += SIConstants.EOL;

        System.out.println(out);
    }
}
