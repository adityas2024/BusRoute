public class Bus {
    private int ID;
    private String driver;
    private BusRoute BR;

    public Bus(int i, String d, BusRoute BR){
        this.ID = i;
        this.driver = d;
        this.BR = BR;
    }

    public int getId() {
        return this.ID;
    }

    public void setid(int i){
         this.ID = i;
    }
    public String getDriver(){
        return this.driver;
    }

    public void setDriver(String d) {
        this.driver = d;
    }

    public BusRoute getBR() {
        return BR;
    }

    public void setBR(BusRoute BR) {
        this.BR = BR;
    }
    public String toStringB(){
        return getBR() + "This bus has ID " + getId() + " the driver is " + getDriver();

    }


}
