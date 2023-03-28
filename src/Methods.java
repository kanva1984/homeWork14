import java.util.Arrays;

public class Methods {
    public static void printList(Gryffindor[] gryffindors, Hufflepuff[] hufflepuffs, Ravenclaw[] ravenclaws,
                                 Slytherin[] slytherins) {
        System.out.println("Список студентов Хогвартс:");
        System.out.println(Arrays.toString(gryffindors));
        System.out.println(Arrays.toString(hufflepuffs));
        System.out.println(Arrays.toString(ravenclaws));
        System.out.println(Arrays.toString(slytherins));
        System.out.println();
    }

    public static void comparisonOfTwoStudentsOfGryffindor(Gryffindor gryffindor, Gryffindor gryffindor1) {
        System.out.println("Сравнение двух студентов на факультете Гриффиндор");
        if ((gryffindor.getPowerOfMagic() + gryffindor.getTransgression() + gryffindor.getNobility() +
                gryffindor.getHonor() + gryffindor.getBravery()) > (gryffindor1.getPowerOfMagic() +
                gryffindor1.getTransgression() + gryffindor1.getNobility() + gryffindor1.getHonor() +
                gryffindor1.getBravery())) {
            System.out.println(gryffindor.getFirstName() + " " + gryffindor.getSurName() + " лучше чем " +
                    gryffindor1.getFirstName() + " " + gryffindor1.getSurName());
        } else if ((gryffindor.getPowerOfMagic() + gryffindor.getTransgression() + gryffindor.getNobility() +
                gryffindor.getHonor() + gryffindor.getBravery()) < (gryffindor1.getPowerOfMagic() +
                gryffindor1.getTransgression() + gryffindor1.getNobility() + gryffindor1.getHonor() +
                gryffindor1.getBravery())) {
            System.out.println(gryffindor1.getFirstName() + " " + gryffindor1.getSurName() + " лучше чем " +
                    gryffindor.getFirstName() + " " + gryffindor.getSurName());
        } else {
            System.out.println(gryffindor.getFirstName() + " " + gryffindor.getSurName() + " и " +
                    gryffindor1.getFirstName() + " " + gryffindor1.getSurName() + " одинаково хороши");
        }
        System.out.println();
    }

    public static void comparisonOfTwoStudentsOfHufflepuff(Hufflepuff hufflepuff, Hufflepuff hufflepuff1) {
        System.out.println("Сравнение двух студентов на факультете Пуффендуй");
        if ((hufflepuff.getPowerOfMagic() + hufflepuff.getTransgression() + hufflepuff.getHonesty() +
                hufflepuff.getIndustriousness() + hufflepuff.getLoyalty()) > (hufflepuff1.getPowerOfMagic() +
                hufflepuff1.getTransgression() + hufflepuff1.getHonesty() + hufflepuff1.getIndustriousness() +
                hufflepuff1.getLoyalty())) {
            System.out.println(hufflepuff.getFirstName() + " " + hufflepuff.getSurName() + " лучше чем " +
                    hufflepuff1.getFirstName() + " " + hufflepuff1.getSurName());
        } else if ((hufflepuff.getPowerOfMagic() + hufflepuff.getTransgression() + hufflepuff.getHonesty() +
                hufflepuff.getIndustriousness() + hufflepuff.getLoyalty()) < (hufflepuff1.getPowerOfMagic() +
                hufflepuff1.getTransgression() + hufflepuff1.getHonesty() + hufflepuff1.getIndustriousness() +
                hufflepuff1.getLoyalty())) {
            System.out.println(hufflepuff1.getFirstName() + " " + hufflepuff1.getSurName() + " " +
                    " лучше чем " + hufflepuff.getFirstName() + " " + hufflepuff.getSurName());
        } else {
            System.out.println(hufflepuff.getFirstName() + " " + hufflepuff.getSurName() + " и " +
                    hufflepuff1.getFirstName() + " " + hufflepuff1.getSurName() + " одинаково хороши");
        }
        System.out.println();
    }

    public static void comparisonOfTwoStudentsOfRavenclaw(Ravenclaw ravenclaw, Ravenclaw ravenclaw1) {
        System.out.println("Сравнение двух студентов на факультете Когтевран");
        if ((ravenclaw.getPowerOfMagic() + ravenclaw.getTransgression() + ravenclaw.getIntellect() +
                ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreativity()) > (ravenclaw1.getPowerOfMagic() +
                ravenclaw1.getTransgression() + ravenclaw1.getIntellect() + ravenclaw1.getWisdom() +
                ravenclaw1.getWit()) + ravenclaw1.getCreativity()) {
            System.out.println(ravenclaw.getFirstName() + " " + ravenclaw.getSurName() + " лучше чем " +
                    ravenclaw1.getFirstName() + " " + ravenclaw1.getSurName());
        } else if ((ravenclaw.getPowerOfMagic() + ravenclaw.getTransgression() + ravenclaw.getIntellect() +
                ravenclaw.getWisdom() + ravenclaw.getWit() + ravenclaw.getCreativity()) < (ravenclaw1.getPowerOfMagic() +
                ravenclaw1.getTransgression() + ravenclaw1.getIntellect() + ravenclaw1.getWisdom() +
                ravenclaw1.getWit()) + ravenclaw1.getCreativity()) {
            System.out.println(ravenclaw1.getFirstName() + " " + ravenclaw1.getSurName() + " лучше чем " +
                    ravenclaw.getFirstName() + " " + ravenclaw.getSurName());
        } else {
            System.out.println(ravenclaw.getFirstName() + " " + ravenclaw.getSurName() + " и " +
                    ravenclaw1.getFirstName() + " " + ravenclaw1.getSurName() + " одинаково хороши");
        }
        System.out.println();
    }

    public static void comparisonOfTwoStudentsOfSlytherin(Slytherin slytherin, Slytherin slytherin1) {
        System.out.println("Сравнение двух студентов на факультете Слизерин");
        if ((slytherin.getPowerOfMagic() + slytherin.getTransgression() + slytherin.getTrick() +
                slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() +
                slytherin.getLustForPower()) > (slytherin1.getPowerOfMagic() +
                slytherin1.getTransgression() + slytherin1.getTrick() + slytherin1.getDetermination() +
                slytherin1.getAmbition()) + slytherin1.getResourcefulness() + slytherin1.getLustForPower()) {
            System.out.println(slytherin.getFirstName() + " " + slytherin.getSurName() + " лучше чем " +
                    slytherin1.getFirstName() + " " + slytherin1.getSurName());
        } else if ((slytherin.getPowerOfMagic() + slytherin.getTransgression() + slytherin.getTrick() +
                slytherin.getDetermination() + slytherin.getAmbition() + slytherin.getResourcefulness() +
                slytherin.getLustForPower()) < (slytherin1.getPowerOfMagic() +
                slytherin1.getTransgression() + slytherin1.getTrick() + slytherin1.getDetermination() +
                slytherin1.getAmbition()) + slytherin1.getResourcefulness() + slytherin1.getLustForPower()) {
            System.out.println(slytherin1.getFirstName() + " " + slytherin1.getSurName() + " лучше чем " +
                    slytherin.getFirstName() + " " + slytherin.getSurName());
        } else {
            System.out.println(slytherin.getFirstName() + " " + slytherin.getSurName() + " и " +
                    slytherin1.getFirstName() + " " + slytherin1.getSurName() + " одинаково хороши");
        }
        System.out.println();
    }

    public static void comparisonOfTwoStudentsOfHogwarts(Hogwarts student, Hogwarts student1) {
        System.out.println("Сравнение двух студентов в Хогвартс");
        if ((student.getPowerOfMagic() + student.getTransgression()) > (student1.getPowerOfMagic() +
                student1.getTransgression())) {
            System.out.println(student.getFirstName() + " " + student.getSurName() + " лучше чем " +
                    student1.getFirstName() + " " + student1.getSurName());
        } else if ((student.getPowerOfMagic() + student.getTransgression()) < (student1.getPowerOfMagic() +
                student1.getTransgression())) {
            System.out.println(student1.getFirstName() + " " + student1.getSurName() + " лучше чем " +
                    student.getFirstName() + " " + student.getSurName());
        } else {
            System.out.println(student.getFirstName() + " " + student.getSurName() + " и " +
                    student1.getFirstName() + " " + student1.getSurName() + " одинаково хороши");
        }
        System.out.println();
    }
}
