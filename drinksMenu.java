import java.util.*;
public class drinksMenu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("***************************************************** Welcome To Swetha Cafee *****************************************************");
        System.out.println("   Menu,....!!");
        System.out.println("      1-Tea\n      2-Coffee\n      3-Black tea\n      4-Lemon juice\n      5-Chocolate juice\n      6-Exit"); 
        System.out.println("");
        String ordersummary="";
        int a=0;
        while (a==0) {
            System.out.print("Enter Your choice:");
            int x=sc.nextInt();
            if (x==1) {
                System.out.println("You have Selected Tea to Order." );

                System.out.print("confirm your order by pressing \n                  1-Confirm\n                  0-ReOrder\n Enter Here:");
                int c=sc.nextInt();   
                System.out.println(c);
                if(c==1) {
                    System.out.println("");
                    System.out.print("Enter number of Tea:");
                    int n=sc.nextInt();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("Yeah,Your order(Tea["+n+"]) has been placed!\n------Please wait for 2 mins");
                    System.out.println("Thank you,...!!!");
                    String od=String.valueOf(n);
                    ordersummary=ordersummary+"Tea--"+od;
                }
                else{
                    System.out.println("Select According to the menu list!!");
                }
            }
            else if (x==2) {
                System.out.println("You have Selected Coffee to Order." );
                System.out.print("confirm your order bye pressing \n                  1-Confirm\n                  0-ReOrder\n Enter Here:");
                int c=sc.nextInt();
                if(c==1) {
                    System.out.println("");
                    System.out.print("Enter number of Coffee:");
                    int n=sc.nextInt();
                    System.out.println("");
                    System.out.println("Yeah,Your order(Coffee["+n+"]) has been placed!\n------Please wait for 2 mins");
                    System.out.println("Thank you,...!!!");
                    String od=String.valueOf(n);
                    ordersummary=ordersummary+"\nCoffee--"+od;
                }
                else{
                    System.out.println("Select According to the menu list!!");
                }
            }
            else if (x==3) {
                System.out.println("You have Selected Black Tea to Order." );
                System.out.print("confirm your order bye pressing \n                  1-Confirm\n                  0-ReOrder\n Enter Here:");
                int c=sc.nextInt();
                if(c==1) {
                    System.out.println("");
                    System.out.print("Enter number of Black Tea:");
                    int n=sc.nextInt();
                    System.out.println("");
                    System.out.println("Yeah,Your order(Black Tea["+n+"]) has been placed!\n------Please wait for 2 mins");
                    System.out.println("Thank you,...!!!");
                    String od=String.valueOf(n);
                    ordersummary=ordersummary+"\nBlack Tea--"+od;
                }
                else{
                    System.out.println("Select According to the menu list!!");
                }
            }
            else if (x==4) {
                System.out.println("You have Selected Lemon Juice to Order." );
                System.out.print("confirm your order bye pressing \n                  1-Confirm\n                  0-ReOrder\n Enter Here:");
                int c=sc.nextInt();
                if(c==1) {
                    System.out.println("");
                    System.out.print("Enter number of Lemon Juice:");
                    int n=sc.nextInt();
                    System.out.println("");
                    System.out.println("Yeah,Your order(Lemon Juice["+n+"]) has been placed!\n------Please wait for 2 mins");
                    System.out.println("Thank you,...!!!");
                    String od=String.valueOf(n);
                    ordersummary=ordersummary+"\nLemon Juice--"+od;
                }
                else{
                    System.out.println("Select According to the menu list!!");
                }
            }
            else if (x==5) {
                System.out.println("You have Selected Chocolate Juice to Order." );
                System.out.print("confirm your order bye pressing \n                  1-Confirm\n                  0-ReOrder\n Enter Here:");
                int c=sc.nextInt();
                if(c==1) {
                    System.out.println("");
                    System.out.print("Enter number of Chocolate Juice:");
                    int n=sc.nextInt();
                    System.out.println("");
                    System.out.println("Yeah,Your order(Chocolate juice["+n+"]) has been placed!\n------Please wait for 2 mins");
                    System.out.println("Thank you,...!!!");
                    String od=String.valueOf(n);
                    ordersummary=ordersummary+"\nChocolate Juice--"+od;
                }
                else{
                    System.out.println("Select According to the menu list!!");
                }
            }
            else if (x==6) {
                System.out.println(ordersummary);
                sc.close();
                System.out.println("");
                System.out.println("Thanks for visting,..!!!");
                System.out.println("***************************************************** Visit Again :) *****************************************************");
                a=1;
            }
            else{
                System.out.println("Invalid Input");
                System.out.println("Select According to the list!!");
            }
        }   
    }
}