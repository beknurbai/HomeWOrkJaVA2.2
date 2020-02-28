package com.company;

public class Iphone extends Phone implements Printable {
    private int cameraPower;

    public Iphone(int price, String model, int cameraPower, String cameraModel) {
        super(price, model);
        this.cameraPower = cameraPower;
        this.cameraModel = cameraModel;
    }

    public Iphone(int price, String model) {
        super(price, model);
    }

    public int getCameraPower() {
        return cameraPower;
    }

    public void setCameraPower(int cameraPower) {
        this.cameraPower = cameraPower;
    }

    public String getCameraModel() {
        return cameraModel;
    }

    public void setCameraModel(String cameraModel) {
        this.cameraModel = cameraModel;
    }

    private String cameraModel;

    @Override
    public void print() {
       super.print();
        System.out.println(".......................................");
        System.out.println("CameraPower :"+getCameraPower()+"!!"+"Camera Model: "+getCameraModel());

    }
}
