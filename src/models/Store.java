package models;

import java.util.Arrays;

public class Store {
    private int countOfWorkers;
    private String phoneNumber;
    private String name;
    private String[] product;

    public Store() {
    }

    public Store(int countOfWorkers, String phoneNumber, String name, String[] product) {
        this.countOfWorkers = countOfWorkers;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.product = product;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getProduct() {
        return product;
    }

    public void setProduct(String[] product) {
        this.product = product;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Store " + name +
                " , countOfWorkers = " + countOfWorkers +
                ", phoneNumber = " + phoneNumber +
                ", product = " + Arrays.toString(product);
    }
}
