package com.company;

public class Samsung extends Phone  {
    private int batteryPower;
    private String firmware;

    public Samsung(int price, String model, int batteryPower, String firmware) {
        super(price, model);
        this.batteryPower = batteryPower;
        this.firmware = firmware;
    }

    public Samsung(int price, String model) {
        super(price, model);
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(".................................................................");
        System.out.println("Battery Power:" + getBatteryPower()+"!!"+"Firmware:"+getFirmware());
    }
}
