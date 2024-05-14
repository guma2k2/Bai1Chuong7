public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Address address = new Address();
        String addressValue = "TP HCM";
        address.createAddress(person, addressValue);

        Name name = new Name();
        String nameValue = "Nguyen Van A";
        name.createName(person, nameValue);

        PhoneNum phoneNum = new PhoneNum();
        String phoneNumValue = "0123456789";
        phoneNum.createPhoneNum(person, phoneNumValue);

        person.displayPersonInfo();
    }
}
