package homework07.part2task27СreditCards;

public class Visa extends Card {
    protected String affiliationBank;
    private boolean virtual;
    private boolean supportPayByMobilePhone;

    public Visa(String number, String name, String surName, int cv, String affiliationBank, boolean virtual, boolean supportPayByMobilePhone) {
        super(number, name, surName, cv);
        this.affiliationBank = affiliationBank;
        this.virtual = virtual;
        this.supportPayByMobilePhone = supportPayByMobilePhone;
    }

    protected String getVirtual() {
        if (virtual) {
            return "Virtual";
        }
        return "No Virtual";
    }

    protected String getSupportPayByMobilePhone() {
        if (supportPayByMobilePhone) {
            return "Support NFC";
        }
        return "Doesn't Support NFC";
    }
}
