import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double principal;
        double rate;
        int timescompounded;
        int years;
        double amount;
        System.out.println("Enter the principal amount");
        principal =sc.nextDouble();
        System.out.println("Enter the interest rate in(%)");
        rate = sc.nextDouble()/100;
        System.out.println("Enter the # of times compounded per year; ");
        timescompounded = sc.nextInt();
        System.out.println("enter the # of years");
        years = sc.nextInt();
        amount = principal * Math.pow(1+rate/timescompounded,timescompounded*years);
        System.out.println("The amount after "+years+" is:$"+amount);
        sc.close();
    }
}