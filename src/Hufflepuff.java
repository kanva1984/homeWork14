public class Hufflepuff extends Hogwarts{
    private  int industriousness;
    private  int loyalty;
    private  int honesty;

    public Hufflepuff(String firstName, String surName, int powerOfMagic, int transgression, int industriousness,
                      int loyalty, int honesty) {
        super(firstName, surName, powerOfMagic, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int getGradeHufflepuff() {
        int gradeHufflepuff = powerOfMagic + transgression + industriousness + loyalty + honesty ;
        return gradeHufflepuff;
    }
    public String toString() {
        return "\nПуффендуй: " + firstName + " " + surName + " (cила магии: " + powerOfMagic +
                "; расстояние трансгресии: " + transgression + "; трудолюбие: "+ industriousness +
                "; верность: " + loyalty + "; честность: " + honesty + ")";
    }
}
