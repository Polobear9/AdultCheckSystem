package Test;

/**
 * Set a user info when make instance.
 */
public class InfoUser {
    private String name;
    private int age;
    private String birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }


    //Check the input length to birthday if 8 under or over say Try Again.
    public void setBirthday(int birthday) {
        String ChangeBirthday = String.valueOf(birthday);
        if (ChangeBirthday.length() == 8) {
            this.birthday = ChangeBirthday;
        } else if (ChangeBirthday.length() < 8 || ChangeBirthday.length() > 8) {
            System.out.println("Try Again");
        }
    }


}
