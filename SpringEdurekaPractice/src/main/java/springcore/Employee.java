package springcore;

public class Employee {
    private int eid;
    private String ename;
    private Address address;

    public Employee() {
        System.out.println("No args Constructor created!");
    }
    //Constructor Injection
    public Employee(Address address){
        this.address = address;
    }

    public Employee(int eid, String ename, Address address) {
        this.eid = eid;
        this.ename = ename;
        this.address = address;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Address getAddress() {
        return address;
    }
    //Setter Injection
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", address=" + address +
                '}';
    }

    public void myInit(){
        System.out.println("Object Initialized");
    }
    public void myDestroy(){
        System.out.println("Object Destroyed");
    }
}
