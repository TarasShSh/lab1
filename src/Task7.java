/*
Реалізувати клас User з полями firstName, lastName, age та email.
Перевизначити стандартні методи equals() та hashCode();
 */
import java.util.Objects;

public class Task7 {
    public static void main(String[] args) {
        final User h = new User();
        final User g = new User();
        h.setFirstName("Г");
        h.setLastName("Г");
        h.setEmail("Г");
        g.setLastName("Ґ");
        g.setLastName("Ґ");
        g.setEmail("Ґ");
        System.out.println( "h==g ---" + h.equals(g)+"---");
        final User eq1 = new User("Однаковий", "Однаковісінький", 1,"odn@kov.yi");
        final User eq2 = new User("Однаковий", "Однаковісінький", 1,"odn@kov.yi");
        System.out.println( "eq1==eq2 ---" + eq1.equals(eq2)+"---");
    }
    public static class User {
        private String firstName, lastName, email;
        private int age;
        public User() {
            this("Ім'ян", "Прізвищенко", 30, "п@ш.та");
        }

        public User(final String firstName, final String lastName, final int age, final String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.email = email;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public int getAge() {
            return age;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age && Objects.equals(firstName, user.firstName) && Objects.equals(lastName, user.lastName) && Objects.equals(email, user.email);
        }

        @Override
        public int hashCode() {
            return
                    47 * this.getFirstName().hashCode() +
                    47 * this.getLastName().hashCode() +
                    47 * this.getEmail().hashCode() +
                    47 * this.getAge();
        }
    }
}
