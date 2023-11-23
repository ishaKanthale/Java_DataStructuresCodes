package Arrays;

public class PassingArraysAsArgument {

    public static void update(int marks[]) {
        // increase by 1
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {

        int marks[] = {97, 98, 99};

        update(marks);

        //  printing an array
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
