package ExerciseMeeting1;

public class User {

    private String userName;
    private String passWord;

    public User(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void updateUserName(String updatedName) {

        if (updatedName.length() >= 4 && updatedName.length() <=10) {
            userName = updatedName;
        }
    }
}