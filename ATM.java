import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int balance = 1500;
    int right = 3;
        System.out.println("Enter Your User Name  : ");
    String userName = inp.nextLine();
        System.out.println("Enter Your Password : ");
        String password =inp.nextLine();

        if (userName.equals("timeless") && password.equals("perfections")){
            System.out.println("Welcome KARSEN Bank \nPlease select the action you want to taken\n");
            System.out.println("1.) Deposit\n" + "2.) Withdrawal\n" + "3.) Question Balance\n" + "4-Log Out\n");
            int select = inp.nextInt();
            switch (select){
                case 1:
                    System.out.println("Amount Of Balance");
                    int price = inp.nextInt();
                    balance += price;
                    System.out.println("Your Amount : " + balance);
                    break;
                case 2:
                    System.out.println("The amount you want to withdraw : ");
                    int withdrawMoney = inp.nextInt();
                    if (withdrawMoney > balance ){
                        System.out.println("Insufficient Balance");

                        break;}
                    else {
                        balance -= withdrawMoney;
                        System.out.println("Your Amount : "+ balance );

                    }break;
                case 3:
                    System.out.println("Your Current Balance : " + balance);
                    break;
                case 4:
                    System.out.println("Have A Nice Day, See You Again");
                    break;


            }
        }

        else {
            right --;
            System.out.println("You entered an incorrect user or password, try again.");
            if (right == 0){
                System.out.println("Your account has been blocked. Contact KARSEN Bank");
            }
        }

    }
}
