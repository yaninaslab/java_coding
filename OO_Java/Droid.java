public class Droid {
    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public String toString() {
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task) {
        System.out.println(name + " is performing task: " + task);
        batteryLevel = batteryLevel - 10;

    }

    public void energyReport() {
        System.out.println("Your battery level is: " + batteryLevel);
    }

    public void energyTransfer(int energy, Droid droName) {
        batteryLevel -= energy;
        droName.batteryLevel += energy;

    }

    public static void main(String[] args) {

        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("dancing");
        codey.energyReport();
        codey.performTask("singing");
        codey.energyReport();
        codey.performTask("swimming");
        codey.energyReport();

        Droid leo = new Droid("Leo");
        System.out.println(leo);

        leo.energyTransfer(40, codey);
        codey.energyReport();

        codey.energyTransfer(20, leo);
        leo.energyReport();

    }
}
