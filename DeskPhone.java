package telephonesystem;

public class DeskPhone extends AbstractPhone {

    public DeskPhone(String myNumber) {
        super(myNumber);
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }
}
