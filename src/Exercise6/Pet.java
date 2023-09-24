package Exercise6;

public class Pet {
    private String name; // attribut

    public Pet(String petName) {// Konstruktor
        name = petName;
    }

    public void PrintPet(){
        System.out.println(name);
    }

    public String getName (){
        return name;
    }
}
