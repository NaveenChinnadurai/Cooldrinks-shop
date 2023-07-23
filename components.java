package myProjects.DrinkShop;
import java.util.Scanner;
public class components {
    public static String menuList[][]={
                                       {"Juice","Snacks"},
                                       {"1-Tea","6-Samosa"},
                                       {"2-Coffee","7.Bajji"},
                                       {"3-Black tea","8-Roll"},
                                       {"4-Lemon juice","9-Puffs"},
                                       {"5-Chocolate juice","10-Bread Omlatte"}
                                    };
    public static Scanner newin=new Scanner(System.in);

    public static void orderSuccess(String item,int n){ //orderSuccessfull message
        System.out.println("Yeah,Your order("+item+"["+n+"]) has been placed!\n------Please wait for 2 mins");
        System.out.println("Thank you,...!!!\n");
    }
    public static void orderVerification(String item){ //Order verification message
        System.out.println("\nYou have Selected "+item+" to Order.");
        System.out.println("Verify your order by entering\n"+" ".repeat(20)+"1-Confirm\n"+" ".repeat(20)+"0-ReOrder");
    }
    public static void displayMenu(){ //display items in the menu in row and column
            System.out.println(" ".repeat(35)+"Menu,....!!");
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
    public static String billProcess(String item){ //bill processing for the corresponding user input
        orderVerification(item);
        System.out.print("Enter Here:");
        int choice=newin.nextInt();
        int n=0;
        String str="";
        if(choice==1) {
            System.out.print("\nEnter number of "+item+":");
            n+=newin.nextInt();
            str+=item+"-->"+n+"\n";
            orderSuccess(item, n);
        }else{
            System.out.println("Select According to the menu list!!");
        }
        System.out.println(str);
        return str;
    }
    public static String subMenu(String item){ //Sub menu for roll and puffs
        orderVerification(item);
        System.out.print("Enter Here:");
        int choice=newin.nextInt();
        String str="";
        if(choice==1) {
            do{
                System.out.print(" 1-Veg "+item+"\n 2-Chicken "+item+"\n 0-Exit\n");
                System.out.print("Select Your favourite "+item+":");
                int subChoice=newin.nextInt();
                int n;
                if(subChoice==1){
                    System.out.print("\nEnter number of Veg "+item+":");
                    n=newin.nextInt();
                    str+="Veg "+item+"-->"+n+"\n";
                    orderSuccess(item, n);
                }else if(subChoice==2){
                    System.out.print("\nEnter number of Chicken "+item+":");
                    n=newin.nextInt();
                    str+="Chicken "+item+"-->"+n+"\n";
                    orderSuccess(item, n);
                }else if(subChoice==0){
                    break;
                }else{
                    System.out.println("Kindly Select choice from the Menu");
                }
            }while(true);
        }else{
            System.out.println("Select According to the menu list!!");
        }
        System.out.println(str);
        return str;
    }
}
