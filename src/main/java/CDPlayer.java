import java.util.ArrayList;

public class CDPlayer extends Component {

    private String cdPlaying;

    public CDPlayer(String make, String model) {
        super(make, model);
        this.cdPlaying = cdPlaying;
    }

    public String play(String item){
        return "The CD is playing " + item;
    }

    public void switchCD(String album){
        this.cdPlaying = album;
    }

    public String getCdPlaying(){
        return this.cdPlaying;
    }
}
