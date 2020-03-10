package Switch;

public class Calander {

	public static void main(String[] args) {
		
		int month= 8;
		String monthstring="";
		
		switch (month)  {
		
		case 1: monthstring="jan";
		break;
		
		case 2: monthstring="feb";
		break;
		
		case 3: monthstring="mar";
		break;
		
		case 4: monthstring="apr";
		break;
		
		case 5: monthstring="may";
		break;
		
		case 6: monthstring="jun";
		break;
		
		case 7: monthstring="july";
		break;
		
		case 8: monthstring="aug";
		break;
		
		case 9: monthstring="sep";
		break;
		
		case 10: monthstring="oct";
		break;
		
		case 11: monthstring="nov";
		break;
		
		case 12: monthstring="dec";
		break;
		
		default: System.out.println("invalid month");
		
		}
		
System.out.println(monthstring);
	}

    }
