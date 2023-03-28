public class Slytherin extends Hogwarts{
    private  int trick;
    private  int determination;
    private  int ambition;
    private  int resourcefulness;
    private  int lustForPower;

    public Slytherin(String firstName, String surName, int powerOfMagic, int transgression, int trick, int determination,
                     int ambition, int resourcefulness, int lustForPower) {
        super(firstName, surName, powerOfMagic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    public int getGradeSlytherin() {
        int gradeSlytherin = powerOfMagic + transgression + trick + determination + ambition + resourcefulness +
                lustForPower;
        return gradeSlytherin;
    }
    public String toString() {
        return "\nСлизерин: " + firstName + " " + surName + " (cила магии: " + powerOfMagic +
                "; расстояние трансгресии: " + transgression + "; хитрость: " + trick + "; решительность: " +
                determination + "; амбициозность: " + ambition + "; находчивость : " + resourcefulness +
                "; жажда власти: " + lustForPower + ")";
    }
}
