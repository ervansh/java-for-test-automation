package oopsHT_ApplianceProgram;

public class Appliance {
    private String name;
    private int powerConsumption;
    private boolean isSwitchedOn;

    public Appliance(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.isSwitchedOn = false; // initially all appliances are off
    }

    public void switchOn() {
        this.isSwitchedOn = true;
    }

    public void switchOff() {
        this.isSwitchedOn = false;
    }

    public int getPowerConsumption() {
        return isSwitchedOn ? powerConsumption : 0;
    }

    public String getName() {
        return name;
    }

    public int getBasePowerConsumption() {
        return powerConsumption;
    }

    @Override
    public String toString() {
        return name + " (" + powerConsumption + " units)";
    }
}
