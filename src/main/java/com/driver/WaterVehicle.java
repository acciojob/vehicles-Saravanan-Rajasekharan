package com.driver;

public interface WaterVehicle {
    public String getVehicleName();
    public int getVehicleCapacity();
}

class boat implements WaterVehicle{
    private String name;
    private int capacity;

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}