public class Main {
    public static void main(String[] args) {
var dog = 8.0;
var cat = 3.6;
var paper = 763789.0;
        System.out.println (dog);
        System.out.println (cat);
        System.out.println (paper);
        dog = dog +4;
        System.out.println (dog);
        cat = cat +4;
        System.out.println (cat);
        paper = paper + 4;
        System.out.println (paper);
        dog = dog - 3.5;
        System.out.println (dog);
        cat = cat - 1.6;
        System.out.println (cat);
        paper = paper - 7639;
        System.out.println (paper);
        var friend = 19;
        System.out.println (friend);
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);
        var frog = 3.5;
        System.out.println (frog);
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        var boxer1 = 78.2;
        System.out.println (boxer1 + " КГ");
        var boxer2 = 82.7;
        System.out.println (boxer2 + " КГ");
        var boxersWeight = boxer1 + boxer2;
        System.out.println ("Общий вес боксеров " + boxersWeight + " КГ");
        var   boxerWeightDifference = boxer2 - boxer1;
        System.out.println ("Разница между весами боксеров "+ boxerWeightDifference + " КГ");


        System.out.println ("Разница между весами боксеров (способ 1) "+ (boxer2 - boxer1) + " КГ");
        System.out.println ("Разница между весами боксеров (способ 2) "+ (boxer2 % boxer1) + " КГ");

    }


}