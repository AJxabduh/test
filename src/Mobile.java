public class Mobile {
    private String manufacture;
    private String operatingSystem;
    private String model;
    private int cost;

    public Mobile(String manufacture, String operatingSystem, String model, int cost) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = model;
        this.cost = cost;
    }

    public Mobile(String manufacture, String operatingSystem) {
        this.manufacture = manufacture;
        this.operatingSystem = operatingSystem;
        this.model = null;
        this.cost = 0;
    }

    //Overide toString method
    @Override
    public String toString() {
        return ("Manufacture: " + this.manufacture + "\nOS: " + this.operatingSystem + "\nModel: " + this.model + "\nCost:" + cost);
    }
}