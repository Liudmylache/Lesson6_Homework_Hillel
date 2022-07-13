package cats;

public class Cats {
    private final String name;
    private String address;
    private String ownerName;
    private final String passportId;

    public Cats(String name, String address, String ownerName, String passportId) {
        this.name = name;
        this.address = address;
        this.ownerName = ownerName;
        this.passportId = passportId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Cats{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", passportId='" + passportId + '\'' + '\n'+
                '}';
    }
}
