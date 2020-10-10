package homework07.part2task26Appliances;

public class TVAudioTechnics extends LittleTechnics {

    private boolean playingAudio;
    private boolean playingVideo;
    protected int audioPowerWT;
    private String applyingFormats;

    protected TVAudioTechnics(String name, String brand, String model, boolean playingAudio, boolean playingVideo, String applyingFormats, int powerWT, int audioPowerWT) {
        super(name, brand, model, powerWT);
        this.playingAudio = playingAudio;
        this.playingVideo = playingVideo;
        this.applyingFormats = applyingFormats;
        this.audioPowerWT = audioPowerWT;
    }

    protected String checkApplyingFormats(String format) {
        if (applyingFormats.toLowerCase().contains(format.toLowerCase())) {
            return "Возможно воспроизведения формата: " + format.toLowerCase();
        }
        return "Неподдерживаемый формат: " + format.toLowerCase();
    }

    protected String getApplyingFormats() {
        return applyingFormats;
    }

    private boolean getPlayingAudio() {
        return playingAudio;
    }

    private boolean getPlayingVideo() {
        return playingVideo;
    }

    protected String playingAudio() {
        if (getPlayingAudio()) {
            return "Воспроизводит аудиоформат";
        }
        return "Не воспроизводит аудиоформат";
    }

    protected String playingVideo() {
        if (getPlayingVideo()) {
            return "Воспроизводит видеоформат";
        }
        return "Не воспроизводит видеоформат";
    }

    @Override
    public String toString() {
        return "TVAudioTechnics{" +
                "applyingForAudio=" + playingAudio() +
                ", applyingForVideo=" + playingVideo() +
                ", applyingFormats='" + getApplyingFormats() + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", powerWT=" + powerWT +
                '}';
    }
}
