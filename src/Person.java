package pl.pp;

public class Person {


    public String forename;
    public String surname;
    public int age;
    public String address;
    public int year_of_birth;


    public Person() {
        // fields remain uninitialized (default values)
    }


    public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }

    // Method to print details
    public void hiToAll() {
        System.out.println("My name is " + forename + " " + surname +
                ". I am " + age + " years old." +
                (address != null ? " I live at " + address + "." : "") +
                (year_of_birth > 0 ? " I was born in " + year_of_birth + "." : ""));
    }

    // Modified growOld method - takes an argument to increase age
    public int growOld(int years) {
        age += years;
        return age;
    }

    // New method - decreases age by 1
    public int beYounger() {
        age -= 1;
        return age;
    }

    // Getter for forename
    public String getName() {
        return forename;
    }

    // Setter for forename
    public void setName(String nameToSet) {
        forename = nameToSet;
    }
}
