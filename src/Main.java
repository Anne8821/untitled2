public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper * 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
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

        var oneBoxerWeight = 78.2;
        var twoBoxerWeight = 82.7;
        var totalWeight = oneBoxerWeight + twoBoxerWeight;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var twoTotalWeight = twoBoxerWeight - oneBoxerWeight;
        System.out.println("Разница между боксерами " + twoTotalWeight + " кг");
        var difference = twoBoxerWeight % oneBoxerWeight;
        System.out.println("Остаток от деления " + difference);

        var watch = 640;
        var oneEmployee = 8;
        var totalEmployees = watch / oneEmployee;
        System.out.println("Всего работников в компании — " + totalEmployees + " человек");

        var twoEmployee = totalEmployees + 94;
        var freeWatch = watch / twoEmployee;
        System.out.println("Если в компании работает " + twoEmployee + " человек, то всего по " + freeWatch + " часа работы может быть поделено между сотрудниками");


    }
}