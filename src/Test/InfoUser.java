package Test;

import java.util.Scanner;

/**
 * Set a user info when make instance.
 */
public class InfoUser {
    Scanner sc = new Scanner(System.in);
    private  String name;
    private  int age;
    private  String birthday;

    InfoUser() {
        System.out.println("Please enter the your name ");
        String user_Name = sc.nextLine();
        this.setName(user_Name);
        System.out.println("Please enter the your age ");
        int user_Age = sc.nextInt();
        this.setAge(user_Age);
        System.out.println("Please enter the your birthday ");
        int user_Birthday = sc.nextInt();
        this.setBirthday(user_Birthday);
    }

    public String getName() {
        return name;
    }

    public void setName(String names) {
        this.name = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ages) {
        this.age = ages;
    }

    public  String getBirthday() {
        return birthday;
    }

    public  void setBirthday(String birthdays) {
        this.birthday = birthdays;
    }

    //Check the input length to birthday if 8 under or over say Try Again.
    public void setBirthday(int birthday) {
        String ChangeBirthday = String.valueOf(birthday);
        if (ChangeBirthday.length() == 8) {
            this.setBirthday(ChangeBirthday);
        } else {
            System.out.println("Try Again");
        }
    }


}
