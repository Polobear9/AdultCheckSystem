package Test;

/**
 * maybe can be make auto, use a Scanner API.
 * more simple and more comfortable.
 */
public class AreYouAdult {
    public static void main(String[] args) {
        InfoUser user1 = new InfoUser();
        CheckTheAdult cha = new CheckTheAdult();
        user1.setName("Lee");
        user1.setBirthday(19960510);
        cha.Check(user1);
    }
}
