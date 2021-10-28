/*
Написати програму для обчислення кількості заданого символу у масиві String
 */
public class Task2 {
    public static void main(String[] args) {
        final char symbol = 'Е';

        final String[] speech = {"Вітаю!", "На моїй новій", "Еем..", "виставці?", "У будь-якому разі ..Ее, ось мій..."};

        printArray(speech);
        System.out.println("Символів знайдено: " + searchCount(speech, symbol));
    }
            public static void printArray (final String[] stringArray){
                for (int i = 0; i < stringArray.length; i++)
                    System.out.println(stringArray[i]);
            }

            public static int searchCount(final String[] stringArray, final char chr){
                int k = 0;
                for(int i = 0; i < stringArray.length; i++){
                    for(int j = 0; j < stringArray[i].length(); j++){
                        if (stringArray[i].charAt(j) == chr)
                            k++;
                    }
                }
                return k;
            }
    }