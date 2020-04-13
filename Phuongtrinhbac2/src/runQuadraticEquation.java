import java.util.Scanner;

public class runQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        QuadraticEquation ptb2 = new QuadraticEquation(a,b,c);
        System.out.println(ptb2.checkRoot());
        if (ptb2.checkRoot().equals("The equation has a root")) {
            System.out.println("Root: "+ptb2.getRoot1());
        } else if ((ptb2.checkRoot().equals("The equation has 2 roots"))) {
            System.out.println("Root1: "+ptb2.getRoot1()+" and "+"Root2: "+ptb2.getRoot2());
        }
    }
}
