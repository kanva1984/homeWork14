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
        if (gryffindor.getGradeGryffindor()  > gryffindor1.getGradeGryffindor()) {
            System.out.println(gryffindor.getFirstName() + " " + gryffindor.getSurName() + " лучше чем " +
                    gryffindor1.getFirstName() + " " + gryffindor1.getSurName());
        } else if (gryffindor.getGradeGryffindor()  < gryffindor1.getGradeGryffindor()) {
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
        if (hufflepuff.getGradeHufflepuff()  > hufflepuff1.getGradeHufflepuff()) {
            System.out.println(hufflepuff.getFirstName() + " " + hufflepuff.getSurName() + " лучше чем " +
                    hufflepuff1.getFirstName() + " " + hufflepuff1.getSurName());
        } else if (hufflepuff.getGradeHufflepuff()  < hufflepuff1.getGradeHufflepuff()) {
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
        if (ravenclaw.getGradeRavenclaw() > ravenclaw1.getGradeRavenclaw()) {
            System.out.println(ravenclaw.getFirstName() + " " + ravenclaw.getSurName() + " лучше чем " +
                    ravenclaw1.getFirstName() + " " + ravenclaw1.getSurName());
        } else if (ravenclaw.getGradeRavenclaw() < ravenclaw1.getGradeRavenclaw()) {
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
        if (slytherin.getGradeSlytherin() > slytherin1.getGradeSlytherin()) {
            System.out.println(slytherin.getFirstName() + " " + slytherin.getSurName() + " лучше чем " +
                    slytherin1.getFirstName() + " " + slytherin1.getSurName());
        } else if (slytherin.getGradeSlytherin() < slytherin1.getGradeSlytherin()) {
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
        if (student.getGradeHogwarts() > student1.getGradeHogwarts()) {
            System.out.println(student.getFirstName() + " " + student.getSurName() + " лучше чем " +
                    student1.getFirstName() + " " + student1.getSurName());
        } else if (student.getGradeHogwarts() < student1.getGradeHogwarts()) {
            System.out.println(student1.getFirstName() + " " + student1.getSurName() + " лучше чем " +
                    student.getFirstName() + " " + student.getSurName());
        } else {
            System.out.println(student.getFirstName() + " " + student.getSurName() + " и " +
                    student1.getFirstName() + " " + student1.getSurName() + " одинаково хороши");
        }
        System.out.println();
    }
}
