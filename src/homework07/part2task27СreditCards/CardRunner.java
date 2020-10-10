package homework07.part2task27СreditCards;

public class CardRunner {
    public static void main(String[] args) {
        MasterVirtualCard masterVirtualCard = new MasterVirtualCard("1234 1234 5432 5436", "Sergey", "Ivanov", 321, "PriorBank", true, true, "Virtual", "USD", 5);
        System.out.println(masterVirtualCard.toString());
        System.out.println();

        MasterDebitCard masterDebitCard = new MasterDebitCard("1234 1234 5432 5436", "Sergey", "Ivanov", 321, "PriorBank", false, false, "Debit", "BYN", 10);
        System.out.println(masterDebitCard.toString());
        System.out.println();

        MasterCreditCard masterCreditCard = new MasterCreditCard("1234 1234 5432 5436", "Sergey", "Ivanov", 321, "PriorBank", false, false, "Credit", "BYN", -600, 1, 10);
        System.out.println(masterCreditCard.toString());
        System.out.println();


        VisaVirtualCard visaVirtualCard = new VisaVirtualCard("1234 1234 5432 5436", "Sergey", "Ivanov", 321, "PriorBank", true, true, "Virtual", "USD", 5);
        System.out.println(visaVirtualCard.toString());
        System.out.println();

        VisaDebitCard visaDebitCard = new VisaDebitCard("1234 1234 5432 5436", "Sergey", "Ivanov", 321, "PriorBank", false, false, "Debit", "BYN", 10);
        System.out.println(visaDebitCard.toString());
        System.out.println();

        VisaCreditCard visaCreditCard = new VisaCreditCard("1234 1234 5432 5436", "Sergey", "Ivanov", 321, "PriorBank", false, false, "Credit", "BYN", -600, 1, 10);
        System.out.println(visaCreditCard.toString());

    }
}
