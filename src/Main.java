import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        int theBiggets;
        int n1, n2, n3;

        // SCANNER
        Scanner sc = new Scanner(System.in);

        // USER'S VALUES
        System.out.print("1. Sayıyı Giriniz: ");
        n1 = sc.nextInt();

        System.out.print("2. Sayıyı Giriniz: ");
        n2 = sc.nextInt();

        System.out.print("3. Sayıyı Giriniz: ");
        n3 = sc.nextInt();

        if((n1 == n2) && (n2 == n3)){
            System.out.println("n1 = n2 = n3");
        }else if((n1 == n2) && (n2 > n3)){
            System.out.println("n1 = n2 > n3");
        }else if((n1 == n2) && (n1 < n3)){
            System.out.println("n1 = n2 < n3");
        }else if((n1 == n3) && (n3 > n2)){
            System.out.println("n1 = n3 > n2");
        }else if((n2 == n3) && (n3 > n1)){
            System.out.println("n2 = n3 > n1");
        }else{
            if((n1 > n2) && (n1 > n3)){
                if(n2 > n3){
                    System.out.println("n1 > n2 > n3");
                }else{
                    System.out.println("n1 > n3 > n2");
                }
            }else if((n2 > n1) && (n2 > n3)){
                if(n1 > n3){
                    System.out.println("n2 > n1 > n3");
                }else{
                    System.out.println("n2 > n3 > n1");
                }
            }else{
                if(n1 > n2){
                    System.out.println("n3 > n1 > n2");
                }else{
                    System.out.println("n3 > n2 > n1");
                }
            }
        }

    }
}
