// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);

            var dog = 8.0;
            System.out.println(dog);
            var cat  = 3.6;
            System.out.println(cat);
            var paper = 763789;
            System.out.println(paper);
            dog = dog + 4;
            System.out.println(dog);
            cat = cat + 4;
            System.out.println(cat);
            paper = paper + 4;
            System.out.println(paper);
            dog = dog - 3.5;
            System.out.println(dog);
            cat = cat - 1.6;
            System.out.println(cat);
            paper = paper - 7639;
            System.out.println(paper);
            var friend = 19;
            System.out.println(friend);
            friend = friend + 2;
            System.out.println(friend);
            friend = friend / 7;
            System.out.println(friend);
            var frog = 3.5;
            System.out.println(frog);
            frog = frog * 10;
            System.out.println(frog);
            frog = frog / 3.5;
            System.out.println(frog);
            frog = frog + 4;
            System.out.println(frog);
            var liftingCapacity = 50;
            var stuffWeight = 20;
            var capacityLeft = liftingCapacity - stuffWeight;
            System.out.println("Еще можно положить " + capacityLeft + " кг вещей");
            var appleWeight = 2;
            var orangesWeight = 3;
            var fruitWeight = appleWeight + orangesWeight;
            System.out.println("Общий вес фруктов " + fruitWeight);
            var meatWeight = 4;
            var waterWeight = 5;
            var tomatoesWeight = 2;
            var cucumbersWeight = 2;
            var peppersWeight = 2;
            var zucchiniWeight = 2;
            var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
            var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
            System.out.println("Общий вес продуктов " + productsWeight + " кг!");
            var leftWeight = liftingCapacity - stuffWeight - productsWeight;
            System.out.println("Места осталось " + leftWeight + " кг!");
            productsWeight = productsWeight * 2;
            System.out.println("Теперь вес продуктов " + productsWeight);
            leftWeight = liftingCapacity - stuffWeight - productsWeight;
            System.out.println("Теперь места осталось " + leftWeight + " кг!");

            var overload = (stuffWeight + productsWeight) % liftingCapacity;
            System.out.println("Перегруз на " + overload + " кг!");

            var productsInOneCar  = productsWeight / 2;
            System.out.println("Продуктов в одной машине теперь " + productsInOneCar);

            var theFirstFighter = 78.2;
            var theSecondFighter = 82.7;
            var totalWeight = theFirstFighter + theSecondFighter;
            System.out.println("Общий вес бойцов " + totalWeight + " кг");

            var differenceWeight = theSecondFighter - theFirstFighter;
            System.out.println("Разница в весе бойцов " +  differenceWeight + " кг");

            var diffWeight = (theFirstFighter + theSecondFighter) % theFirstFighter;
            System.out.println("Разница между бойцами " + diffWeight + " кг");

            var totalHours = 640;
            var hoursPerEmployee = 8;
            var totalEmployees = totalHours / hoursPerEmployee;
            System.out.println("Всего работников в комании " + totalEmployees + " человек");

            totalEmployees = totalEmployees + 94;
            System.out.println(totalEmployees);

            var hoursForEach = totalHours % totalEmployees;
            System.out.println("Если в компании работают " + totalEmployees + " человек, то всего " + hoursForEach + " часов работы может быть поделено между сотрудниками");

            short bananas = 200;
            System.out.println("Бананов " + bananas + " кг");

            float sugar = 3;
            float onePortion = sugar / 4;
            System.out.println("Одна порция сахара весит " + onePortion + " кг");

            byte a = 1;
            short b = 1;
            int c = 1;
            int d = a + b + c;
            System.out.println(d);

            float g = a + 1f;
            System.out.println(g);

            int z = 1;
            System.out.println("Значение переменой z с типом int равно " + z);

            byte x = 2;
            System.out.println("Значение переменой x с типом byte равно " + x);

            short v = 3;
            System.out.println("Значение переменой v с типом short равно " + v);

            long n = 4;
            System.out.println("Значение переменой n с типом long равно " + n);

            float m = 0.2f;
            System.out.println("Значение переменой m с типом float равно " + m);

            double k = 2.1;
            System.out.println("Значение переменой k с типом double равно " + k);

            float float2 = 27.12f;
            System.out.println(float2);
            long long2 = 987678965549l;
            System.out.println(long2);
            double double2 = 2.786;
            System.out.println(double2);
            char char2 = 569;
            System.out.println(char2);
            short short2 = -159;
            System.out.println(short2);
            int int2 = 27897;
            System.out.println(int2);
            byte byte2 = 67;
            System.out.println(byte2);

            int Ludmila_Pavlovna = 23;
            int Anna_Sergeevna = 27;
            int Ekaterina_Andreevna = 30;
            int totalPaper = 480;
            int paperPerStudent = (totalPaper / Ludmila_Pavlovna + Anna_Sergeevna + Ekaterina_Andreevna);
            System.out.println("На каждого ученика расчитано " + paperPerStudent + " листов бумаги");

            int min2 = 16;
            System.out.println("За 2 минуты машина произвела " + min2 + " штук бутылок");
            int min20 = min2 * 10;
            System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
            int h24 = min20 * 3 * 24;
            System.out.println("За сутки машина произвела " + h24 + " штук бутылок");
            int days3 = h24 * 3;
            System.out.println("За 3 дня машина произвела " + days3 + " штук бутылок");
            int month = days3 * 10;
            System.out.println("За месяц машина произвела " + month + " штук бутылок");

            int white = 2;
            int brown = 4;
            int total = 120;
            int totalClasses = total / (white + brown);
            int totalWhite = white * totalClasses;
            int totalBrown = brown * totalClasses;
            System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок белой краски" );

            int banana = 5 * 80;
            int milk = 200 / 100 * 105;
            int iceCream = 2 * 100;
            int eggs = 4 * 70;
            int grammWeight = banana + milk + iceCream + eggs;
            double kgWeight = grammWeight / 1000.0;
            System.out.println("Вес такого завтрака " + kgWeight + " кг");

            int goalKg = 7;
            int minGrammPerDay = 250;
            int maxGrammPerDay = 500;
            int goalGramm = goalKg * 1000;
            int ifMin = goalGramm / minGrammPerDay;
            System.out.println("Если спортсмен будет терять в день по 250 грамм, то " + ifMin + " дней");
            int ifMax = goalGramm / maxGrammPerDay;
            System.out.println("Если спортсмен будет терять в день по 500 грамм, то " + ifMax + " дней");
            int avgDays = goalGramm / maxGrammPerDay;
            System.out.println("Если спортсмен будет терять лишь в среднем, то " + avgDays + " дней");

            int Masha = 67760;
            int Denis = 83690;
            int Kristina = 76230;
            int MashaIncrease = Masha / 100 * 10;
            int DenisIncrease = Denis / 100 * 10;
            int KristinaIncrease = Kristina / 100 * 10;
            int MashaNew = Masha + MashaIncrease;
            int DenisNew = Denis + DenisIncrease;
            int KristinaNew = Kristina + KristinaIncrease;
            int MashaUp = MashaIncrease * 12;
            int DenisUp = DenisIncrease * 12;
            int KristinaUp = KristinaIncrease * 12;
            System.out.println("Маша теперь получает " + MashaNew + " рублей. Годовой доход вырос на " + MashaUp + " рублей");
            System.out.println("Денис теперь получает " + DenisNew + " рублей. Годовой доход вырос на " + DenisUp + " рублей");
            System.out.println("Кристина теперь получает " + KristinaNew + " рублей. Годовой доход вырос на " + KristinaUp + " рублей");
        }
    }
}