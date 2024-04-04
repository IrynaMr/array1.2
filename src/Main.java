public class Main {
    public static void main(String[] args) {
         //3
        int array1[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        double mid1 = 0, mid2 = 0, mid3 = 0;
        for (int i = 0; i < 5; i++) {
            array1[i] = (int) Math.round(Math.random() * 10);
            mid1 = mid1 + array1[i];
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            array2[i] = (int) Math.round(Math.random() * 10);
            mid2 = mid2 + array2[i];
            System.out.print(array2[i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            array3[i] = (int) Math.round(Math.random() * 10);
            mid3 = mid3 + array3[i];
            System.out.println(array3[i] + " ");
        }
        System.out.println();
        System.out.println(mid1 = mid1 / 5);
        System.out.println(mid2 = mid2 / 5);
        System.out.println(mid3 = mid3 / 5);
        if (mid1 < mid2 && mid1 < mid3)
            System.out.println("mid1<mid2 && mid1<mid3");
        else if (mid1 > mid2 && mid1 > mid3)
            System.out.println("mid1>mid2 && mid1>mid3");
        else if (mid1 == mid2 && mid1 == mid3)
            System.out.println("mid1==mid2 && mid1>mid3");

        //6
        int[][] array = new int[15][];
        array[0] = new int[5];
        array[1] = new int[5];
        array[2] = new int[5];
        array[3] = new int[5];
        array[4] = new int[8];
        array[5] = new int[8];
        array[6] = new int[8];
        array[7] = new int[8];
        array[8] = new int[3];
        array[9] = new int[3];
        array[10] = new int[3];
        array[11] = new int[3];
        array[12] = new int[9];
        array[13] = new int[9];
        array[14] = new int[9];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 15);
                System.out.print(array[i][j] + " ");
            }
    }
        }}
 
