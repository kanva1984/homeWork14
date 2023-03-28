public class Ravenclaw extends Hogwarts{
    private  int intellect;
    private  int wisdom;
    private  int wit;
    private  int creativity;

    public Ravenclaw(String firstName, String surName, int powerOfMagic, int transgression, int intellect, int wisdom,
                     int wit, int creativity) {
        super(firstName, surName, powerOfMagic, transgression);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public int getGradeRavenclaw() {
        int gradeRavenclaw = powerOfMagic + transgression + intellect + wisdom + wit + creativity;
        return gradeRavenclaw;
    }
    public String toString() {
        return "\nКогтевран: " + firstName + " " + surName + " (cила магии: " + powerOfMagic +
                "; расстояние трансгресии: " + transgression + "; ум: " + intellect + "; мудрость: " + wisdom +
                "; остроумие: " + wit + "; творчество: " + creativity + ")";
    }
}
