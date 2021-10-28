package BasicCalculator;
/*
Реалізувати клас CustomDouble з двома полями: типу int(ціла частина) та
double (дробова частина). Перевизначити операції суми, різниці,
порівняння, equals() і hashCode(). Реалізувати метод toDouble()
 */
public class Task8 {

    public static class CustomDouble {
        int integer;
        double fraction;

        public CustomDouble() {
            this(0, 0.0);
        }

        public CustomDouble(final int integer, final double fraction) {
            setInteger(integer);
            setFraction(fraction);
        }

        public int getInteger() {
            return integer;
        }

        public double getFraction() {
            return fraction;
        }
        public int setInteger() {
            return integer;
        }

        public double setFraction() {
            return fraction;
        }

        public void setInteger(int integer) {
            this.integer = Math.abs(integer);
        }

        public void setFraction(double fraction) {
            this.fraction = fraction;
        }

        public CustomDouble suma(final CustomDouble a) {
            final CustomDouble rezultat = new CustomDouble();
            final double sum = this.toDouble() + a.toDouble();

            rezultat.integer = (int) sum;
            rezultat.fraction = sum % 1;

            return rezultat;
        }

        public CustomDouble riznytsia(final CustomDouble a) {
            final CustomDouble rezultat = new CustomDouble();

            final double minus = this.toDouble() - a.toDouble();

            rezultat.integer = (int) minus;
            rezultat.fraction = minus % 1;

            return rezultat;
        }

        public boolean bilsheRivne(final CustomDouble a) {
            return this.toDouble() >= a.toDouble();
        }

        public boolean mensheRivne(final CustomDouble a) {
            return this.toDouble() <= a.toDouble();
        }

        public boolean bilshe(final CustomDouble a) {
            return !this.mensheRivne(a);
        }

        public boolean menshe(final CustomDouble a) {
            return !this.bilsheRivne(a);
        }

        public boolean neDorivniuye(final CustomDouble a) {
            return !this.equals(a);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            CustomDouble chyslo = (CustomDouble) o;
            return this.integer == chyslo.integer && this.fraction == chyslo.fraction;
        }

        @Override
        public int hashCode() {
            return 31 * this.integer + 31 * Double.hashCode(this.fraction);
        }

        @Override
        public String toString() {
            return String.valueOf(this.toDouble());
        }

        public double toDouble() {
            double chyslo;
                if (integer < 0 && fraction < 0){}
                else if (integer < 0){ fraction *= -1;}
                else if(fraction < 0){ integer *= -1;}
                return this.integer + this.fraction;
            }
    }
}