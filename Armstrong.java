import java.util.Scanner;
public class Armstrong{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number;//153
        System.out.println("Enter a number:");
        number=sc.nextInt();
        int trmp;
        trmp=number;//trmp=153
        int Armstrong_=0;
        while (trmp!=0) {
            int rmd=trmp%10;//3
            Armstrong_=Armstrong_+(rmd*rmd*rmd);//0+3*3*3,27+5*5*5,152+1*1*1=153
            trmp=trmp/10;//15
        }
        if (number==Armstrong_) {//153==153
            System.out.println("IT is Armstrong number");
        } else {
            System.out.println("IT is not Armstrong number");
        }
        sc.close();
     }
}
