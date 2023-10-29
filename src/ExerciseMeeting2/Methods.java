package ExerciseMeeting2;

public class Methods {
    public String personalNumberCheck(String[] persNumber){

        boolean found = false;

        for(String num : persNumber){
            if(num.matches("-")){
                found = true;

                break;
            }
        }
        return found ? "Personal number is okey!" : "Personal number is invalid!";
    }
    public String oddOrEven(String[] perNumber){
        boolean even = false;
        int oddEven = Integer.parseInt(perNumber[11]);
        if(oddEven % 2 == 0) {
            even = true;
        }

        return even ? oddEven + " Number is even" : oddEven + " Number is odd";
    }
    public void checkOddEven(String[] persNumber){
        for (int i = 0; i < persNumber.length; i++){
            char secondToLast = persNumber[i].charAt(persNumber[i].length() -2);
            int secondToLastInt = Character.getNumericValue(secondToLast);

            if(secondToLastInt % 2 == 0){
                System.out.println("Second to last number is: Even");
            }else{
                System.out.println("Second to last number is: Odd");
            }
        }
    }
}
