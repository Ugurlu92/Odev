package TestClasses;

import bankAccount.Account;
import bankAccount.Users;

public class TransferDifferentAccount {

    public static void main(String[] args) throws InterruptedException {

        Users u1 = new Users("David" , "Villa", "01/01/2000", "married" ,1000 , 2000);

        Users u2 = new Users("Xavi" , "Hernandes", "01/01/1998", "Single" ,3000 , 2000);

        u1.transferDifferent(u1, u2, 0);

        Account difAccount=new Account();

        System.out.println(difAccount.transferOtherUser(u1, u2, 0));

        int counter=5;

        while (counter>=0) {
            System.out.print("\rYour account report is getting prepared... " + counter);
            counter--;
            Thread.sleep(1000);

        }


        System.out.println();
        System.out.println("*****************************");
        System.out.println(u1.toString());
        System.out.println("-----------------------------");
        System.out.println(u2.toString());

//        u1.amountAccount1==804
//        u2.amountAccount1==3196

    /*
       Do you want to add add your relative?
        Yes
       What is your relative name?
        Emily
       Date of birth relative?
        05/05/2002
       Do you want to transfer between your accounts or different user
        different
       Enter amount of money you want to enter
        200
    */





    /*
        name: David
        password: Villa
        dateOfBirth: You can get a credit card
        marriageStatus: Transaction done successfully
        accountNumber: 59773663
        amount in account 1 : 804
        accountNumber2: 70810832
        amount in account 2 : 2000
        relativeName: Emily
        relativeAge: 05/05/2002

        name: Xavi
        password: Hernandes
        dateOfBirth: You can get a credit card
        marriageStatus:
        accountNumber: 91077930
        amount in account 1 : 3196
        accountNumber2: 60171682
        amount in account 2 : 2000
        relativeName: null
        relativeAge: null

     */
    }
}
