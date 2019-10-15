public class MP3 implements IConnect{

    private String name;

    public MP3(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String connect() {
        return "I am connected to " + getName();
    }
}
