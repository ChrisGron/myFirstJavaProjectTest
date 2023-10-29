package Inlamningsuppgift1;

public class TestInput {


    public boolean check(String input) {
        boolean inputCheck = false;


        for (int i = 0; i < input.length(); i++) {
            char ch = input.toLowerCase().charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                inputCheck = true;
            }else {
                inputCheck = false;
                break;
            }
        }
        if (input.contains("*") || (input.contains("-"))) {
                   inputCheck = true;
        }


     //   if (input.contains("a-z")) { //Need to fix
     //       inputCheck = true;
     //   } else if (input.contains("*") || (input.contains("-"))) {
     //       inputCheck = true;
     //   }

        return inputCheck;


    }

    public boolean checkSpace(String input) {
        boolean haveSpace = false;

        if (input.contains(" ")) {
            haveSpace = true;
        }


        return haveSpace;

    }

    public boolean checkEmpty(String input) {
        boolean inputCheck = false;
        if (!input.isEmpty()) {
            inputCheck = true;
        }
        return inputCheck;
    }

    public boolean checkSpaceBetween(String input) {
        boolean inputCheck = false;
        if (Character.isLetter(input.charAt(0)) && Character.isLetter(input.charAt(input.length() - 1))) {
            inputCheck = true;
        }
        return inputCheck;
    }
}
