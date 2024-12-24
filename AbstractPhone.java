package telephonesystem;

public abstract class AbstractPhone implements Telephone {
    protected String myNumber;
    protected boolean isRinging;
    protected boolean isPowerOn;

    public AbstractPhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone powered on");
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber.equals(myNumber) && isPowerOn) {
            isRinging = true;
            System.out.println("Phone ringing");
        } else {
            System.out.println("Either wrong number entered or phone is off");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn) {
            System.out.println("Answering the phone");
            isRinging = false;
        } else {
            System.out.println("Phone is not ringing or powered off");
        }
    }
}
