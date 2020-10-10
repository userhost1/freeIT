package homework07.part2task27СreditCards;

public class MasterDebitCard extends Master {
    protected String type;
    protected String currency;
    protected int limitOperationDay;

    public MasterDebitCard(String number, String name, String surName, int cv, String affiliationBank, boolean virtual, boolean supportPayByMobilePhone,
                           String type, String currency, int limitOperationDay) {

        super(number, name, surName, cv, affiliationBank, virtual, supportPayByMobilePhone);
        this.type = type;
        this.currency = currency;
        this.limitOperationDay = limitOperationDay;
    }

    @Override
    public String toString() {
        return "MasterDebitCard{" + "'\n" +
                "type='" + type + "'\n" +
                "currency='" + currency + "'\n" +
                "limitOperationDay='" + limitOperationDay + "'\n" +
                "affiliationBank='" + affiliationBank + "'\n" +
                "number='" + number + "'\n" +
                "name='" + name + " surName='" + surName + "'\n" +
                "virtual='" + getVirtual() + "'\n" +
                "supportPayByMobilePhone='" + getSupportPayByMobilePhone() + "'}";
    }
}
