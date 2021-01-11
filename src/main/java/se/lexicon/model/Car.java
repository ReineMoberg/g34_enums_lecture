package se.lexicon.model;

public class Car {

    private int registerNumber;
    private String brand;
    private int year;
    private Color color; // GRAY, WHITE, BLACK


    public Car() {
    }

    public Car(int registerNumber, String brand, int year, Color color) {
        this.registerNumber = registerNumber;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public int getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(int registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "registerNumber=" + registerNumber +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", color=" + color +
                '}';
    }
}
