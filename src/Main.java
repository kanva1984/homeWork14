public class Main {
    public static void main(String[] args) {
        Hogwarts[] students = {
                new Hogwarts("Гарри", "Поттер", 95, 85),
                new Hogwarts("Гермиона", "Грейнджер", 80, 85),
                new Hogwarts("Рон", "Уизли", 65, 70),
                new Hogwarts("Захария", "Смит", 65, 73),
                new Hogwarts("Седрик", "Диггори", 84, 65),
                new Hogwarts("Джастин", "Финч-Флетчли", 85, 66),
                new Hogwarts("Чжоу", "Чанг", 65, 55),
                new Hogwarts("Падма", "Патил", 85, 44),
                new Hogwarts("Маркус", "Белби", 65, 55),
                new Hogwarts("Драко", "Малфой", 85, 90),
                new Hogwarts("Грэхэм", "Монтегю", 70, 75),
                new Hogwarts("Грегори", "Гойл", 65, 85),
        };
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 95, 85, 65, 99,
                        99),
                new Gryffindor("Гермиона", "Грейнджер", 80, 85, 90, 95,
                        100),
                new Gryffindor("Рон", "Уизли", 65, 70, 90, 80,
                        60),
        };
        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 65, 73, 56, 90,
                        55),
                new Hufflepuff("Седрик", "Диггори", 84, 65, 75, 65,
                        58),
                new Hufflepuff("Джастин", "Финч-Флетчли", 85, 66, 24,
                        85, 65),
        };
        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 65, 55, 86, 90, 85,
                        95),
                new Ravenclaw("Падма", "Патил", 85, 44, 65, 75,
                        66, 85),
                new Ravenclaw("Маркус", "Белби", 65, 55, 48, 96,
                        84, 85),
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 85, 90, 99, 100,
                        70, 70, 100),
                new Slytherin("Грэхэм", "Монтегю", 70, 75, 66, 85,
                        45, 85, 75),
                new Slytherin("Грегори", "Гойл", 65, 85, 74, 98,
                        63, 78, 85),
        };
        Methods.printList(gryffindors, hufflepuffs, ravenclaws, slytherins);
        Methods.comparisonOfTwoStudentsOfGryffindor(gryffindors[0], gryffindors[1]);
        Methods.comparisonOfTwoStudentsOfHufflepuff(hufflepuffs[0], hufflepuffs[2]);
        Methods.comparisonOfTwoStudentsOfRavenclaw(ravenclaws[1], ravenclaws[2]);
        Methods.comparisonOfTwoStudentsOfSlytherin(slytherins[0], slytherins[1]);
        Methods.comparisonOfTwoStudentsOfHogwarts(students[5], students[10]);
    }
}