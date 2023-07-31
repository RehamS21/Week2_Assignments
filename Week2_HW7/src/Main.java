
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option =0;
        int option_2 = 0;
        int option_3 =0;
        try{
            do{
                System.out.println("Choose system: ");
                System.out.println("1. View your account system");
                System.out.println("2. View your employee system");
                System.out.println("3. Exit");

                option = input.nextInt();
                checkOption(option);

                if (option == 3) break;

                switch (option){
                    // account system
                    case 1:
                        System.out.println("Welcome to Account System");
                        Account account1 = new Account();
                        String skip_1 = input.nextLine();
                        System.out.println("Enter your name: ");
                        account1.setName(input.nextLine());
                        System.out.println("Enter your id: ");
                        account1.setId(input.nextLine());
                        System.out.println("Enter your balance: ");
                        account1.setBalance(input.nextInt());

                        do{
                            System.out.println("Choose on of these services :\n1. Credit\n2. Debit\n3. Transfer To\n4. Exit");

                            option_2 = input.nextInt();
                            checkOption_2(option_2);


                            if(option_2 == 4) break;

                            switch (option_2){
                                case 1:
                                    System.out.println("Enter amount: ");
                                    System.out.println("Your account after credit : "+ account1.credit(input.nextInt()));
                                    break;
                                case 2:
                                    System.out.println("Enter amount: ");
                                    System.out.println("Your account after debit : "+ account1.debit(input.nextInt()));
                                    break;
                                case 3:
                                    Account [] accounts = new Account[2];
                                    accounts[0] = new Account("100" , "Reham" , 45000);
                                    accounts[1] = new Account("101" , "Sara" , 50000);
                                    boolean flag = true;

                                    System.out.println("The avalible accounts : ");
                                    for (int i = 0 ; i < accounts.length ; i++)
                                        System.out.println(accounts[i].toString());
                                    String skip_2 = input.nextLine();
                                    System.out.println("Enter id from one of these accounts :");
                                    String acc= input.nextLine();
                                    System.out.println("Enter the amount");
                                    int amount = input.nextInt();

                                    for (int i = 0; i < accounts.length; i++) {
                                        if (accounts[i].getId().equals(acc)){
                                            account1.transferTo(accounts[i], amount);
                                            System.out.println("Your information after transfer");
                                            System.out.println(account1.toString());
                                            System.out.println("Your choose account after transfer");
                                            System.out.println(accounts[i].toString());
                                            flag = false;
                                            break;
                                        }
                                    }
                                    if(flag) System.out.println("Sorry, you enter invalid id account");
                                    break;
                            }
                        }while (true);
                        break;
                        // Employee system
                    case 2:
                        String skip_3= input.nextLine();
                        Employee emp1 = new Employee();
                        System.out.println("Welcome to Employee System");
                        System.out.println("Enter your name : ");
                        emp1.setName(input.nextLine());
                        System.out.println("Enter your ID : ");
                        emp1.setId(input.nextLine());
                        System.out.println("Enter your Salary : ");
                        emp1.setSalary(input.nextInt());

                        do{
                            System.out.println("Choose on of these services :\n1. Annual Salary\n2. raised salary\n3. Your information\n4.Exit");
                            option_3 = input.nextInt();
                            checkOption_2(option_3);

                            if(option_3 == 4) break;

                            switch (option_3){
                                case 1:
                                    System.out.println("Your annual salary : "+ emp1.getAnnualSalary());
                                    break;
                                case 2:
                                    System.out.println("Enter your percentage : ");
                                    int percent = input.nextInt();
                                    System.out.println("Your salary after increase : "+emp1.raisedSalary(percent));
                                    break;
                                case 3:
                                    System.out.println("Your information");
                                    System.out.println(emp1.toString());
                                    break;
                            }
                        }while (true);

                        break;
                }
            }while (true);

        }catch (InputMismatchException e1){
            System.out.println("Invalid, you must enter numbers");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }



    }

    public static void checkOption(int option) throws Exception {
        if(!(option > 0 && option < 4))
            throw new Exception("the number exceed the available options");
    }
    public static void checkOption_2(int option) throws Exception {
        if(!(option > 0 && option < 5))
            throw new Exception("the number exceed the available options");
    }
}