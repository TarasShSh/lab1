/*
Почергово записати масив int та масив char в одну String. Приклад виводу,
"1e8t8c7b2"
 */
public class Task3 {
    public static void main(String[] args) {
        int[] intArr = {  1,   2,   3,   4,   5};
        char[] chrArr = {'а', 'б', 'в', 'г', 'ґ'};
        System.out.println(Combine(intArr, chrArr));
    }

    public static String Combine(int[] intArr, char[] chrArr) {
     String both = "";
        for (int i = 0; (i < intArr.length) || (i < chrArr.length); i++) {
            if (i < intArr.length) both += intArr[i];
            if (i < chrArr.length) both += chrArr[i];
        }
     return both;
    }
}