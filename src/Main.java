public class Main {
    public static void main(String[] args) {
        //2
int array [] = new array[20];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*10);
        }
        System.out.println("Початковий масив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < array.length; i+=2) {
            array[i]=0;
        }
        System.out.println("Оновлений  масив:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] +" ");
        }
}
 }
