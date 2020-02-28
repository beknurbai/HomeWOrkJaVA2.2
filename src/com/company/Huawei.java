package com.company;

public class Huawei extends Phone implements Printable {
    private String firmware;
    private int batterySpeed;

    public Huawei(int price, String model, String firmware, int batterySpeed) {
        super(price, model);
        this.firmware = firmware;
        this.batterySpeed = batterySpeed;
    }

    public Huawei(int price, String model) {
        super(price, model);
    }

    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public int getBatterySpeed() {
        return batterySpeed;
    }

    public void setBatterySpeed(int batterySpeed) {
        this.batterySpeed = batterySpeed;
    }

    @Override
    public void print() {
      super.print();
        System.out.println(".................................................................");
        System.out.println("Firmware: "+getFirmware()+" !! "+"Battery Speed: "+getBatterySpeed());

    }
}
