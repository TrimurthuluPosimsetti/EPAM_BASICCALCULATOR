import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    int num1=sc.nextInt();
    System.out.println("Enter the Second number:");
    int num2=sc.nextInt();
    System.out.println("Choose one options from below options:");
    System.out.println("1:Addition");
    System.out.println("2:Multiplication");
    System.out.println("3:Division");
    int funcvalue=sc.nextInt();
    if(funcvalue==1){
        addition(num1,num2);
    }
    else if(funcvalue==2){
        multiplication(num1,num2);
    }
    else if(funcvalue==3){
        division(num1,num2);
    }
    else{
      System.out.println("Invalid Option Entered");
    }    
    }

    public static void addition(int num1,int num2){
        System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
    }

    public static void multiplication(int num1,int num2){
        System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
    }

    public static void division(int num1,int num2){
        System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
    }
}
