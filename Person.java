public class Person {

    private Name name;
    private PhoneNum phoneNum;
    private Address address;

    public Person() {
    }

    public Person(Name name, PhoneNum phoneNum, Address address) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public PhoneNum getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(PhoneNum phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayPersonInfo() {
        name.display();
        phoneNum.display();
        address.display();
    }
}
