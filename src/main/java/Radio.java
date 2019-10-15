public class Radio extends Component{

    public Radio(String make, String model) {
        super(make, model);
    }

    public String play(String item) {
        return "You are tuning into " + item;
    }
}
