package telephonesystem;

public class MobilePhone extends AbstractPhone {

    public MobilePhone(String myNumber) {
        super(myNumber);
    }

    @Override
    public void dial(String phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on mobile phone");
    }
}
