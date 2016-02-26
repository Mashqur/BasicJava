class Demoswitch{
	
	public static void main(String[] args){
		
		//java.util.ArrayList<String> monthstring = new java.util.ArrayList<String>();
		String monthstring;
		int month = 8;
		switch(month){
			case 1: monthstring = "January";
			break;
			case 2: monthstring = "Feb";
			break;
			case 3: monthstring = "March";
			break;
			case 4: monthstring = "April";
			break;
			case 5: monthstring = "May";
			break;
			case 6: monthstring = "June";
			break;
			case 7: monthstring = "July";
			break;
			case 8: monthstring = "August";
			break;
			case 9: monthstring = "September";
			break;
			case 10: monthstring = "October";
			break;
			case 11: monthstring = "November";
			break;
			case 12: monthstring = "December";
			break;
			default : monthstring = "Invalid month";
			break;
		}
		System.out.println(monthstring);
	}
}