package lv.acodemy.homework;

public class FirstHomeWork {
    public static void main(String[] args) {

        //String my name and surname
        String name = "Nikita";
        String surname = "Jevdokimovs";
        String fullName = name + " " + surname;

        //byte data type
        byte myCurrentAge = 29;

        System.out.printf("My full name is: %s. I am %d years old.\n", fullName, myCurrentAge);

        String myAdress = "Rīga, Brāļu Kaudzīšu iela";
        byte houseNumber = 8;
        String fullAdress = myAdress + " " + houseNumber;

        System.out.printf("My adress is: %s %d", myAdress, houseNumber);

    }
}
