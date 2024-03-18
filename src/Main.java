//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1
        int a = 33;
        int b =2;
        int d =a%b;
        double c =(double)a/b;
        System.out.println(c);
        System.out.println(d);
        //2
        int x=12;
        int y=x/10;
        int n=x%10;
        int h=y+n;
        System.out.println(h);
        //3
        double g=32.5;
        int j = (int)(g+0.5);
        System.out.println("Округлене число"+j);
    }
}