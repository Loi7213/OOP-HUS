package lab6.ex1.person;

public class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.setAddress(address);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Person[name = " + name + ", address = " + address + "]";
    }
}
