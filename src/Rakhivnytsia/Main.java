package Rakhivnytsia;

public class Main {
    public static void main(final String[] args) {
        Task8.CustomDouble porozhnii = new Task8.CustomDouble();
        Task8.CustomDouble dodatnii = new Task8.CustomDouble(19, 0.16);
        Task8.CustomDouble vidyemnyi = new Task8.CustomDouble(-18, -0.56);

        System.out.println("===Вивід чисел===");
        System.out.println("Вивід порожнього числа: " + porozhnii.toString());
        System.out.println("Вивід додатнього числа: " + dodatnii.toString());
        System.out.println("Вивід відʼємного числа: " + vidyemnyi.toString());
        System.out.println("===Операції над числами===");
        System.out.println("Сума: 19+0.16 + (-18)+(-0.56) = " + dodatnii.suma(vidyemnyi));
        System.out.println("Різниця: -18+(-0.56) - 19+0.16 = " + vidyemnyi.riznytsia(dodatnii));
        System.out.println("===Операції порівняння===");
        System.out.println("від'ємне == додатнє: " + vidyemnyi.equals(dodatnii));
        System.out.println("від'ємне != додатнє: " + vidyemnyi.neDorivniuye(dodatnii));
        System.out.println("додатнє > від'ємне: " + dodatnii.bilshe(vidyemnyi));
        System.out.println("додатнє < від'ємне: " + dodatnii.menshe(vidyemnyi));
        System.out.println("додатнє >= від'ємне: " + dodatnii.bilsheRivne(vidyemnyi));
        System.out.println("додатнє <= від'ємне: " + dodatnii.mensheRivne(vidyemnyi));

        final Task9.Calculator calculator = new Task9.Calculator(dodatnii.getTsila(), dodatnii.getDrobova());

        System.out.println("===Калькулятор===");
        System.out.println("Сума:    19+0.16 + (-18)+(-0.56) = " + calculator.operations('+', vidyemnyi));
        System.out.println("Різниця: 19+0.16 - (-18+(-0.56)) = " + calculator.operations('-', vidyemnyi));
        System.out.println("Добуток: 19+0.16 * (-18+(-0.56)) = " + calculator.operations('*', vidyemnyi));
        System.out.println("Частка:  19+0.16 / (-18+(-0.56)) = " + calculator.operations('/', vidyemnyi));
        System.out.println("Вводимо не дозволений символ \"₴\": ");
        System.out.println(calculator.operations('$', vidyemnyi));
        vidyemnyi.setDrobova(0);
        vidyemnyi.setTsila(0);
        System.out.println("Ділимо на нуль: ");
        System.out.println(calculator.operations('/', vidyemnyi));
    }
}