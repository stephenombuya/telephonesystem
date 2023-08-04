package telephonesystem;

public class Main {

	public static void main(String[] args) {
	
				DeskPhone myPhone = new DeskPhone("123456");
				myPhone.powerOn();
				myPhone.callPhone("123456");
				myPhone.answer();

				MobilePhone myPhone1 = new MobilePhone("12345");
				myPhone1.powerOn();
				myPhone1.callPhone("12345");
				myPhone1.answer();
			}	
	}


