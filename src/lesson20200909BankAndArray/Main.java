package lesson20200909BankAndArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strings = {
                ":Til Schweiger Iban:DE15971891",
                "AG:Macrosoft Iban:DE15978765",
                "GmbH:Pupkin SoftLab Iban:DE15954356", "e.V.:PupkinSoftLab Iban:DE15954356"
        };
        Account[] accounts = Parser.parseStringArrayToAccount(strings, new ParseString());
        System.out.println(Arrays.toString(accounts));
        System.out.println("----------------");

        Account[] accounts2 = Parser.parseStringList(strings, new ParseString());
        System.out.println(Arrays.toString(accounts2));

    }
}
