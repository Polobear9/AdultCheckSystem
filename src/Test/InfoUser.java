package Test;

import java.util.Scanner;

/**
 * Set a user info when make instance.
 */
public class InfoUser {
    Scanner sc = new Scanner(System.in);
    private static String name;
    private static int age;
    private static String birthday;

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

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getBirthday() {
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
