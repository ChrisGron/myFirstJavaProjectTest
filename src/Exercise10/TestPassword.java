package Exercise10;

public class TestPassword {

    public boolean check(String password) {

        boolean isDigit = false;
        boolean isLenght = false;
        boolean hasSpecialChar = false;
        if (password.length()>= 8) {
            isLenght = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                isDigit = true;

            }
            if(!Character.isLetterOrDigit(c)){
                hasSpecialChar = true;
            }
        }


        return isLenght && isDigit && hasSpecialChar;
    }
}
