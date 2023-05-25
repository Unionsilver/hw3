public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1 () {
        byte code = 10;
        System.out.println("Значение переменной code с типом byte равно " + code);
        short num = 199;
        System.out.println("Значение переменной num с типом short равно " + num);
        int num2 = 19992;
        System.out.println("Значение переменной num2 с типом int равно " + num2);
        long salary = 1000000000L;
        System.out.println("Значение переменной salary с типом long равно " + salary);
        float num6 = 1.1f;
        System.out.println("Значение переменной num6 с типом float равно " + num6);
        double num7 = 1.484778;
        System.out.println("Значение переменной num7 с типом double равно " + num7);

    }
    public static void task2 () {
        float num1 = 27.12f;
        System.out.println(num1);
        long num2 = 987678965549L;
        System.out.println(num2);
        float num3 = 2.786f;
        System.out.println(num3);
        short num4 = 569;
        System.out.println(num4);
        short num5 = -159;
        System.out.println(num5);
        int num6 = 27897;
        System.out.println(num6);
        byte num7 = 67;
        System.out.println(num7);
    }
    public static void task3 () {
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekateriniAndreevni = 30;
        int totalPaper = 480;
        int eachStudent = totalPaper / (ludmilaPavlovna + annaSergeevna + ekateriniAndreevni);
        System.out.println("На каждого ученика рассчитано " + eachStudent + " листов бумаги");
    }
    public static void task4 () {
        int bottlePerMinute = 8;
        int minute = 20;
        int productive = bottlePerMinute * minute;
        System.out.println("За " + minute + " минут " + " машина произвела " +  productive + " штук бутылок");
        int bottlePerMinute1 = 8;
        int minute1 = 1440;
        int productive1 = bottlePerMinute1 * minute1;
        System.out.println("За " + minute1 + " минут " + " машина произвела " +  productive1 + " штук бутылок");
        int bottlePerMinute2 = 8;
        int minute2 = 4320;
        int productive2 = bottlePerMinute2 * minute2;
        System.out.println("За " + minute2 + " минут " + " машина произвела " +  productive2 + " штук бутылок");
        int bottlePerMinute3 = 8;
        int minute3 = 43200;
        int productive3 = bottlePerMinute3 * minute3;
        System.out.println("За " + minute3 + " минут " + " машина произвела " +  productive3 + " штук бутылок");
    }
    public static void task5 () {
        int whitePaint = 2;
        int brownPint = 4;
        int jar = 120;
        int room = jar / (whitePaint + brownPint);
        int brown = room * brownPint;
        int white =room * whitePaint;
        System.out.println("В школе, где " + room + " Классов, нужно " + white
                + " банок белой краски и " + brown + " банок коричневой краски");
    }
    public static void task6 () {
        double kilogram = 1000.0;

        int banana = 5;
        int gramOneBanana = 80;
        int sumGramBanana = banana * gramOneBanana;

        int milkMl = 100;
        int sumGramMilk = milkMl * 2;

        int iceCream = 2;
        int onePeaceGram = 100;
        int sumGramIceCream = onePeaceGram * iceCream;

        int egs = 4;
        int gramOneEgs = 70;
        int sumGramEgs = gramOneEgs * egs;

        int sumGram = sumGramBanana + sumGramMilk + sumGramIceCream + sumGramEgs;
        double totalWeightKilogram = sumGram / kilogram;
        System.out.println("смешали " + sumGram + " грамов всех продуктов и мы получили " + totalWeightKilogram
                + " килограмов всех продуктов ");
    }
    public static void task7 () {
        int eachDayGram = 250;
        int lostWeight = 7;
        int kilogram = 1000;
        int gram = kilogram * lostWeight;
        int days = gram / eachDayGram;
        System.out.println("нужно спортсмену " + days + " дней что бы добиться результата для похудения");

        int eachDayGram1 = 500;
        int lostWeight1 = 7;
        int kilogram1 = 1000;
        int gram1 = kilogram1 * lostWeight1;
        int days1 = gram1 / eachDayGram1;
        System.out.println("нужно спортсмену " + days1 + " дней что бы добиться результата для похудения");
    }
    public static void task8 () {
        double mashaSalaryMonth = 67760;
        double salary10Percent = (mashaSalaryMonth * 10) / 100;
        double salaryUp10Percent = mashaSalaryMonth + salary10Percent;
        double before = mashaSalaryMonth * 12;
        double after = salaryUp10Percent * 12;
        double yearsMoney = after - before;
        System.out.println("Маша теперь получает " + salaryUp10Percent + " рублей. Годовой доход вырос на "
                + yearsMoney + " рублей");

        double denisSalaryMonth1 = 83690;
        double salary10Percent1 = (denisSalaryMonth1 * 10) / 100;
        double salaryUp10Percent1 = denisSalaryMonth1 + salary10Percent1;
        double before1 = denisSalaryMonth1 * 12;
        double after1 = salaryUp10Percent1 * 12;
        double yearsMoney1 = after1 - before1;
        System.out.println("Денис теперь получает " + salaryUp10Percent1 + " рублей. Годовой доход вырос на "
                + yearsMoney1 + " рублей");

        double kristinaSalaryMonth2 = 76230;
        double salary10Percent2 = (kristinaSalaryMonth2 * 10) / 100;
        double salaryUp10Percent2 = kristinaSalaryMonth2 + salary10Percent2;
        double before2 = kristinaSalaryMonth2 * 12;
        double after2 = salaryUp10Percent2 * 12;
        double yearsMoney2 = after2 - before2;
        System.out.println("Кристина теперь получает " + salaryUp10Percent2 + " рублей. Годовой доход вырос на "
                + yearsMoney2 + " рублей");



    }

}