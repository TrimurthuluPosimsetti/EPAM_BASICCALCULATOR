import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the first number:");
    //reading the integer value
    int num1=sc.nextInt();
    System.out.println("Enter the Second number:");
    //reading the integer value
    int num2=sc.nextInt();
    System.out.println("Choose one options from below options:");
    System.out.println("1:Addition");
    System.out.println("2:Multiplication");
    System.out.println("3:Division");
    //reading the integer value which represents Addition or  Multiplication or Division
    int funcvalue=sc.nextInt();
    if(funcvalue==1){
        //calling the simpleInterest function
        addition(num1,num2);
    }
    else if(funcvalue==2){
        //calling the simpleInterest function
        multiplication(num1,num2);
    }
    else if(funcvalue==3){
        //calling the simpleInterest function
        division(num1,num2);
    }
    else{
      System.out.println("Invalid Option Entered");
    }
    }
    /*
      This function is used to calculates the addition of two numbers
    */
    public static void addition(int num1,int num2){
        System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
    }
    /*
      This function is used to calculates the multiplication of two numbers
    */
    public static void multiplication(int num1,int num2){
        System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
    }
    /*
      This function is used to calculates the division of two numbers
    */
    public static void division(int num1,int num2){
        System.out.println("Division of "+num1+" and "+num2+" is "+(num1/num2));
    }
}
