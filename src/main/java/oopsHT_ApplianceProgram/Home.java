package oopsHT_ApplianceProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Home {
    private ArrayList<Appliance> appliances;

    public Home() {
        appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance a) {
        appliances.add(a);
    }

    public int calculateCurrentLoad() {
        int totalConsumption = 0;
        for (Appliance a : appliances) {
            totalConsumption += a.getPowerConsumption();
        }
        return totalConsumption;
    }

    public void sortAppliancesByPowerConsumption() {
        Collections.sort(appliances, Comparator.comparing(Appliance::getBasePowerConsumption));
        System.out.println("Appliances sorted by power consumption:");
        appliances.forEach(System.out::println);
    }

    public static void main(String args[]) {
        Home myHome = new Home();
        myHome.addAppliance(new Appliance("FAN", 1));
        myHome.addAppliance(new Appliance("Light", 2));
        myHome.addAppliance(new Appliance("TV", 3));
        myHome.addAppliance(new Appliance("Laptop", 2));

        // Switch on some appliances
        myHome.appliances.get(0).switchOn(); // FAN on
        myHome.appliances.get(1).switchOn(); // Light on
        myHome.appliances.get(2).switchOn(); // TV on

        System.out.println("Current power consumption: " + myHome.calculateCurrentLoad() + " units\n");

        myHome.sortAppliancesByPowerConsumption();
    }
}
