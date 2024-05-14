public class PhoneNum {

    private String phoneNum;

    public PhoneNum() {
    }

    public PhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void createPhoneNum(Person person, String phoneNumValue) {
        PhoneNum phoneNum = new PhoneNum(phoneNumValue);
        person.setPhoneNum(phoneNum);
    }

    public void display() {
        String displayFormat = "The phoneNum of person is %s";
        System.out.println(String.format(displayFormat, phoneNum));
    }
}
