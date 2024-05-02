package tpbo;


class Person {
    String name;
    String address;
    String hobi;

    public Person(String name, String address, String hobi) {
        this.name = name;
        this.address = address;
        this.hobi = hobi;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getHobi() {
        return hobi;
    }
}
