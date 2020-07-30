package homeworkAll.homework10Bank;
import java.util.Arrays;

/**
 * JavaAdvanced
 * 30.07.20 13: 01
 */
public class Main {
    public static void main(String[] args) {
        String[] data = {":Til Schweiger Iban:DE15971891", "AG:Macrosoft Iban:DE15978765",
                "GmbH:Pupkin SoftLab Iban:DE15954356", "e.V.:PupkinSoftLab Iban:DE15954356"};

        Account[] accounts = showAllAccount(data);
        System.out.println(Arrays.toString(accounts));
    }

    public static Account[] showAllAccount(String[] array) {
        Account[] accounts = null;

        if (array != null) {
            accounts = new Account[array.length];

            for (int i = 0; i < array.length; i++) {
                String[] clients = parser(array[i]);
                if (clients[0] != null) {
                    accounts[i] = new Account(new Private(clients[1], clients[2]), clients[3]);
                } else {
                    accounts[i] = new Account(new Corporate(clients[1]), clients[3]);
                }
            }
        }
        return accounts;
    }

    public static String[] parser(String array) {
        String[] target = array.split(":");
        String[] result = new String[4];

        for (int i = 0; i < target.length; i++) {
            String[] intermediateResult = target[i].split(" ");
            if (target[i].isEmpty()) {
                result[0] = "true";
            }

            if (intermediateResult.length > 2) {
                result[1] = intermediateResult[0];
                result[2] = intermediateResult[1];
            } else if (intermediateResult.length == 2) {
                result[1] = intermediateResult[0];
            } else {
                result[3] = intermediateResult[0];
            }
        }
//        System.out.println("----------------");
//        System.out.println(result[0]);
//        System.out.println(result[1]);
//        System.out.println(result[2]);
//        System.out.println(result[3]);
//        System.out.println("----------------");
        return result;
    }
}
