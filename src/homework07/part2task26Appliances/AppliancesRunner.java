package homework07.part2task26Appliances;

public class AppliancesRunner {
    public static void main(String[] args) {

        ClimatTechnics conditioner = new ClimatTechnics(30, 90, "Кондиционер", "LG", "CF281200", 1200, 28, 1, true);
        System.out.println(conditioner.toString());
        System.out.println(conditioner.checkState());
        System.out.println(conditioner.turnOn());
        System.out.println(conditioner.checkState());
        System.out.println(conditioner.turnOff());

        KitchenTechnics microWave = new KitchenTechnics(25, 35, "Микроволновая печь", "Samsung", "123", 1800, true);
        System.out.println(microWave.toString());
        System.out.println(microWave.informationCooking());
        System.out.println(microWave.canFit(26, 36));

        TVAudioTechnics tv = new TVAudioTechnics("Телевизор", "Toshiba", "321", true, true, "mp1 mp2 mp3 wav wma mpeg4 avi mp4", 200, 20);
        System.out.println(tv.toString());
        System.out.println(tv.checkApplyingFormats("mp3"));
        System.out.println(tv.checkApplyingFormats("mkv"));

        TVAudioTechnics vinyl = new TVAudioTechnics("Виниловый проигрыватель", "Technics", "SL1210MK5", true, false, "vinyl", 100, 5);
        System.out.println(vinyl.toString());
        System.out.println(vinyl.checkApplyingFormats("wav"));

        HouseTechnics robotVacuumCleaner = new HouseTechnics("Робот пылесос", "Miele", "bestEverModel", 50);
        System.out.println(robotVacuumCleaner.toString());
        System.out.println(robotVacuumCleaner.checkState());
        System.out.println(robotVacuumCleaner.turnOn());
        System.out.println(robotVacuumCleaner.checkState());
        System.out.println(robotVacuumCleaner.turnOff());


    }
}
