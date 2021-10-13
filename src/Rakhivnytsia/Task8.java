package Rakhivnytsia;
/*
Реалізувати клас CustomDouble з двома полями: типу int(ціла частина) та
double (дробова частина). Перевизначити операції суми, різниці,
порівняння, equals() і hashCode(). Реалізувати метод toDouble()
 */
public class Task8 {

    public static class CustomDouble {
        int tsila;
        double drobova;

        public CustomDouble() {
            this(0, 0.0);
        }

        public CustomDouble(final int tsila, final double drobova) {
            setTsila(tsila);
            setDrobova(drobova);
        }

        public int getTsila() {
            return tsila;
        }

        public double getDrobova() {
            return drobova;
        }

        public void setTsila(int tsila) {
            this.tsila = Math.abs(tsila);
        }

        public void setDrobova(double drobova) {
            this.drobova = drobova;
        }

        public CustomDouble suma(final CustomDouble a) {
            final CustomDouble rezultat = new CustomDouble();
            final double sum = this.toDouble() + a.toDouble();

            rezultat.tsila = (int) sum;
            rezultat.drobova = sum % 1;

            return rezultat;
        }

        public CustomDouble riznytsia(final CustomDouble a) {
            final CustomDouble rezultat = new CustomDouble();

            final double minus = this.toDouble() - a.toDouble();

            rezultat.tsila = (int) minus;
            rezultat.drobova = minus % 1;

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
            return this.tsila == chyslo.tsila && this.drobova == chyslo.drobova;
        }

        @Override
        public int hashCode() {
            return 31 * this.tsila + 31 * Double.hashCode(this.drobova);
        }

        @Override
        public String toString() {
            return String.valueOf(this.toDouble());
        }

        public double toDouble() {
            double chyslo;
                if (tsila < 0 && drobova < 0){}
                else if (tsila < 0){ drobova *= -1;}
                else if(drobova < 0){ tsila *= -1;}
                return this.tsila + this.drobova;
            }
    }
}