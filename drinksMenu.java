package myProjects.DrinkShop;

import java.util.*;

public class drinksMenu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String orderSummary="";
        System.out.println("*".repeat(30)+"Welcome To Cafee"+"*".repeat(30));
        do {
            components.displayMenu();
            System.out.print("Enter Your choice:");
            int choice=sc.nextInt();
            if (choice==1) {
                orderSummary+=components.billProcess("Tea");
            }
            else if (choice==2) {
                orderSummary+=components.billProcess("Coffee");
            }
            else if (choice==3) {
                orderSummary+=components.billProcess("Black Tea");
            }
            else if (choice==4) {
                orderSummary+=components.billProcess("Lemon Juice");
            }
            else if (choice==5) {
                orderSummary+=components.billProcess("Choclate Juice");
            }
            else if(choice==6){
                orderSummary+=components.billProcess("Samosa");
            }
            else if(choice==7){
                orderSummary+=components.billProcess("Bajji");
            }
            else if(choice==8){
                orderSummary+=components.subMenu("Roll");;
            }
            else if(choice==9){
                orderSummary+=components.subMenu("Puffs");;
            }
            else if(choice==10){
                orderSummary+=components.billProcess("Bread Omlette");
            }
            else if (choice==0) {
                System.out.println("\n"+orderSummary);
                sc.close();
                System.out.println("*".repeat(76)+"\n"+" ".repeat(30)+"Thanks for visting,..!!!");
                System.out.println("*".repeat(30)+" Visit Again :) "+"*".repeat(30));
                break;
            }
            else{
                System.out.println("Invalid Input");
                System.out.println("Select According to the list!!");
            }
        }while(true);
    }
}