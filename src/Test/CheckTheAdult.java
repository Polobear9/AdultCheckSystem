package Test;

import java.time.LocalDateTime;

public class CheckTheAdult {

    private String Adult;
    private String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void Check(InfoUser user) {
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
                            result = "You are Adult.";
                            this.setResult(result);
                        } else {
                            result = "You are not Adult";
                            this.setResult(result);
                        }
                    } else if (CheckMonth < 0) {
                        result = "You are Adult.";
                        this.setResult(result);
                    } else {
                        result = "You are not Adult";
                        this.setResult(result);
                    }

                } else if (yearAge > 20) {
                    result = "You are Adult";
                    this.setResult(result);
                } else {
                    result = "You are Not Adult";
                    this.setResult(result);
                }
            }
            //Tell User, User is a Adult ? ot Not.
            System.out.println(Adult);
        }
    }
}