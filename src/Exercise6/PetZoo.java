package Exercise6;

public class PetZoo {
    public static void main(String[] args) {
        Pet hippo = new Pet("Jim");
        Pet giraffe = new Pet("Mia");
        Pet eagle = new Pet("Raven");

        hippo.PrintPet();
        giraffe.PrintPet();
        eagle.PrintPet();

        System.out.println("New Method Test");

        String hippoName = hippo.getName();
        String giraffeName = giraffe.getName();
        String eagleName = eagle.getName();

        for (int i =0;i<3;i++){
            System.out.println(hippoName);
        }
    }
}
