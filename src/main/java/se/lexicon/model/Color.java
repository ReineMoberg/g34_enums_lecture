package se.lexicon.model;

public enum Color {
    // define values using uppercase letters
    GRAY("11"), WHITE("22"), BLACK("33");

    private String colorNumber;

    Color(String colorNumber) {
        this.colorNumber = colorNumber;
    }

    public String getColorNumber() {
        return colorNumber;
    }

    public void setColorNumber(String colorNumber) {
        this.colorNumber = colorNumber;
    }
}
