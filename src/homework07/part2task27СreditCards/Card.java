package homework07.part2task27СreditCards;

abstract class Card {
    protected String number;
    protected String name;
    protected String surName;
    private int cv;

    protected Card(String number, String name, String surName, int cv) {
        this.number = number;
        this.name = name;
        this.surName = surName;
        this.cv = cv;
    }


}