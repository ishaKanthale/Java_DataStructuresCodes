package Searching;

public class LinearSearch {

    public static int linearSearch(int numbers[], int key) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(String menu[], String item) {

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 18;

        System.out.println(linearSearch(numbers, key));

        String menu[] = {"dosa", "chole bhature", "samosa"};
        String item = "samosa";

        System.out.println(linearSearch(menu, item));
    }
}
