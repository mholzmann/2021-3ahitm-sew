package at.htl.binding.model.cars;

import java.time.LocalDate;

public class Car {

    private String model;
    private String maker;
    private int productionYear;
    private LocalDate registration;
    private boolean electric;

    public Car(String model, String maker, int productionYear, LocalDate registration, boolean electric) {
        this.model = model;
        this.maker = maker;
        this.productionYear = productionYear;
        this.registration = registration;
        this.electric = electric;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public LocalDate getRegistration() {
        return registration;
    }

    public void setRegistration(LocalDate registration) {
        this.registration = registration;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public String toString() {
        return maker + " " + model;
    }
}
