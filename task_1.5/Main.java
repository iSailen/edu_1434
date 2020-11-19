import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input temperature C");
        int cels_deg = scan.nextInt();
        double f;
        f =  cels_deg*(9.0/5.0) + 32;
        System.out.println("Tempature in F");
        System.out.println(f);
    }
}
