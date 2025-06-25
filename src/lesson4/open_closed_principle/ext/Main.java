package lesson4.open_closed_principle.ext;

import lesson4.open_closed_principle.Account;
import lesson4.open_closed_principle.CheckingAccount;
import lesson4.open_closed_principle.RetirementAccount;
import lesson4.open_closed_principle.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Object[] accounts = {new SavingsAccount("1010000111",2000, "Olamide",10.0,200,10),
                new CheckingAccount("204939393",3000,"Bola Olusanya",300,20,"90929833732")};
    }
}
