package myProjects.DrinkShop;
import java.util.Scanner;
public class components {
    public static Scanner newin=new Scanner(System.in);
    public static void displayMenu(){
            System.out.println("*".repeat(30)+"Welcome To Cafee"+"*".repeat(30));
            System.out.println(" ".repeat(35)+"Menu,....!!");
            String menuList[][]=new String[6][2];
            menuList[0][0]="Juice";
            menuList[0][1]="Snacks";
            menuList[1][0]="1-Tea";
            menuList[1][1]="6-Samosa";
            menuList[2][0]="2-Coffee";
            menuList[2][1]="7.Bajji";
            menuList[3][0]="3-Black tea";
            menuList[3][1]="8-Roll";
            menuList[4][0]="4-Lemon juice";
            menuList[4][1]="9-Puffs";
            menuList[5][0]="5-Chocolate juice";
            menuList[5][1]="10-Bread Omlatte";
            System.out.println(" ".repeat(20)+menuList[0][0]+" ".repeat(30-menuList[0][0].length())+menuList[0][1]+"\n");
            for (int i=1;i<menuList.length;i++) {
                System.out.print(" ".repeat(20));
                for (int j =0;j<menuList[i].length;j++) {
                    System.out.print(menuList[i][j]+" ".repeat(30-menuList[i][j].length()));
                }
                System.out.println();
            }
            System.out.println(" ".repeat(35)+"Enter 0 to Exit");
        }
    public static void billProcess(String item){
        System.out.println("You have Selected "+item+" to Order.");
        System.out.println("confirm your order by pressing \n"+" ".repeat(20)+"1-Confirm\n"+" ".repeat(20)+"0-ReOrder");
        System.out.print("Enter Here:");
        int choice=newin.nextInt();
        if(choice==1) {
            System.out.print("\nEnter number of "+item+":");
            int n=newin.nextInt();
            System.out.println("Yeah,Your order("+item+"["+n+"]) has been placed!\n------Please wait for 2 mins");
            System.out.println("Thank you,...!!!\n");
        }else{
            System.out.println("Select According to the menu list!!");
        }
    }
    public static void subMenu(int num){
        String item="";
        if(num==1){
            item="Roll";
        }else{
            item="Puffs";
        }
        System.out.println("You have Selected "+item+" to Order.");
        System.out.println("confirm your order by pressing \n"+" ".repeat(20)+"1-Confirm\n"+" ".repeat(20)+"0-ReOrder");
        System.out.print("Enter Here:");
        int choice=newin.nextInt();
        if(choice==1) {
            do{
                System.out.print("\n 1-Veg "+item+"\n 2-Chicken "+item+"\n 3-mushroom "+item+"\n 0-Exit\n");
                System.out.print("Select Your favourite"+item+":");
                int subChoice=newin.nextInt();
                if(subChoice==1){
                    System.out.print("\nEnter number of Veg"+item+":");
                    int n=newin.nextInt();
                    System.out.println("Yeah,Your order(Veg "+item+"["+n+"]) has been placed!\n------Please wait for 2 mins");
                    System.out.println("Thank you,...!!!\n");
                }else if(subChoice==2){
                    System.out.print("\nEnter number of Chicken "+item+":");
                    int n=newin.nextInt();
                    System.out.println("Yeah,Your order(Chicken "+item+"["+n+"]) has been placed!\n------Please wait for 2 mins");
                    System.out.println("Thank you,...!!!\n");                
                }else if(subChoice==3){
                    System.out.print("\nEnter number of mushroom "+item+":");
                    int n=newin.nextInt();
                    System.out.println("Yeah,Your order(Mushroom "+item+"["+n+"]) has been placed!\n------Please wait for 2 mins");
                    System.out.println("Thank you,...!!!\n");
                }else if(subChoice==0){
                    break;
                }else{
                    System.out.println("Kindly Select choice from the Menu");
                }
            }while(true);
        }else{
            System.out.println("Select According to the menu list!!");
        }
    }
}
