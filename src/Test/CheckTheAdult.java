package Test;

import java.time.LocalDateTime;

public class CheckTheAdult {

    private static String Adult;

    public String getAdult() {
        return Adult;
    }

    public void setAdult(String adults) {
        Adult = adults;
    }

    CheckTheAdult() {
        InfoUser user = new InfoUser();
        //it is change the type userBirth int - > String
//		String userBirth = String.valueOf(user.getBirthday());
        //userBirth 0~4 = Year / 4~6 = Month / 6~8 = Day
        if (user.getBirthday() != null) {
            String userYear = user.getBirthday().substring(0, 4);
            String userMonth = user.getBirthday().substring(4, 6);
            String userDay = user.getBirthday().substring(6, 8);
            int theUserYear = Integer.parseInt(userYear);
            int theUserMonth = Integer.parseInt(userMonth);
            int theUserDay = Integer.parseInt(userDay);
            int yearAge = LocalDateTime.now().getYear() - theUserYear;
            //Change the Birth Info type to int from String
            //Check the Age, user is Adult? or Not.
            if (yearAge >= 20) {
                if (yearAge == 20) {
                    int CheckMonth = theUserMonth - LocalDateTime.now().getMonthValue();
                    if (CheckMonth == 0) {
                        int CheckDay = theUserDay - LocalDateTime.now().getDayOfMonth();
                        if (CheckDay <= 0) {
                            this.setAdult("You are Adult.");
                        } else {
                            this.setAdult("You are not Adult");
                        }
                    } else if (CheckMonth < 0) {
                        this.setAdult("You are Adult.");
                    } else {
                        this.setAdult("You are not Adult");
                    }
                } else {
                    this.setAdult("You are Not Adult");
                }
            }
            //Tell User, User is a Adult ? ot Not.
            System.out.println("Name : " + user.getName() + ", " + "Age : " + user.getAge());
            System.out.println(this.getAdult());
        }
    }
}