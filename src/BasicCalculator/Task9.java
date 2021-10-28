package BasicCalculator;
/*
Завдання No 9.
Реалізувати калькулятор. Якщо вхідними даними є дробові числа -
використати клас CustomDouble (при використанні методів добутку і
ділення - привести CustomDouble до Double).
 */
import BasicCalculator.Task8.CustomDouble;
public class Task9 {
    public static class Calculator extends CustomDouble {
        public Calculator() {
            this(0, 0.0);
        }

        public Calculator(final int integer, final double fraction) {
            setInteger(integer);
            setFraction(fraction);
        }
        public Calculator mnozhennia(final CustomDouble b) {
            final Calculator result = new Calculator();

            final double product = this.toDouble() * b.toDouble();
            result.integer = (int) product;
            result.fraction = product % 1;

            return result;
        }

        public Calculator dilennia(final CustomDouble b) {
            final Calculator result = new Calculator();

            if (b.toDouble() == 0) {
                throw new ArithmeticException("Ділити на нуль заборонено.");
            }
            final double division = this.toDouble() / b.toDouble();

            result.integer = (int) division;
            result.fraction = division % 1;

            return result;
        }
        public double operations(final char symbol, final CustomDouble b) {
            return switch (symbol) {
                case '+' -> this.suma(b).toDouble();
                case '-' -> this.riznytsia(b).toDouble();
                case '*' -> this.mnozhennia(b).toDouble();
                case '/' -> this.dilennia(b).toDouble();
                default -> throw new UnsupportedOperationException("Введіть один з перелічених символів операцій: \"+\" \"-\" \"*\" \"/\"");
            };
        }
    }
}