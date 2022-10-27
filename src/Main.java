public class Main {
    public static void main(String[] args)     {
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalBoxersWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + totalBoxersWeight + "кг!");
        var differentBoxerWeight = totalBoxersWeight % firstBoxerWeight;
        System.out.println("Разница веса боксеров " + differentBoxerWeight + "кг!");
        differentBoxerWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница между весом боксеров: используя вычитание - " + differentBoxerWeight + "кг!");
        differentBoxerWeight = totalBoxersWeight % firstBoxerWeight;
        System.out.println("Разница между весом боксеров: используя функцию остатка от деления - " + differentBoxerWeight + "кг!");
    }
}