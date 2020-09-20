package homework07.part2task27СreditCards;

public class VisaCreditCard extends Visa {
    protected String type;
    protected String currency;
    protected int creditLimit;
    protected int cashBackPercent;
    protected int limitOperationDay;

    public VisaCreditCard(String number, String name, String surName, int cv, String affiliationBank, boolean virtual, boolean supportPayByMobilePhone,
                          String type, String currency, int creditLimit, int cashBackPercent, int limitOperationDay) {

        super(number, name, surName, cv, affiliationBank, virtual, supportPayByMobilePhone);
        this.type = type;
        this.currency = currency;
        this.creditLimit = creditLimit;
        this.cashBackPercent = cashBackPercent;
        this.limitOperationDay = limitOperationDay;
    }

    @Override
    public String toString() {
        return "VisaCreditCard{" + "'\n" +
                "type='" + type + "'\n" +
                "currency='" + currency + "'\n" +
                "creditLimit=" + creditLimit + "'\n" +
                "cashBackPercent='" + cashBackPercent + "'\n" +
                "limitOperationDay=" + limitOperationDay + "'\n" +
                "affiliationBank='" + affiliationBank + "'\n" +
                "name='" + name + " surName='" + surName + "'\n" +
                "virtual='" + getVirtual() + "'\n" +
                "supportPayByMobilePhone='" + getSupportPayByMobilePhone() + "'}";
    }
}
