package se.lexicon.model;

public enum Gender {

    MALE(1),FEMALE(2),NON_BINARY(3);

    private int typeCode;

    Gender(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }
}
