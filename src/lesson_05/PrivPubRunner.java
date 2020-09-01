package lesson_05;

public class PrivPubRunner {
    public static void main(String[] args) {

        UserAuthentification user = new UserAuthentification();
        System.out.println(user);

        user.pubPass = "vasya-loh";
        user.pubName = "vasya-loh";

        System.out.println(user);

        user.setPrivPass("normalPassword");

        System.out.println(user);

        
    }
}
