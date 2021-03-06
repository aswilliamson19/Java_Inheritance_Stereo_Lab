public class Stereo implements IConnect{

    private String name;
    private Radio radio;
    private CassettePlayer cassettePlayer;
    private CDPlayer cdPlayer;
    private int volume;

    public Stereo(String name, Radio radio, CassettePlayer cassettePlayer, CDPlayer cdPlayer){
        this.name = name;
        this.cassettePlayer = cassettePlayer;
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.volume = 10;
    }

    public String getName(){
        return this.name;
    }

    public String playComponent(Component component, String item){
        return component.play(item);
    }

    public int getVolume() {
        return this.volume;
    }

    public void raiseVolume(int i) {
        this.volume += i;
    }

    public void lowerVolume(int i) {
        this.volume -= i;
    }

    public String connect() {
        return "I am connected to " + getName();
    }
}
