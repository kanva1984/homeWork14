public class Hogwarts {
    protected String firstName;
    protected String surName;
    protected int powerOfMagic;
    protected int transgression;

    public Hogwarts(String firstName, String surName, int powerOfMagic, int transgression) {
        this.firstName = firstName;
        this.surName = surName;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }
}
