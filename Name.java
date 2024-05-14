public class Name {
    private String name;

    public Name() {
    }

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createName(Person person, String nameValue) {
        Name name = new Name(nameValue);
        person.setName(name);
    }

    public void display() {
        String displayFormat = "The name of person is %s";
        System.out.println(String.format(displayFormat, name));
    }
}
