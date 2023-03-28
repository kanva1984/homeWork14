public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String surName, int powerOfMagic, int transgression, int nobility, int honor,
                      int bravery) {
        super(firstName, surName, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getGradeGryffindor() {
        int gradeGryffindor = powerOfMagic + transgression + nobility + honor + bravery;
        return gradeGryffindor;
    }

    public String toString() {
        return "\nГриффиндор: " + firstName + " " + surName + " (cила магии: " + powerOfMagic +
                "; расстояние трансгресии: " + transgression + "; благородство: " + nobility + "; честь: " + honor +
                "; храбрость: " + bravery + ")";
    }
}
