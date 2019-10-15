public class Stereo {

    private Radio radio;
    private CassettePlayer cassettePlayer;
    private CDPlayer cdPlayer;

    public Stereo(Radio radio, CassettePlayer cassettePlayer, CDPlayer cdPlayer){
        this.cassettePlayer = cassettePlayer;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
    }

    public String playComponent(Component component, String item){
        return component.play(item);
    }
}
