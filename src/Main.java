import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
               int n;
               System.out.println("Lütfen sayı giriniz:");
               n = input.nextInt();
               double result = 0.0;
               for(double i=1; i<=n;i++){
                   result+=(1.0/i);

               }
System.out.println("Sonuç:"+result);





    }
}