public class CassettePlayer extends Component {

    public CassettePlayer(String make, String model) {
        super(make, model);
    }

    public String play(String item){
        return "The cassette is playing " + item;
    }
}
