package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void getHoroscope(Zodiac z)
	{
		switch(z)
		{
		case CANCER:
			System.out.println("you will be hated for all eternity");
			break;
		case AQUARIUS:
		case ARIES:
		case CAPRICORN:
		case GEMINI:
		case LEO:
		case LIBRA:
		case PISCES:
		case SAGITTARIUS:
			System.out.println("you will be ok");
			break;
		case SCORPIO:
		case TAURUS:
		case VIRGO:
			System.out.println("you will be successful");
			break;
		default:
			System.out.println("an error occured");
			break;
		}
	}
	// 3. Make a main method to test your method
	public _00_Horoscope(Zodiac z) {
		getHoroscope(z);
	}
	public static void main(String[] args) {
		new _00_Horoscope(Zodiac.CANCER);
	}
}
