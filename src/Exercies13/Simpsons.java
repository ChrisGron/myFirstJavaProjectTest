package Exercies13;

import java.util.HashMap;
import java.util.Scanner;

public class Simpsons {
    public static void main(String[] args) {
        HashMap<String, String> simpsons = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String name = "";
        simpsons.put("Homer","D'oh!");
        simpsons.put("Marge","Mmm~mmmm");
        simpsons.put("Bart","Ay, caramba!");
        simpsons.put("Lisa","If anyone want me, I'll be in my room");
        simpsons.put("Maggie","Pacifier Suck");
        simpsons.put("Ned","Hi-Diddly-Ho!");
        simpsons.put("Burns","Excellent!");
        simpsons.put("Edna","Ha!");
        simpsons.put("Chalmers","SEEEYYYMOOUUURRR!");
        simpsons.put("Apu","Tank You, Come Again!");
        simpsons.put("Stu","Disco Stu Likes disco music");

        while (!name.equals("exit")) {
            name = scan.nextLine();
            System.out.println(simpsons.get(name));
        }
    }
}
