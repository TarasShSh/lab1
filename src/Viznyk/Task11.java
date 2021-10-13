package Viznyk;

/*
Реалізувати ієрархію класів системи "Таксі". Перевизначити equals() i
hashCode(). Одна машина може мати кількох водіїв. Додати клас
"Замовлення (Order)" в ієрархію
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Objects;

public class Task11 {

    public class Client {
        private String name;
        private String surname;
        private String phoneNumber;
        ArrayList<Order> orders;

        public Client(final String name, final String surname, final String phoneNumber, final ArrayList<Order> orders) {
            this.name = name;
            this.surname = surname;
            this.phoneNumber = phoneNumber;
            this.orders = orders;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(final String surname) {
            this.surname = surname;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(final String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public ArrayList<Order> getOrders() {
            return orders;
        }

        public void setOrders(final ArrayList<Order> orders) {
            this.orders = orders;
        }

        public void giveOrder(final Order order) {
            orders.add(order);
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            final Client client = (Client) o;
            return Objects.equals(name, client.name) && Objects.equals(surname, client.surname) && Objects.equals(phoneNumber, client.phoneNumber) && Objects.equals(orders, client.orders);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, phoneNumber, orders);
        }
    }



    public static class Driver {
        private String name;
        private String surname;

        public Driver(final String name, final String surname) {
            this.name = name;
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(final String surname) {
            this.surname = surname;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            final Driver driver = (Driver) o;
            return Objects.equals(name, driver.name) && Objects.equals(surname, driver.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname);
        }

        @Override
        public String toString() {
            return  "Імʼя: " + this.getName() + '\n' +
                    "Прізвище: " + this.getSurname() + '\n';
        }
    }



    public static class Taxi {
        private String nameOfCar;
        private int capacity;
        private Driver[] driver;

        public Taxi(final String nameOfCar, final int capacity, final Driver[] driver) {
            this.nameOfCar = nameOfCar;
            this.capacity = capacity;
            this.driver = driver;
        }

        public String getnameOfCar() {
            return nameOfCar;
        }

        public void setnameOfCar(final String nameOfCar) {
            this.nameOfCar = nameOfCar;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(final int capacity) {
            if (capacity >= 2)
                this.capacity = capacity;
            else {
                throw new ArithmeticException("Автівка має містити щонайменше 2 місця!");
            }
        }

        public Driver[] getDriver() {
            return driver;
        }

        public void setDriver(final Driver[] driver) {
            this.driver = driver;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            final Taxi taxi = (Taxi) o;

            return capacity == taxi.capacity && Objects.equals(nameOfCar, taxi.nameOfCar) && Arrays.equals(driver, taxi.driver);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(nameOfCar, capacity);
            result = 31 * result + Arrays.hashCode(driver);
            return result;
        }

        @Override
        public String toString() {
            return  "Назва: " + nameOfCar + '\n' +
                    "Місця: " + capacity + '\n' +
                    "Водіїв " + '\n' + Arrays.toString(driver);
        }
    }



    public class Order {
        private int orderNumber;
        private int price;
        private int countOfPassengers;
        private Taxi taxiCar;
        private Client client;

        public Order(final int orderNumber, final int price, final int countOfPassengers, final Taxi taxiCar, final Client client) {
            this.orderNumber = orderNumber;
            this.price = price;
            this.countOfPassengers = countOfPassengers;
            this.taxiCar = taxiCar;
            this.client = client;
        }

        public int getOrderNumber() {
            return orderNumber;
        }

        public void setOrderNumber(final int orderNumber) {
            this.orderNumber = orderNumber;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(final int price) {
            this.price = price;
        }

        public int getCountOfPassengers() {
            return countOfPassengers;
        }

        public void setCountOfPassengers(final int countOfPassengers) {
            if(countOfPassengers == taxiCar.getCapacity() && taxiCar.getCapacity() >= 2)
                this.countOfPassengers = countOfPassengers;
            else
                throw new ArithmeticException("У автівці лише  " + taxiCar.getCapacity() + "місця");
        }

        public Taxi getTaxiCar() { return taxiCar; }

        public void setTaxiCar(final Taxi taxiCar) {
            this.taxiCar = taxiCar;
        }

        public Client getClient() {
            return client;
        }

        public void setClient(final Client client) {
            this.client = client;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;

            if (o == null || getClass() != o.getClass()) return false;

            final Order order = (Order) o;
            return orderNumber == order.orderNumber && price == order.price && countOfPassengers == order.countOfPassengers && Objects.equals(taxiCar, order.taxiCar) && Objects.equals(client, order.client);
        }

        @Override
        public int hashCode() {
            return Objects.hash(orderNumber, price, countOfPassengers, taxiCar, client);
        }
    }
}
