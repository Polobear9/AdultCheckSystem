package Test;

import java.time.LocalDateTime;

public class CheckTheAdult {
	
	private String Adult;
	
	public void Check(InfoUser user) {
		//it is change the type userBirth int - > String
//		String userBirth = String.valueOf(user.getBirthday());		
		//userBirth 0~4 = Year / 4~6 = Month / 6~8 = Day
		if(user.getBirthday() != null) {
		String userYear = user.getBirthday().substring(0, 4);
		String userMonth = user.getBirthday().substring(4, 6);
		String userDay = user.getBirthday().substring(6, 8);	
		//Change the Birth Info type to int from String
		int TheUserYear = Integer.parseInt(userYear);
		int TheUserMonth = Integer.parseInt(userMonth);
		int TheUserDay = Integer.parseInt(userDay);
		int YearAge = LocalDateTime.now().getYear() - TheUserYear;
		//Chack the Age, user is Adult? or Not.
		if(YearAge >= 20) {
			if(YearAge == 20) {
				int CheckMonth = TheUserMonth - LocalDateTime.now().getMonthValue();
					if(CheckMonth == 0) {
						int CheckDay = TheUserDay - LocalDateTime.now().getDayOfMonth();
							if(CheckDay <= 0) {
								String result = "You are Adult.";
								this.Adult = result;
							}else {
								String result = "You are not Adult";
								this.Adult = result;
							}
					}else if(CheckMonth < 0) {
						String result = "You are Adult.";
						this.Adult = result;
					}else {
						String result = "You are not Adult";
						this.Adult = result;
					}
				
				}else if(YearAge > 20){
					String result = "You are Adult";
					this.Adult = result;
				}else {
					String result = "You are Not Adult";
					this.Adult = result;
				}
		}
		//Tell User, User is a Adult ? ot Not.
		System.out.println(Adult);
	}
}
}