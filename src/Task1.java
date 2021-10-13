/*
Реалізувати сортування масиву String за довжиною.
 */
public class Task1 {
    public static void main(String[] args) {
        final int[] array = {2, 1, 3};
        final String[] strArray = {"55555", "333", "1", "4444", "22"};

        for (int i = strArray.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (strArray[j].length() > strArray[j + 1].length()) {
                    String save = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = save;
                }
            }
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
