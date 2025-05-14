package pl.pp;

public class Person {
    public String forename;
    public String surname;
    public int age;
    public String address;
    public int year_of_birth;

    public Person() {}

    public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }

    public void hiToAll() {
        System.out.println("My name is " + forename + " " + surname +
                ". I am " + age + " years old." +
                (address != null ? " I live at " + address + "." : "") +
                (year_of_birth > 0 ? " I was born in " + year_of_birth + "." : ""));
    }

    public int growOld(int years) {
        age += years;
        return age;
    }

    public int beYounger() {
        age -= 1;
        return age;
    }

    public String getName() {
        return forename;
    }

    public void setName(String nameToSet) {
        forename = nameToSet;
    }
}
