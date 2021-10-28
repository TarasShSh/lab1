package BasicCalculator;

public class Main {
    public static void main(final String[] args) {
        Task8.CustomDouble nullNumber = new Task8.CustomDouble();
        Task8.CustomDouble positiveNumber = new Task8.CustomDouble(19, 0.16);
        Task8.CustomDouble negativeNumber = new Task8.CustomDouble(-18, -0.56);

        System.out.println("===Вивід чисел===");
        System.out.println("Вивід порожнього числа: " + nullNumber.toString());
        System.out.println("Вивід додатнього числа: " + positiveNumber.toString());
        System.out.println("Вивід відʼємного числа: " + negativeNumber.toString());
        System.out.println("===Операції над числами===");
        System.out.println("Сума: 19+0.16 + (-18)+(-0.56) = " + positiveNumber.suma(negativeNumber));
        System.out.println("Різниця: -18+(-0.56) - 19+0.16 = " + negativeNumber.riznytsia(positiveNumber));
        System.out.println("===Операції порівняння===");
        System.out.println("від'ємне == додатнє: " + negativeNumber.equals(positiveNumber));
        System.out.println("від'ємне != додатнє: " + negativeNumber.neDorivniuye(positiveNumber));
        System.out.println("додатнє > від'ємне: " + positiveNumber.bilshe(negativeNumber));
        System.out.println("додатнє < від'ємне: " + positiveNumber.menshe(negativeNumber));
        System.out.println("додатнє >= від'ємне: " + positiveNumber.bilsheRivne(negativeNumber));
        System.out.println("додатнє <= від'ємне: " + positiveNumber.mensheRivne(negativeNumber));

        final Task9.Calculator calculator = new Task9.Calculator(positiveNumber.getInteger(), positiveNumber.getFraction());

        System.out.println("===Калькулятор===");
        System.out.println("Сума:    19+0.16 + (-18)+(-0.56) = " + calculator.operations('+', negativeNumber));
        System.out.println("Різниця: 19+0.16 - (-18+(-0.56)) = " + calculator.operations('-', negativeNumber));
        System.out.println("Добуток: 19+0.16 * (-18+(-0.56)) = " + calculator.operations('*', negativeNumber));
        System.out.println("Частка:  19+0.16 / (-18+(-0.56)) = " + calculator.operations('/', negativeNumber));
        System.out.println("Вводимо не дозволений символ \"₴\": ");
        System.out.println(calculator.operations('₴', negativeNumber));
        negativeNumber.setInteger(0);
        negativeNumber.setFraction(0);
        System.out.println("Ділимо на нуль: ");
        System.out.println(calculator.operations('/', negativeNumber));
    }
}