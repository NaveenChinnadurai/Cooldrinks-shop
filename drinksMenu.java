package myProjects.DrinkShop;

import java.util.*;

public class drinksMenu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ordersummary="";
        do {
            components.displayMenu();
            System.out.print("Enter Your choice:");
            int choice=sc.nextInt();
            if (choice==1) {
                components.billProcess("Tea");
            }
            else if (choice==2) {
                components.billProcess("Coffee");
            }
            else if (choice==3) {
                components.billProcess("Black Tea");
            }
            else if (choice==4) {
                components.billProcess("Lemon Juice");
            }
            else if (choice==5) {
                components.billProcess("Choclate Juice");
            }
            else if(choice==6){
                components.billProcess("Samosa");
            }
            else if(choice==7){
                components.billProcess("Bajji");
            }
            else if(choice==8){
                components.subMenu(1);;
            }
            else if(choice==9){
                components.subMenu(0);;
            }
            else if(choice==10){
                components.billProcess("Bread Omlette");
            }
            else if (choice==0) {
                System.out.println(ordersummary);
                sc.close();
                System.out.println("\nThanks for visting,..!!!");
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