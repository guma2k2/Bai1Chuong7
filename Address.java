public class Address {
    private String address;

    public Address() {
    }

    public Address(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void createAddress(Person person, String addressValue) {
        Address address = new Address(addressValue);
        person.setAddress(address);
    }

    public void display() {
        String displayFormat = "The address of person is %s";
        System.out.println(String.format(displayFormat, address));
    }
}
