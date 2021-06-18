public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    public String ring() {
        String r = "Galaxy" + this.getVersionNumber() + " says " + this.getRingTone();
        return r;
    }

    public String unlock() {
        return "Unlocking via finger print";
    }
    public void displayInfo() {
        System.out.println("Galaxy" + this.getVersionNumber() + " from " + this.getCarrier());
    }
}